package Practica9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Lexico {

	Tablas tokens;
	int indice;
	String linea;
	char car;
	int tab;//tabla 
	

	public Lexico() {
		tokens = new Tablas();
	
		indice = 0;

	}

	public Tablas getListaDeTokens() {
		return tokens;
	}

	

	public void iniciar(String linea, int numeroDeLinea) {
		tokens.setNumeroDeLinea(numeroDeLinea);
		
		indice = 0;
		this.linea = linea;
		while (indice < linea.length()) {
			q0();
		}
	}

	private void q0() {
		String cadena = linea.charAt(indice) + "";
		indice++;
		switch (cadena) {
		case "	":
			break;
		case " ":
			break;
		case "    ":
			break;
		case "+":
			tokens.add(cadena, -202, -2);
			break;
		case "-":
			q2(linea, cadena);
			break;
		case "*":
			tokens.add(cadena, -204, -2);
			break;
		case "/":
			tokens.add(cadena, -203, -2);
			break;
		case "<":
			q9(cadena);
			break;
		case ">":
			q9(cadena);
			break;
		case "=":
			q9(cadena);
			break;
		case "&":

			q10(cadena);
			break;
		case "|":

			q11(cadena);
			break;
		case "!":
			tokens.add(cadena, -403, -2);
			break;
		case "(":
			tokens.add(cadena, -601, -2);
			break;
		case ")":
			tokens.add(cadena, -602, -2);
			break;
		case ";":
			tokens.add(cadena, -603, -2);
			break;
		case ",":
			tokens.add(cadena, -604, -2);
			break;
		case "[":
			tokens.add(cadena, -605, -2);
			break;
		case "]":
			tokens.add(cadena, -606, -2);
			break;
		case ".":

			q14(cadena);
			break;
		case ":":
			q9(cadena);
			break;
		case "\\":
			q6(cadena);
			break;
		default:
			if (Character.isDigit(cadena.charAt(0))) {
				q3(cadena, -800);
			} else if (Character.isAlphabetic(cadena.charAt(0))) {
				q12(cadena);
			} else {
				q13(cadena);
			}
			break;
		}
	}

	private void q1(String cadena) {
		if (indice != linea.length()) {
			for (indice = indice; indice < linea.length(); indice++) {
				car = linea.charAt(indice);
				
				if (Character.isAlphabetic(car)) {
					cadena += car + "";
					

				}
				if (Character.isDigit(car)) {
					cadena += car + "";
					

				} else {
					break;
				}
			}
		}
		if (cadena.length() <= 6) {
			tokens.add(cadena, -100, -1);
		} else {
			tokens.add(cadena, 1, 0);
		}

	}

	private void q2(String linea, String cadena) {
		if (indice < linea.length()) {
			car = linea.charAt(indice);
			if (Character.isDigit(car)) {

				indice++;
				cadena += car + "";
				q3(cadena, -800);
			} else {
				tokens.add(cadena, -201, -2);
			}
		} else {
			tokens.add(cadena, -201, -2);
		}
	}

	private void q3(String cadena, int token) {
		if (indice < linea.length()) {
			for (indice = indice; indice < linea.length(); indice++) {
				car = linea.charAt(indice);
				if (Character.isDigit(car)) {
					cadena += car + "";
				} else if (car == '.') {
					indice++;
					token += -100;
					cadena += car + "";
					q4(cadena, token);
					return;
				} else {
					tokens.add(cadena, token, -2);
					break;
				}
			}
		} else {
			tokens.add(cadena, -800, -2);
		}
	}

	private void q4(String cadena, int token) {
		if (indice < linea.length()) {
			car = linea.charAt(indice);
			if (Character.isDigit(car)) {
				indice++;
				cadena += car + "";
				q5(cadena, token);
			} else {
				q13(cadena);
			}
		} else {
			q13(cadena);
		}
	}

	private void q5(String cadena, int token) {
		if (indice < linea.length()) {
			for (indice = indice; indice < linea.length(); indice++) {
				car = linea.charAt(indice);
				if (Character.isDigit(car)) {
					cadena += car + "";
				} else if (car == '.') {
					indice++;
					cadena += car + "";
					q15(cadena);
					break;
				} else {

					break;
				}
			}

		} else {
			tokens.add(cadena, token, -2);
		}
	}

	private void q6(String cadena) {
		if (indice < linea.length()) {
			car = linea.charAt(indice);
			if (car == '"') {
				indice++;
				cadena += car + "";
				q7(cadena);
			}
			if (car == '\\') {
				
				q16(cadena);
			}
		} else {
			tokens.add(cadena, 0, 0);
		}

	}

	private void q7(String cadena) {
		if (indice < linea.length()) {
			for (indice = indice; indice < linea.length(); indice++) {
				car = linea.charAt(indice);
				cadena += car + "";
				if (car == '"') {
					indice++;
					break;
				}
			}
			q8(cadena);
		} else {
			tokens.add(cadena, 1, 0);
		}
	}

	private void q8(String cadena) {
		if (indice < linea.length()) {
			car = linea.charAt(indice);
			cadena += car;
			indice++;
			if (car == ' ') {
				tokens.add(cadena, -1000, -2);
			}

			else {
				q7(cadena);
			}
		} else {
			tokens.add(cadena, 1, 0);
		}
	}

	// operadores Racionales
	private void q9(String cadena) {
		if (indice < linea.length()) {
			car = linea.charAt(indice);
			indice++;
			if (car == '=') {
				cadena += car + "";
				if (cadena.equals("<=")) {
					tokens.add(cadena, -303, -2);
				} else if (cadena.equals(">=")) {
					tokens.add(cadena, -304, -2);
				}  else if (cadena.equals(":=")) {
					tokens.add(cadena, -609, -2);
				} else {
					q13(cadena);

				}

			} else {
				indice--;
				if (cadena.equals("<")) {
					tokens.add(cadena, -301, -2);
				} else if (cadena.equals(">")) {
					tokens.add(cadena, -302, -2);
				} else if (cadena.equals("=")) {
					tokens.add(cadena, 1, 0);
				} else if (cadena.equals(":")) {
					tokens.add(cadena, -610, -2);

				} else {
					q13(cadena);
				}
			}
		} else {
			if (cadena.equals("<")) {
				tokens.add(cadena, -301, -2);
			} else if (cadena.equals(">")) {
				tokens.add(cadena, -302, -2);
			} else if (cadena.equals("=")) {
				tokens.add(cadena, 1, 0);
			} else {
				q13(cadena);
			}
		}

	}

	// operador logico
	private void q10(String cadena) {
		if (indice < linea.length()) {
			cadena += linea.charAt(indice) + "";
			indice++;
			if (cadena.equals("&&")) {
				tokens.add(cadena, -401, -2);
			} else {
				q13(cadena);
			}
		} else {
			q13(cadena);
		}
	}

	// operador logico
	private void q11(String cadena) {
		if (indice < linea.length()) {
			cadena += linea.charAt(indice) + "";
			indice++;
			if (cadena.equals("||")) {
				tokens.add(cadena, -402, -2);
			} else {
				q13(cadena);
			}
		} else {
			q13(cadena);
		}
	}

	// Palabras reservadas
	private void q12(String cadena) {
		if (indice < linea.length()) {
			for (indice = indice; indice < linea.length(); indice++) {
				car = linea.charAt(indice);
				if (Character.isAlphabetic(car)) {
					cadena += car+"";
					
				} else {
					break;
				}
			}
			switch (cadena) {
			case ("prog"):
				tokens.add(cadena, -501, -2);
				break;
			case ("inicio"):
				tokens.add(cadena, -502, -2);
				break;
			case ("fin"):
				tokens.add(cadena, -503, -2);
				break;
			case ("var"):
				tokens.add(cadena, -504, -2);
				break;
			case ("proc"):
				tokens.add(cadena, -505, -2);
				break;
			case ("entero"):
				tokens.add(cadena, -506, -2);
				break;
			case ("real"):
				tokens.add(cadena, -507, -2);
				break;
			case ("string"):
				tokens.add(cadena, -508, -2);
				break;
			case ("limpiar"):
				tokens.add(cadena, -509, -2);
				break;
			case ("si"):
				tokens.add(cadena, -510, -2);
				break;
			case ("sino"):
				tokens.add(cadena, -511, -2);
				break;
			case ("vexy"):
				tokens.add(cadena, -512, -2);
				break;
			case ("leer"):
				tokens.add(cadena, -513, -2);
				break;
			case ("escribir"):
				tokens.add(cadena, -514, -2);
				break;
			case ("repite"):
				tokens.add(cadena, -515, -2);
				break;
			case ("hasta"):
				tokens.add(cadena, -516, -2);
				break;
			case ("mientras"):
				tokens.add(cadena, -517, -2);
				break;
			case ("ejecuta"):
				tokens.add(cadena, -518, -2);
				break;
			case ("and"):
				tokens.add(cadena, -519, -2);
				break;
			case ("or"):
				tokens.add(cadena, -520, -2);
				break;
			default:
				q1(cadena);
				break;
			}
		}
	}

	private void q13(String cadena) {
		tokens.add(cadena, 1, 0);
	}
//Despues del punto hay numero 
	private void q14(String cadena) {
		if (indice < linea.length()) {
			for (indice = indice; indice < linea.length(); indice++) {
				car = linea.charAt(indice);
				cadena += car + "";
				if (Character.isDigit(car)) {
					indice++;
					break;
				}
			}
			q13(cadena);
		} else {
			tokens.add(cadena, -607, -2);
		}
	}
//comenatarios
	private void q15(String cadena) {
		if (indice < linea.length()) {
			for (indice = indice; indice < linea.length(); indice++) {
				car = linea.charAt(indice);
				
				cadena += car + "";
			
				if (car == '\n') {
					indice++;
					break;
				}
			}

			q13(cadena);
		}
	}

	private void q16(String cadena) {
		if (indice < linea.length()) {
			for (indice = indice; indice < linea.length(); indice++) {
				
				car = linea.charAt(indice);
				
				if(Character.isAlphabetic(car)){
				cadena += car + "";
				if (car == '\n') {
					indice++;
					break;
				}
				}
				
			}tokens.add(cadena, -700, 0);

			
		}

		else {
			q13(cadena);
		}
	}

	public String tablaDeTokens() {
		String output = "";
		output += "TABLA DE TOKENS\n";
		output += String.format("%1$23s   %2$20s   %3$20s   %4$20s \n", "Cadena", "Token", "Tabla", "Linea");
		output += tokens.toString() + "\n";
		return output;
	}

	@Override
	public String toString() {
		return tablaDeTokens();
	}

	public static void main(String[] args) {
		File f;
		FileReader fr;
		BufferedReader br;
		Lexico afd = new Lexico();

		try {
			int numeroDeLinea = 0;
			f = new File("programa.txt");
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			while (br.ready()) {
				numeroDeLinea++;
				afd.iniciar(br.readLine(), numeroDeLinea);
			}
			System.out.println(afd.toString());
			FileWriter fw = new FileWriter(new File("tabla de tokens.txt"));
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(afd.tablaDeTokens());
			bw.flush();
			bw.close();
			fw.close();

			System.out.println("archivo guardado");
		} catch (IOException ex) {
			System.out.println("Error al abrir el archivo");
		} catch (Exception ex) {
		}
	}

	public class Tablas {

		public class Token {

			private int token;
			private String cadena;
			private int linea;
			private int tab;

			public Token() {
			}

			public Token(int token, String cadena, int numeroDeLinea, int tab) {
				this.token = token;
				this.cadena = cadena;
				this.linea = numeroDeLinea;
				this.tab = tab;
			}

			public void setToken(int token) {
				this.token = token;
			}

			public void setCadena(String cadena) {
				this.cadena = cadena;
			}

			public void setNumeroDeLinea(int numeroDeLinea) {
				this.linea = numeroDeLinea;
			}

			public void setTab(int tab) {
				this.tab = tab;
			}

			public int getToken() {
				return token;
			}

			public String getCadena() {
				return cadena;
			}

			public int getLinea() {
				return linea;
			}

			public int getTab() {
				return tab;
			}

			public String toString() {

				return token + " " + cadena + " " + linea + " " + tab;
			}
		}

		private List<Token> listOfTokens;
		private int linea;

		public Tablas() {
			listOfTokens = new LinkedList<Token>();
		}

		public void add(String cadena, int token, int tab) {
			listOfTokens.add(new Token(token, cadena, linea, tab));
		}

		public void setNumeroDeLinea(int numeroDeLinea) {
			this.linea = numeroDeLinea;
		}

		public int size() {
			return listOfTokens.size();
		}

		public Token getToken(int i) {
			return listOfTokens.get(i);
		}

		public String toString() {
			String output = "";
			for (int i = 0; i < listOfTokens.size(); i++) {
				Token token = (Token) listOfTokens.get(i);
				output += String.format("( %1$20s   %2$20s   %3$20s   %4$20s )\n", token.getCadena(), token.getToken(),
						token.getTab(), token.getLinea());
			}
			return output;
		}
	}
}
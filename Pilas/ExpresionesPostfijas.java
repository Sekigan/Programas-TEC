package Pilas;

import java.util.ArrayDeque;
import java.io.*;
import javax.swing.JOptionPane;

public class ExpresionesPostfijas {

	public static boolean esOperador(String s) {
		if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		File ArchivoR= new File("docR.txt");
		FileOutputStream fos = new FileOutputStream (ArchivoR);
		PrintWriter printWriter = new PrintWriter  (fos);
		
		File archivo = null;
		
		FileReader fr = null;
		BufferedReader br = null;
		String expresion = "";
		int n2;
		int n1;
		archivo = new File("doc.txt");
		fr = new FileReader(archivo);
		br = new BufferedReader(fr);
		ArrayDeque<String> pila = new ArrayDeque<String>();
		
		
			while ((br.ready())) {

				expresion = br.readLine();
				JOptionPane.showMessageDialog(null, expresion);
				String[] arrayElementos = expresion.split(",");

				for (int i = 0; i<arrayElementos.length; i++) {
					if (!esOperador(arrayElementos[i])) {
						pila.push(arrayElementos[i]);

					} else {

						String operador = arrayElementos[i];
						n2 = (Integer.parseInt((String) pila.pop()));
						n1 = (Integer.parseInt((String) pila.pop()));
						if (operador.equals("+")) {
							int x = (n1 + n2);
							pila.push(String.valueOf(x));

						} else if (operador.equals("-")) {
							int x = (n1 - n2);
							pila.push(String.valueOf(x));
						} else if (operador.equals("*")) {
							int x = (n1 * n2);
							pila.push(String.valueOf(x));

						} else if (operador.equals("/")) {
							int x = (n1 / n2);
							pila.push(String.valueOf(x));

						}

						
						// "+", "-", "*", "/"
					}
					
				}
				String res = pila.pop();
				JOptionPane.showMessageDialog(null, "Resultado :"+ res); //pila.toString()+"\n");

				printWriter.println(expresion +"--->"+ res);
				//abrir rchivo para escritura
				
				
				

			}
			printWriter.close();
		
		 
			br.close();
		}

	}

	


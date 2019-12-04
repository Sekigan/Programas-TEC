package PracticasU2;

import javax.swing.JOptionPane;

public class Practica10 {
	public static void main(String[] args) {
		String frase;
		char c = 0;
		PilaChar pilaLetras = new PilaChar(30);
		PilaChar pilaNumero = new PilaChar(30);
		PilaChar pilaSimbolos = new PilaChar(30);

		int opcion, i;

		String menu = "             MENU DE OPCIONES \n";
		menu += "1.  Leer un enunciado \n";
		menu += "2.  Mostrar Pila de letras\n";
		menu += "3.  Mostrar Pila de numeros\n";
		menu += "4.  Mostrar pila de simbolos\n";
		menu += "5.  Salir \n";

		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (opcion) {
			case 1:
				pilaLetras = new PilaChar(30);
				pilaNumero = new PilaChar(30);
				pilaSimbolos = new PilaChar(30);
				
				frase = JOptionPane.showInputDialog("Dame la frase");
				for (i = 0; i < frase.length(); i++) {
					c = frase.charAt(i);
					if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
						pilaLetras.insertar(c);
					} else if (c >= '0' && c <= '9') {
						pilaNumero.insertar(c);
					} else
						pilaSimbolos.insertar(c);
				}

				break;
			case 2:
				if (pilaLetras.estaVacia()) {
					JOptionPane.showMessageDialog(null, "Esta Vacia la pila");
				} else {
				JOptionPane.showMessageDialog(null, "Pila de Letras\n" + pilaLetras.toString());
				}
				break;
			case 3:
				if (pilaNumero.estaVacia()) {
					JOptionPane.showMessageDialog(null, "Esta Vacia la pila");
				} else {
				JOptionPane.showMessageDialog(null, "Pila de Numeros\n" + pilaNumero.toString());
				}
				break;
			case 4:
				if (pilaSimbolos.estaVacia()) {
					JOptionPane.showMessageDialog(null, "Esta Vacia la pila");
				} else {
				JOptionPane.showMessageDialog(null, "Pila de Simbolos\n" + pilaSimbolos.toString());
				}
				break;
			case 5:
				
				JOptionPane.showMessageDialog(null, "Fin del Programa");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opción NO válida");
				break;

			} // FIN DEL SWITCH

		} while (opcion != 5);
	}

}

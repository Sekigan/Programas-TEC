package PracticasU2;

import javax.swing.JOptionPane;

public class Practica9 {
	public static void main(String[] args) {
		PilaString palVocal = new PilaString(15);
		PilaString palConsonante = new PilaString(15);
		int opcion;
		String palabra;
		char inicial;

		// VARIABLE String DONDE SE VAN ARMANDO LAS OPCIONES DEL MENU
		String menu = "             MENU DE OPCIONES \n";
		menu += "1.  Insertar una Palabra \n";
		menu += "2.  Mostrar Pila de palabras que inician con una vocal \n";
		menu += "3.  Mostrar Pila de palabras que inician con una consonante \n";
		menu += "4.  Eliminar una palabra de la pila de palabras con vocal \n";
		menu += "5.  Eliminar una palabbra de la pila de palabras con consonante \n";
		menu += "6.  Cuantas palabras hay en ambas pilas \n";
		menu += "7.  Salir";

		// CICLO ITERATIVO QUE PRESENTA EL MENU DE OPCIONES HASTA QUE EL USUARIO
		// SELECCIONE LA OPCION 5

		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcion) {
			case 1:
				palabra = (JOptionPane.showInputDialog("Dame la palabra ")).toLowerCase();
				inicial = palabra.charAt(0);
				if (inicial == 'a' || inicial == 'e' || inicial == 'i' || inicial == 'o' || inicial == 'u') {

					palVocal.insertar(palabra);
				} else {

					palConsonante.insertar(palabra);
				}

				break;
			case 2:
				if (palVocal.estaVacia()) {
					JOptionPane.showMessageDialog(null, "Esta Vacia la pila");
				} else {
					JOptionPane.showMessageDialog(null, "Pila de vocales\n" + palVocal.toString());
				}
				break;
			case 3:
				if (palConsonante.estaVacia()) {
					JOptionPane.showMessageDialog(null, "Esta Vacia la pila");
				} else {
					JOptionPane.showMessageDialog(null, "Pila de consonantes\n" + palConsonante.toString());
				}
				break;
			case 4:
				if (!palVocal.estaVacia()) {
					
					JOptionPane.showMessageDialog(null,
							"Datos eliminados de la pila de palabras con vocal \n" + palVocal.eliminar());
				} else {
					JOptionPane.showMessageDialog(null, "Pila vacia no se puede eliminar");
				}
				break;

			case 5:
				if (!palConsonante.estaVacia()) {
					JOptionPane.showMessageDialog(null,
							"Datos eliminados de la pila de palabras con consonante \n" + palConsonante.eliminar());
					
				} else {
					JOptionPane.showMessageDialog(null, "Pila vacia no se puede eliminar");
				}
				break;
			case 6:
				JOptionPane.showMessageDialog(null,
						"numero de elementos de la  pila de vocales \n" + palVocal.numElementos() + "\n"
								+ "Numero de elementos de la pila consonates \n" + palConsonante.numElementos());
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "Fin del Programa");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opción NO válida");
				break;

			} // FIN DEL SWITCH

		} while (opcion != 7); // FIN DEL D0..WHILE

	} // FIN DEL METODO main

}

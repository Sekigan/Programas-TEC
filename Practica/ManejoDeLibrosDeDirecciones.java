package Practica;

import javax.swing.JOptionPane;

public class ManejoDeLibrosDeDirecciones {

	public static void main(String args[]) {

		// DECLARACION DE VARIABLES
		LibroDeDirecciones obj = new LibroDeDirecciones(
				Integer.parseInt(JOptionPane.showInputDialog("Cuantas personas va a Ingresar ")));

		int opcion;

		// VARIABLE String DONDE SE VAN ARMANDO LAS OPCIONES DEL MENU
		String menu = "             MENU DE OPCIONES \n";
		menu += "1.  Agrega  a las personas a la lista \n";
		menu += "2.  Quieres borrar a  alguien de la lista ? \n";
		menu += "3.   Buscar a alguien ?\n";
		menu += "4.  Quieres saber cual es la persona mayor? \n";
		menu += "5.   Que lista de genero quieres mostrar \n";
		menu += "6.    Salir \n";

		// CICLO ITERATIVO QUE PRESENTA EL MENU DE OPCIONES HASTA QUE EL USUARIO
		// SELECCIONE LA OPCION 6
		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu)); /*SE CAPTURA DEL TECLADO UN ENTERO (NUMERO DE LA OPCION)*/

			switch (opcion) {
			case 1:
				obj.agregar();

				break;
			case 2:

				String nombre = JOptionPane.showInputDialog(null, "Dame el nombre de quien quieras borrar");
				int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el edad de quien quieras borrar"));
				char genero = JOptionPane.showInputDialog(null, "Dame el genero de quien quieras borrar").charAt(0);
				obj.borrar(new Persona(nombre, edad, genero));
				break;
			case 3:
				nombre = JOptionPane.showInputDialog(null, "Dame el nombre de quien quieras buscar");
				edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el edad de quien quieras buscar"));
				genero = JOptionPane.showInputDialog(null, "Dame el genero de quien quieras buscar").charAt(0);
				obj.buscar(new Persona(nombre, edad, genero));
				JOptionPane.showMessageDialog(null, "si  esta");
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "La persona mayor es " + obj.mayor());

				break;
			case 5:

				char generoDato = JOptionPane.showInputDialog(null, "Lista de Genero Masculio o Femenino").charAt(0);
				obj.mensaje(generoDato);

				break;

			case 6:
				JOptionPane.showMessageDialog(null, "Adios c:");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opción NO válida");
				break;

			} // FIN DEL SWITCH

		} while (opcion != 6); // FIN DEL D0..WHILE

	} // FIN DEL METODO main

}
// La lista muestra de datos etc

package PracticasU4;

import javax.swing.JOptionPane;

public class Practica16 {

	public static void main(String[] args) {
		int opcion, totalOpciones, nc;
		String nom;
		float calif;
		NodoAlumno nodo;
		// VARIABLE String DONDE SE VAN ESPECIFICANDO LAS OPCIONES DEL MENU
		String menu = "             MENU DE OPCIONES \n";
		menu += "1.  Insertar un alumno \n";
		menu += "2.  Mostrar lista de alumnos de 5to. \n";
		menu += "3.  Promedio del grupo \n";
		menu += "4.  Nombres de alumnos reprobados  \n";
		menu += "5.  Salir \n";

		totalOpciones = 5;

		ListaAlumnos grupo5to = new ListaAlumnos();

		do {
			// SE CAPTURA DEL TECLADO UN ENTERO (NUMERO DE LA OPCION)
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcion) {
			case 1:
				nc = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de control"));
				nom = JOptionPane.showInputDialog("Dame el nombre de el Alumno").toUpperCase();
				calif = Float.parseFloat(JOptionPane.showInputDialog("Dame la calificacion"));
				nodo = new NodoAlumno(nc, nom, calif); // Se crea el nodo
				grupo5to.insertaInicio(nodo); // Se inserta el nodo en la Lista
				break;
			case 2:
				JOptionPane.showMessageDialog(null, grupo5to.toString());
				break;
			case 3:
				JOptionPane.showMessageDialog(null,"Promedio del Grupo"+"\n"+ grupo5to.promedio());
				break;
			case 4:
				JOptionPane.showMessageDialog(null, grupo5to.reprobados());
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Fin del Programa");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opción NO válida");
				break;

			} // FIN DEL SWITCH

		} while (opcion != totalOpciones); // FIN DEL DO..WHILE
	}
}

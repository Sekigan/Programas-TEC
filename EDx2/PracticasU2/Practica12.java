package PracticasU2;

import javax.swing.JOptionPane;

public class Practica12 {
	public static void main(String[] args) {

		int opcion;

		String menu = "             MENU DE OPCIONES \n";
		menu += "1.  Insertar un Alumno \n";
		menu += "2.  Mostrar todos los alumnos de la SISTEMAS\n";
		menu += "3.  Mostrar todos los alumnos de la INDUSTRIAL\n";
		menu += "4.  Eliminar un alumno de SISTEMAS\n";
		menu += "5.  Vaciar la Pila de alumnos de INDUSTRIAL\n";
		menu += "6.  Aumentar un 5 puntos a los alumnos de SISTEMAS\n";
		menu += "7.  Desplegar promedio de CADA PILA de alumnos\n";
		menu += "8.  Desplegar nombres de alumnos reprobados de INDUSTRIAL\n";
		menu += "9.  Salir \n";

		PilaAlumnos Sistemas = new PilaAlumnos(10);
		PilaAlumnos Industrial = new PilaAlumnos(10);
		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (opcion) {
			case 1:
				String nombre = JOptionPane.showInputDialog("Dame el nombre del Alumno");
				double calif = Double.parseDouble(JOptionPane.showInputDialog("Dame la Calificacion"));
				int grupo = Integer.parseInt(JOptionPane.showInputDialog("Dame el grupo del Alumno"));
				Alumno alumno = new Alumno(nombre, calif, grupo);

				if (grupo % 2 == 0) {
					Sistemas.insertar(alumno);
				} else
					Industrial.insertar(alumno);

				break;
			case 2:
				if (Sistemas.estaVacia()) {
					JOptionPane.showMessageDialog(null, "SISTEMAS VACIO");
				} else {
					JOptionPane.showMessageDialog(null, "SISTEMAS \n" + Sistemas.toString());
				}
				break;
			case 3:
				if (Industrial.estaVacia()) {
					JOptionPane.showMessageDialog(null, "INDUSTRIAL VACIO");
				} else {
					JOptionPane.showMessageDialog(null, "INDUSTRIAL \n" + Industrial.toString());
				}
				break;
			case 4:
				if (Sistemas.estaVacia()) {
					JOptionPane.showMessageDialog(null, "SISTEMAS VACIO");
				} else {
					JOptionPane.showMessageDialog(null, "Alumno de SISTEMAS eliminado \n" + Sistemas.eliminar());
				}
				break;
			case 5:
				if (Industrial.estaVacia()) {
					JOptionPane.showMessageDialog(null, "INDUSTRIAL VACIO");
				} else {

					while (!Industrial.estaVacia()) {
						JOptionPane.showMessageDialog(null, "INDUSTRIAL ELIMINADO" + Industrial.eliminar());
					}
				}
				break;
			case 6:
				if (Sistemas.estaVacia()) {
					JOptionPane.showMessageDialog(null, "SISTEMAS VACIO ");
				} else {
					Sistemas.aumenta5pts();
					JOptionPane.showMessageDialog(null, "Se Aumento 5 pts en SISTEMAS\n" + Sistemas.toString());
				}
				break;
			case 7:
				if (Sistemas.estaVacia()  && Industrial.estaVacia()) {
					JOptionPane.showMessageDialog(null, "SISTEMAS VACIO e INDUSTRIAL VACIO ");
				} else {

					JOptionPane.showMessageDialog(null, " Promedio de los grupos \n" + "SISTEMAS : "
							+ Sistemas.promedio() + "\n INDUSTRIAL : " + Industrial.promedio());
				}
				break;
			case 8:
				if (Industrial.estaVacia()) {
					JOptionPane.showMessageDialog(null, "INDUSTRIAL ESTA VACIO");
				} else {

					JOptionPane.showMessageDialog(null, "Reprobados INDUSTRIAL" + Industrial.reprobadosIN());
				}

				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Fin del Programa");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opción NO válida");
				break;

			} // FIN DEL SWITCH

		} while (opcion != 9);
	}
}

package Practica;

import javax.swing.JOptionPane;

public class AppListadoAlumno {

	private Alumno[] alumnos;

	public AppListadoAlumno(int n) {

		alumnos = new Alumno[n];
	}

	public void crearAlumnos() throws EdadException {

		for (int indice = 0; indice < alumnos.length; indice++) {

			String nombre = (JOptionPane.showInputDialog("Inserta el nombre de la persona ").toUpperCase());
			String apellido_p = (JOptionPane.showInputDialog("Ingresa los Apellidos Paterno ").toUpperCase());
			String apellido_m = (JOptionPane.showInputDialog("Ingresa los Apellidos Materno").toUpperCase());

			do {
				try {
					int edad = (Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad").toUpperCase()));
					alumnos[indice] = new Alumno(nombre, apellido_p, apellido_m, edad);
					break;
				}

				catch (EdadException e) {

					JOptionPane.showMessageDialog(null, "Edad no valida");
				}
			} while (true);

			do {
				int resp = JOptionPane.showConfirmDialog(null, "Quieres agregar otra materia?", "Nombre de la materia",
						JOptionPane.YES_NO_OPTION);
				if (resp == JOptionPane.YES_OPTION) {

					String asignatura = JOptionPane.showInputDialog(null, "Escriba la asignatura que cursa ")
							.toUpperCase();

					int calificacion = 0;

					try {
						
						calificacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba la calificacion  "));
						alumnos[indice].agregarAsgn(new Asignatura(asignatura, calificacion));

						resp = JOptionPane.showConfirmDialog(null, "Quieres agregar otra materia?",
								"Nombre de la materia", JOptionPane.YES_NO_OPTION);
						break;

					} catch (NumberFormatException e) {

						JOptionPane.showMessageDialog(null, "Solo numeros validos");

					}

				}
				while (true);

			} while (true);
		}
	}

	public String toString() {
		String cadena = "";
		for (int i = 0; i < alumnos.length; i++) {
			cadena += alumnos[i].toString() + "\n";
		}
		// escribir
		return cadena;
	}

	public static void main(String[] args) throws EdadException {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Cuantos Alumnos Ingresara?"));

		AppListadoAlumno obj = new AppListadoAlumno(n);
		obj.crearAlumnos();

		JOptionPane.showMessageDialog(null, "Datos" + obj.toString());
	}
}

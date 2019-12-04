package Excepcion;

import javax.swing.JOptionPane;

public class AppPrecios {
	public static void main(String[] args) throws RangoDePrecioExcepcion, GradoEscolarException {
		double precio;
		int gradoEscolar;
		do {
			try {
				precio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio de un cuaderno"));
				if (precio < 1.0 || precio > 300.00) {
					throw new RangoDePrecioExcepcion();
				}
				break;
			} catch (RangoDePrecioExcepcion e) {
				JOptionPane.showMessageDialog(null, "Rango valido para el precio de 1 a 300");
			}
		} while (true);
		do {
			try {
				gradoEscolar = Integer.parseInt(JOptionPane.showInputDialog("Ingresa grado escolar"));
				if (gradoEscolar < 1 || gradoEscolar > 13) {
					throw new GradoEscolarException();
				}
				break;
			} catch (GradoEscolarException e) {
				JOptionPane.showMessageDialog(null,
						"Rango valido para el grado escolar" + "\n1-6 anios para primaria" + "\n1-3 anios para secu"
								+ "\n1-3 anios ó 1-6 semestres para prepa"
								+ "\n1-5 anios ó 1-13 semestres para carrera");
			}
		} while (true);
	}
}

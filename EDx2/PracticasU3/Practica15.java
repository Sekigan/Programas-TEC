package PracticasU3;

import javax.swing.JOptionPane;

public class Practica15 {
	public static void main(String[] args) {
		ColaLibros novela = new ColaLibros(8);
		ColaLibros misterio = new ColaLibros(8);

		int opcion;

		String menu = "             MENU DE OPCIONES \n";
		menu += "1.  Insertar Libro\n";
		menu += "2.  Mostrar Libros de Novelas\n";
		menu += "3.  Mostrar Libros de Misterios\n";
		menu += "4.  Eliminar TODAS las novelas\n";
		menu += "5.  Suma TOTAL de precios\n";
		menu += "6.  Modificar precio de libros de misterio\n";
		menu += "7.  Salir\n";

		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (opcion) {
			case 1:

				String titulo = JOptionPane.showInputDialog("Dame el nombre del TITULO").toUpperCase();
				String autor = (JOptionPane.showInputDialog("Dame el nombre del AUTOR")).toUpperCase();
				int numPaginas = Integer.parseInt(JOptionPane.showInputDialog("Dame el NUMERO DE PAGINAS"));
				float precio = Float.parseFloat(JOptionPane.showInputDialog("Dame el precio del LIBRO"));
				Libro l = new Libro(titulo, autor, numPaginas, precio);
				if (precio <= 300f) {
					misterio.insertar(l);
				} else
					novela.insertar(l);

				break;
			case 2:
				if (novela.estaVacia()) {
					JOptionPane.showMessageDialog(null, "COLA DE NOVELAS VACIAS");
				} else {
					JOptionPane.showMessageDialog(null, "NOVELAS \n" + novela.toString());
				}
				break;
			case 3:
				if (misterio.estaVacia()) {
					JOptionPane.showMessageDialog(null, "COLA DE MISTERIO VACIA");
				} else {
					JOptionPane.showMessageDialog(null, "MISTERIO\n" + misterio.toString());
				}
				break;
			case 4:
				if (novela.estaVacia()) {
					JOptionPane.showMessageDialog(null, "COLA DE NOVELAS VACIAS");
				} else {
					{
						for (int i = novela.getFrente(); i <= novela.getFin(); i++) {
							JOptionPane.showMessageDialog(null, "NOVELA ELIMINADA \n" + novela.titulo());
							novela.eliminar();
						}
					}
				}
				break;
			case 5:
				if (novela.estaVacia() && misterio.estaVacia()) {
					JOptionPane.showMessageDialog(null, "COLAS VACIAS");
				} else {
					float preciof = (novela.suma() + misterio.suma());
					JOptionPane.showMessageDialog(null, "SUMA TOTAL DE LOS PRECIOS \n" + "NOVELAS : " + novela.suma()
							+ "\nMISTERIOS: " + misterio.suma() + "\nSUMA DE NOVELAS Y MISTERIOS : " + preciof);

				}
				break;
			case 6:
				if (misterio.estaVacia()) {
					JOptionPane.showMessageDialog(null, "COLA MISTERIO VACIA");
				} else {

					JOptionPane.showMessageDialog(null,
							"SE AUMENTO 5% EN LIBROS DE MISTERIO EN LIBROS QUE TENGAN MENOS DE 100 PAGINAS\n"
									+ misterio.aumenta5());
				}
				break;

			case 7:
				JOptionPane.showMessageDialog(null, "Fin del Programa");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opción NO válida");
				break;

			} // FIN DEL SWITCH

		} while (opcion != 7);

	}
}

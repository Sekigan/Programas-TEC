package PracticasU2;

import javax.swing.JOptionPane;

public class Practica11 {
	public static void main(String[] args) {
		PilaArticulo Papeleria = new PilaArticulo(15);
		int opcion;

		String menu = "             MENU DE OPCIONES \n";
		menu += "1.  Insertar un articulo \n";
		menu += "2.  Mostrar todos los articulos de la PAPELERIA\n";
		menu += "3.  Eliminar un articulo \n";
		menu += "4.  Mostrar el inventario total de la PAPELERIA\n";
		menu += "5.  Mostrar el articulo mas caro\n";
		menu += "6.  Aumentar un 20% el precio de todos los articulos\n";
		menu += "7.  Mostrar articulos con cantidad < a 15\n";
		menu += "8.  Vaciar la pila de Articulos de PAPELERIA\n";
		menu += "9.  Salir \n";

		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (opcion) {
			case 1:
				String descripcion = JOptionPane.showInputDialog("Dame la descripcion del articulo");
				int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Dame la cantidad del articulo"));
				float precio = Float.parseFloat(JOptionPane.showInputDialog("Dame el precio del articulo"));
				Articulo art = new Articulo(descripcion, cantidad, precio);
				Papeleria.insertar(art);
				
				break;
			case 2:
				if (Papeleria.estaVacia()) {
					JOptionPane.showMessageDialog(null, "Esta Vacia la pila");
				} else {
					JOptionPane.showMessageDialog(null, "Pila Papeleria\n" + Papeleria.toString());
				}
				break;
			case 3:
				if (Papeleria.estaVacia()) {
					JOptionPane.showMessageDialog(null, "NO HAY ARTICULOS PARA ELIMINAR");
				} else {
					JOptionPane.showMessageDialog(null, "Eliminar articulo \n" + Papeleria.eliminar());
				}
				break;
			case 4:
				if (Papeleria.estaVacia()) {
					JOptionPane.showMessageDialog(null, "LA PAPELERIA ESTA VACIA ");
				} else {
					JOptionPane.showMessageDialog(null, "Inventario total\n" + Papeleria.inventarioTotal());
				}
				break;
			case 5:
				if (Papeleria.estaVacia()) {
					JOptionPane.showMessageDialog(null, "LA PAPELERIA ESTA VACIA ");
				} else {
					JOptionPane.showMessageDialog(null, "Articulo mas caro" + "\n" + Papeleria.mayorPrecio());
				}
				break;
			case 6:
				if (Papeleria.estaVacia()) {
					JOptionPane.showMessageDialog(null, "LA PAPELERIA ESTA VACIA ");
				} else {
					Papeleria.aumenta20porc();
					JOptionPane.showMessageDialog(null, "El precio se aumento 20%\n" + Papeleria.toString());
				}
				break;
			case 7:
				if (Papeleria.estaVacia()) {
					JOptionPane.showMessageDialog(null, "LA PAPELERIA ESTA VACIA ");
				} else {
					Papeleria.aumenta20porc();
					JOptionPane.showMessageDialog(null,
							" Articulos con cantidad < a 15 \n" + Papeleria.articulosMenor15());
				}
				break;
			case 8:
				if (Papeleria.estaVacia()) {
					JOptionPane.showMessageDialog(null, "LA PAPELERIA ESTA VACIA ");
				} else {

					while (!Papeleria.estaVacia()) {
						JOptionPane.showMessageDialog(null, "Articulo Eliminado" + Papeleria.eliminar());
					}
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

package PracticasU3;

import javax.swing.JOptionPane;

public class Practica13 {
	public static void main(String[] args) {
		ColaString nombresAN = new ColaString(20);
		ColaString nombresOZ = new ColaString(20);

		int opcion;

		String menu = "             MENU DE OPCIONES \n";
		menu += "1.  Capturar un Nombre \n";
		menu += "2.  Mostrar nombres entre A a N\n";
		menu += "3.  Mostrar nombres entre O a Z\n";
		menu += "4.  Eliminar un nombre entre A a N\n";
		menu += "5.  Eliminar un nombre entre O a Z\n";
		menu += "6.  Salir";

		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (opcion) {
			case 1:
				String nombre = JOptionPane.showInputDialog("Dame el nombre").toUpperCase();
				char c = nombre.charAt(0);

				if (c >= 'A' && c <= 'N') {
					nombresAN.insertar(nombre);
				} else {
					nombresOZ.insertar(nombre);
				}

				break;
			case 2:
				if (nombresAN.estaVacia()) {
					JOptionPane.showMessageDialog(null, "Esta Cola Esta Vacia");
				} else {
					JOptionPane.showMessageDialog(null, "Nombres entre A a N \n" + nombresAN.toString());
				}
				break;
			case 3:
				if (nombresOZ.estaVacia()) {
					JOptionPane.showMessageDialog(null, "Esta Cola Esta Vacia");
				} else {
					JOptionPane.showMessageDialog(null, "Pila de Numeros\n" + nombresOZ.toString());
				}
				break;
			case 4:
				if (nombresAN.estaVacia()) {
					JOptionPane.showMessageDialog(null, "Esta Cola Esta Vacia");
				} else {
					
					
						JOptionPane.showMessageDialog(null, "Nombre Eliminado\n" + nombresAN.eliminar());
					
				}
				break;
			case 5:
				if (nombresOZ.estaVacia()) {
					JOptionPane.showMessageDialog(null, "Esta Cola Esta Vacia");
				} else {
					
						JOptionPane.showMessageDialog(null, "Nombre Eliminado\n" + nombresOZ.eliminar());
					
				}

				break;

			case 6:
				JOptionPane.showMessageDialog(null, "Fin del Programa");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opción NO válida");
				break;

			} // FIN DEL SWITCH

		} while (opcion != 6);
	}
}

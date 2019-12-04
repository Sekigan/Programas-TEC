package PracticasU3;

import javax.swing.JOptionPane;

public class Practica14 {

	public static void main(String[] arg) {
		int opcion;
		int caja = 300;
		int cont = 0;

		String menu = "             MENU DE OPCIONES \n";
		menu += "1.  Entrada de un auto \n";
		menu += "2.  Lavar el siguiente auto\n";
		menu += "3.  Mostrar lista de automoviles \n";
		menu += "4.  Reporte financiero \n";
		menu += "5.  Salir  \n";

		ColaAutos autolavado = new ColaAutos(7);

		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (opcion) {
			case 1:
				if (autolavado.estaLlena()) {
					JOptionPane.showMessageDialog(null,
							"LO SENTIMOS EL AUTOLAVADO ESTA LLENO Y POR EL MOMENTO NO PODEMOS ATENDERLE ");
				} else {
					String placa = JOptionPane.showInputDialog("Dame la placa del auto");
					String propietario = JOptionPane.showInputDialog("Dame el nombre del propietario ");
					Automovil auto = new Automovil(placa, propietario);
					autolavado.insertar(auto);

				}
				break;

			case 2:

				if (!autolavado.estaVacia()) {
					JOptionPane.showMessageDialog(null, "SE ESTA LAVANDO EL AUTO \n" + autolavado.eliminar());
					cont++;
					caja += 65;
				} else if (autolavado.estaVacia())
					JOptionPane.showMessageDialog(null, "NO HAY AUTOS POR LAVAR");

				break;

			case 3:
				if (autolavado.estaVacia())
					JOptionPane.showMessageDialog(null, "DE MOMENTO NO HAY AUTOMOVIL EN ESPERA");

				else
					JOptionPane.showMessageDialog(null, "Datos del vehiculo" + autolavado.toString());
				break;

			case 4:
				JOptionPane.showMessageDialog(null, "AUTOS LAVADOS EN EL DIA :" + cont
						+ "\nDINERO EN CAJA :" + caja);
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Fin del Programa");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opción NO válida");
				break;

			}

		} while (opcion != 5);

	}
}

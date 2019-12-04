package ExamenU3;

import javax.swing.JOptionPane;

public class Examen3 {
	public static void main(String[] args) {

		ColaPaises sudAmerica = new ColaPaises(20);

		int opcion;

		String menu = "             MENU DE OPCIONES \n";
		menu += "1.  Insertar un pais \n";
		menu += "2.  Mostrar paises sudamericanos\n";
		menu += "3.  Eliminar un País \n";
		menu += "4.  Mostrar ingreso total de Sudamerica \n";
		menu += "5.  Aumentar Impuesto de un País \n";
		menu += "6.  Salir \n";

		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (opcion) {
			case 1:
				if (sudAmerica.estaLlena()) {
					JOptionPane.showMessageDialog(null, "Cola de Sudamerica esta llena");
				} else {
					String nombre = JOptionPane.showInputDialog("Dame el nombre del Pais").toUpperCase();
					String capital = JOptionPane.showInputDialog("Dame el nombre de la Capital");
					int numEstados = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de estados"));
					float impuesto = Float.parseFloat(JOptionPane.showInputDialog("Dame el impuesto"));
					Pais pais = new Pais(nombre, capital, numEstados, impuesto);
					sudAmerica.insertar(pais);
				}
				break;

			case 2:

				if (sudAmerica.estaVacia()) {
					JOptionPane.showMessageDialog(null, "COLA SUDAMERICA VACIA");

				} else
					JOptionPane.showMessageDialog(null, "PAISES SUDAMERICANOS \n" + sudAmerica.toString());

				break;

			case 3:
				if (sudAmerica.estaVacia())
					JOptionPane.showMessageDialog(null, "COLA SUDAMERICA VACIA");

				else
					JOptionPane.showMessageDialog(null, "PAIS ELIMINADO\n" + sudAmerica.paisN());
				sudAmerica.eliminar();
				break;

			case 4:
				if (sudAmerica.estaVacia())
					JOptionPane.showMessageDialog(null, "COLA SUDAMERICA VACIA");
				else
					JOptionPane.showMessageDialog(null, "INGRESO TOTAL POR IMPUESTOS :" + sudAmerica.ingresoT());
				break;
			case 5:
				if (sudAmerica.estaVacia()) {
					JOptionPane.showMessageDialog(null, "COLA SUDAMERICA VACIA");
				} else {
					String paisI = JOptionPane.showInputDialog(
							"Dame el nombre del pais que deseas Aumentar el impuesto un 20%\n"+"Lista Paises\n" + sudAmerica.listaP())
							.toUpperCase();
					sudAmerica.aumenta20(paisI);
					JOptionPane.showMessageDialog(null,
							"Se aumento 20% de Impuestos al Pais\n" + sudAmerica.paisImp20(paisI));
				}
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "Fin del Programa");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opción NO válida");
				break;

			}

		} while (opcion != 6);

	}
}

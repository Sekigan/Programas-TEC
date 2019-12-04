package ExamenU2;

import javax.swing.JOptionPane;

public class ExamenUnidad2 {
	public static void main(String[] args) {
		int opcion;

		String menu = "             MENU DE OPCIONES \n";
		menu += "1.  Insertar Vuelo \n";
		menu += "2.  Mostrar todos los Vuelos Nacionales\n";
		menu += "3.  Mostrar todos los Vuelos Extranjeros\n";
		menu += "4.  Eliminar todos los vuelos nacionales\n";
		menu += "5.  Suma TOTAL de precios\n";
		menu += "6.  Modificar precio de un Vuelo Extranjero\n";
		menu += "7.  Mostrar Vuelos de Monterrey\n";
		menu += "8.  Salir\n";

		PilaVuelos Extranjero = new PilaVuelos(9);
		PilaVuelos Nacional = new PilaVuelos(9);

		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (opcion) {
			case 1:
				String ciudadOrigen = JOptionPane.showInputDialog("Dame el nombre de la Ciudad de Origen")
						.toUpperCase();
				String ciudadDestino = (JOptionPane.showInputDialog("Dame el nombre de la Ciudad de Destino"))
						.toUpperCase();
				float precio = Float.parseFloat(JOptionPane.showInputDialog("Dame el precio del VUELO"));
				Vuelo vuelo = new Vuelo(ciudadOrigen, ciudadDestino, precio);

				if (precio >= 8500f) {
					Extranjero.insertar(vuelo);
				} else
					Nacional.insertar(vuelo);

				break;
			case 2:
				if (Nacional.estaVacia()) {
					JOptionPane.showMessageDialog(null, "VUELOS NACIONALES VACIO");
				} else {
					JOptionPane.showMessageDialog(null, "VUELOS NACIONALES \n" + Nacional.toString());
				}
				break;
			case 3:
				if (Extranjero.estaVacia()) {
					JOptionPane.showMessageDialog(null, "VUELOS EXTRANJEROS VACIO");
				} else {
					JOptionPane.showMessageDialog(null, "VUELOS EXTRANJEROS \n" + Extranjero.toString());
				}
				break;
			case 4:
				if (Nacional.estaVacia()) {
					JOptionPane.showMessageDialog(null, "VUELOS NACIONALES VACIO");
				} else {
					while (!Nacional.estaVacia()) {
						JOptionPane.showMessageDialog(null, "VUELOS NACIONALES ELIMINADOS \n" + Nacional.eliminar());
					}
				}
				break;
			case 5:
				if (Nacional.estaVacia() && Extranjero.estaVacia()) {
					JOptionPane.showMessageDialog(null, "VUELOS VACIOS");
				} else {
					float vuelos = (Nacional.vuelosSuma() + Extranjero.vuelosSuma());
					JOptionPane.showMessageDialog(null,
							"SUMA TOTAL DE LOS PRECIOS \n" + "NACIONALES : " + Nacional.vuelosSuma()
									+ "\nEXTRANJEROS : " + Extranjero.vuelosSuma()
									+ "\nSUMA DE NACIONALES Y EXTRANJEROS : " + vuelos);

				}
				break;
			case 6:
				if (Extranjero.estaVacia()) {
					JOptionPane.showMessageDialog(null, "VUELOS EXTRANJEROS VACIOS");
				} else {
					String ciudadDestinoMod = JOptionPane
							.showInputDialog("Ingresa el destino del VUELO que desea modificar su precio \n"+"Vuelos Modificables"
									+ Extranjero.listaExtranjeros())
							.toUpperCase();
					Extranjero.aumenta580(ciudadDestinoMod);
					JOptionPane.showMessageDialog(null,
							"Se Aumento 580 en el VUELO EXTRANJERO\n" + Extranjero.toString());
				}
				break;
			case 7:
				if (Nacional.estaVacia()) {
					JOptionPane.showMessageDialog(null, "VUELOS NACIONALES VACIO");
				} else {

					JOptionPane.showMessageDialog(null,
							"VUELOS QUE SALEN DE MONTEREY DESTINO : \n" + Nacional.vuelosMTY());
				}
				break;
			case 8:
				JOptionPane.showMessageDialog(null, "Fin del Programa");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opción NO válida");
				break;

			} // FIN DEL SWITCH

		} while (opcion != 8);

	}
}

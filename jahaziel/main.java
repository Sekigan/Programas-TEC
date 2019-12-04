package jahaziel;



import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) {
		int opcion;
		
		String menu = "             MENU DE OPCIONES \n";
		menu += "1.  Insertar TIPO \n";
		menu += "2.  Mostrar todos TIPOS\n";
		menu += "3.  Eliminar todos lo TIPOS\n";
		menu += "4.  Sacar K\n";
		menu += "5.  Sacar Diametro\n";
		menu += "6.  Salir\n";

		tiposs t= new tiposs(7);
		

		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (opcion) {
			case 1:
				
				String tipo = JOptionPane.showInputDialog("Dame el nombre de la marca???")
						.toUpperCase();
				float longitud= Float.parseFloat(JOptionPane.showInputDialog("Dame la longitud en valor FT"));
						
				float resistividad= Float.parseFloat(JOptionPane.showInputDialog("Dame resistividad"));
				float temperatura= Float.parseFloat(JOptionPane.showInputDialog("Dame la temperatura"));
				tipos1 x = new tipos1(tipo,longitud,resistividad,temperatura);
				t.insertar(x);
				
				break;
			case 2:
				if (t.estaVacia()) {
					JOptionPane.showMessageDialog(null, "INGRESE LOS TIPOS");
				} else {
					JOptionPane.showMessageDialog(null, "TIPOS \n" + t.toString());
				}
				break;
			case 3:
				
			
				if (t.estaVacia()) {
					JOptionPane.showMessageDialog(null, "TIPOS VACIO");
				} else {
					while (!t.estaVacia()) {
						JOptionPane.showMessageDialog(null, "TIPOS \n" + t.eliminar());
					}
				}
				break;
			case 4:
			
				
				break;
			case 5:
				
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

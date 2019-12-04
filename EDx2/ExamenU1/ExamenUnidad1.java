package ExamenU1;

import javax.swing.JOptionPane;

/*
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 20 DE SEPTIEMBRE DEL 2017
 */
public class ExamenUnidad1 {
	public static void main(String[] args) {
		String titulo, autor;
		float precio;
		float suma = 0;
		int i;
		// Inciso A)
		Libro[] lib = new Libro[8];
		// Inciso B)
		lib[7] = new Libro("Game Of Thrones", "George", 800f);
		// Inciso C)
		for (i = 0; i < lib.length; i += 2) {
			titulo = JOptionPane.showInputDialog("Dame el titulo del libro").toUpperCase();
			autor = JOptionPane.showInputDialog("Dame el nombre del autor").toUpperCase();
			precio = Float.parseFloat(JOptionPane.showInputDialog("Dame el precio del libro"));
			lib[i] = new Libro(titulo, autor, precio);
		}
		// Inciso D)
		for (i = 0; i < lib.length; i++) {
			if (lib[i] != null) {
				JOptionPane.showMessageDialog(null, lib[i].toString());

			} else {
				JOptionPane.showMessageDialog(null, "El LIBRO del indice  [ " + i + " ] no existe");
			}
		}
		//Inciso E)
		for (i = 0; i < lib.length; i++) {
			if (lib[i] != null) {
				suma+=lib[i].getPrecio();
			}
		}
		JOptionPane.showMessageDialog(null, "La Suma del precio de los libros es: "+suma);
		//Inciso F)
		for (i = 0; i < lib.length; i++) {
			if (lib[i] != null) {
				if (lib[i].getTitulo().equals("EL PRINCIPITO")) {
					JOptionPane.showMessageDialog(null, "SE CAMBIO EL PRECIO DEL LIBRO EL PRINCIPITO");
					lib[i].setPrecio(lib[i].getPrecio()+200);
				} 
			}
		}
		//Inciso G)
		String s="LIBROS \n";
		for (i = 0; i < lib.length; i++) {
			if (lib[i] != null) {
				JOptionPane.showMessageDialog(null, lib[i].toString());

			} else {
				JOptionPane.showMessageDialog(null, "El LIBRO del indice  [ " + i + " ] no existe");
			}
			s +="\n Libros:["+i+"] "+"\n"+lib[i]+"\n";
		}
		JOptionPane.showMessageDialog(null, s);
		
}}

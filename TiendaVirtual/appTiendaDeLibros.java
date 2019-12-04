package TiendaVirtual;

import javax.swing.JOptionPane;

public class appTiendaDeLibros {
	static TiendaDeLibros obj = new TiendaDeLibros();
	static CarroDeCompras obj1 = new CarroDeCompras();
	// aqui no entiendo por que me forza a poner el static al declarar un objeto
	// de la clase

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "       El Programa Empezara Agregando los Libros al Catalago");

		int seguir = 0;

		do {
			String titulo = JOptionPane
					.showInputDialog(null, "Titulo de el libro", "AGREGA TITULO", JOptionPane.QUESTION_MESSAGE)
					.toUpperCase();
			String ISBN = JOptionPane.showInputDialog(null, "ISBN de el libro", "ISBN", JOptionPane.QUESTION_MESSAGE)
					.toUpperCase();
			int precio = Integer.parseInt(JOptionPane.showInputDialog(null, "Agrega el Precio de el Libro", "PRECIO"));

			Libro libro = new Libro(titulo, ISBN, precio);
			obj.agregarLibroAlCatalogo(libro);

			seguir = JOptionPane.showConfirmDialog(null, "Desea Agregar mas Libros?", "Continuar?",
					JOptionPane.YES_NO_OPTION);
			;

		} while (seguir != JOptionPane.NO_OPTION);

		JOptionPane.showMessageDialog(null, "CATALOGO\n" + obj.getCatalogo());

		int opcion = JOptionPane.showConfirmDialog(null, "Desea Modificar algo?", "Continuar?",
				JOptionPane.YES_NO_OPTION);
		while (opcion == JOptionPane.YES_OPTION) {

			int opcionMod = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Que desea realizar? " + "\n1) Agregar" + "\n2) Buscar", " Opcion", JOptionPane.QUESTION_MESSAGE));
			if (opcionMod == 1) {
				String titulo = JOptionPane
						.showInputDialog(null, "Titulo de el libro", "AGREGA TITULO", JOptionPane.QUESTION_MESSAGE)
						.toUpperCase();
				String ISBN = JOptionPane
						.showInputDialog(null, "ISBN de el libro", "ISBN", JOptionPane.QUESTION_MESSAGE).toUpperCase();
				int precio = Integer.parseInt(JOptionPane.showInputDialog(null, "Agrega el Precio de el Libro",
						"PRECIO", JOptionPane.QUESTION_MESSAGE));

				Libro libro = new Libro(titulo, ISBN, precio);
				obj.agregarLibroAlCatalogo(libro);
			} else if (opcionMod == 2) {
				String titulo = JOptionPane
						.showInputDialog(null, "Titulo de el libro", "AGREGA TITULO", JOptionPane.QUESTION_MESSAGE)
						.toUpperCase();
				String ISBN = JOptionPane
						.showInputDialog(null, "ISBN de el libro", "ISBN", JOptionPane.QUESTION_MESSAGE).toUpperCase();
				int precio = Integer
						.parseInt(JOptionPane.showInputDialog(null, "Agrega el Precio de el Libro", "PRECIO"));

				Libro libro = new Libro(titulo, ISBN, precio);
				obj.buscarLibro(libro);
			}
			opcion = JOptionPane.showConfirmDialog(null, "Desea Modificar algo mas?", "Continuar?",
					JOptionPane.YES_NO_OPTION);
		}

		int opcionC = JOptionPane.showConfirmDialog(null, "Desea Comprar Algo?", "Continuar?",
				JOptionPane.YES_NO_OPTION);
		while (opcionC == JOptionPane.YES_OPTION) {

			String titulo = JOptionPane
					.showInputDialog(null, "Agrega el TITULO de el libro que quieres" + obj.getCatalogo())
					.toUpperCase();
			String ISBN = JOptionPane
					.showInputDialog(null, "Agrega el ISBN de el libro que quieres" + obj.getCatalogo()).toUpperCase();
			int precio = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Agrega el PRECIO de el libro que quieres" + obj.getCatalogo()));
			Libro libro = new Libro(titulo, ISBN, precio);
			if (obj.buscarLibro(libro)) {
				int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos libros  vas a comprar"));
				ElementoComprado LibroC = new ElementoComprado(cantidad, libro);
				obj1.agregarElemento(LibroC);

				JOptionPane.showMessageDialog(null,"Total\n" + obj1.calcularTotal());
			}
			opcionC = JOptionPane.showConfirmDialog(null, "Desea volver a Comprar Algo?", "Continuar?",
					JOptionPane.YES_NO_OPTION);
		}

		int opcionModC = 0;
		opcionModC = JOptionPane.showConfirmDialog(null, "Desea eliminar UNA compra", "Continuar?",
				JOptionPane.YES_NO_OPTION);
		while (opcionModC == JOptionPane.YES_OPTION) {
			String titulo = JOptionPane
					.showInputDialog(null, "Agrega el TITULO de el libro que quieres" + obj.getCatalogo())
					.toUpperCase();
			String ISBN = JOptionPane
					.showInputDialog(null, "Agrega el ISBN de el libro que quieres" + obj.getCatalogo()).toUpperCase();
			int precio = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Agrega el PRECIO de el libro que quieres" + obj.getCatalogo()));
			Libro libro = new Libro(titulo, ISBN, precio);
			obj1.borrarElemento(libro);
			JOptionPane.showMessageDialog(null, "Total\n" + obj1.calcularTotal());

			opcionModC = JOptionPane.showConfirmDialog(null, "Desea Borrar otra compra", "Continuar?",
					JOptionPane.YES_NO_OPTION);

		}
		JOptionPane.showMessageDialog(null, "Nuevo Total\n"+obj1.calcularTotal());

	}
}

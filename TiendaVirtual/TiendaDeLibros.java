package TiendaVirtual;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TiendaDeLibros {

	private ArrayList<Libro> catalogo;

	public TiendaDeLibros() {
		catalogo = new ArrayList<Libro>();
	}

	public boolean agregarLibroAlCatalogo(Libro libro) {
		if (catalogo.contains(libro)) {
			JOptionPane.showMessageDialog(null, "El libro ya Existe en el Catalogo");
			
		} else {
			JOptionPane.showMessageDialog(null, "Libro agregado exitosamente");
			catalogo.add(libro);
		}
		return false;
	}

	public boolean buscarLibro(Libro libro) {
		if (catalogo.contains(libro)) {
			JOptionPane.showMessageDialog(null, "Este libro si existe" );
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Este libro no existe en el catalogo");
			return false;
		}
		
	}

	public ArrayList<Libro> getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(ArrayList<Libro> catalogo) {

		this.catalogo = catalogo;

	}

	public void crearUnaCompra(CarroDeCompras nCarro) {
	nCarro=new CarroDeCompras();
	}

	
}

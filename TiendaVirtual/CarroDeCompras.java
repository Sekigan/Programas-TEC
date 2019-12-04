package TiendaVirtual;

import java.util.*;

import javax.swing.JOptionPane;

public class CarroDeCompras {

	private ArrayList<ElementoComprado> lista = new ArrayList<ElementoComprado>();

	public void agregarElemento(ElementoComprado LibroC) {
		lista.add(LibroC);
	}

	public boolean borrarElemento(Libro libro) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getUnLibro().equals(libro)) {
				if (lista.get(i).getCantidad() > 1) {
					lista.get(i).setCantidad(lista.get(i).getCantidad() - 1);
					return true;
				} else {
					lista.remove(lista.get(i));
					return true;
				}
			}
			JOptionPane.showMessageDialog(null, "Elemento Borrado");

		}
		return false;

	}

	public double calcularTotal() {
		double total = 0.0;
		for (int i = 0; i < lista.size(); i++) {
			total = total + lista.get(i).calcularSubTotal();
		}

		return total;
	}

	
}

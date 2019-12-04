package TiendaVirtual;

public class ElementoComprado {

	private int cantidad;
	private Libro unLibro;

	public ElementoComprado(int cantidad, Libro unLibro) {
		super();
		this.cantidad = cantidad;
		this.unLibro=unLibro;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Libro getUnLibro() {
		return unLibro;
	}

	

	public String getISBN() {
		return unLibro.getISBN();
	}

	public double calcularSubTotal() {
		return unLibro.getPrecio() * cantidad;
	}
	
	
}

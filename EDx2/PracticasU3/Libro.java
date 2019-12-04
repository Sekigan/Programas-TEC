package PracticasU3;

public class Libro {
	private String titulo;
	private String autor;
	private int numPaginas;
	private float precio;

	public Libro() {

	}

	public Libro(String titulo, String autor, int numPaginas, float precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public float getPrecio() {
		return precio;
	}

	public float setPrecio(float precio) {
		return this.precio = precio;
	}
	public String toString(){
		String cadena="";
		cadena += "Titulo: "+titulo;
		cadena += "\nAutor: "+autor;
		cadena += "\nNumero de Paginas: "+numPaginas;
		cadena += "\nPrecio: "+precio;
		return cadena;
	}
}

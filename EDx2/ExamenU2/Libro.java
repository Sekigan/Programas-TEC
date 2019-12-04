package ExamenU2;

public class Libro {
	private String titulo;
	private String autor;
	private float precio;

	public Libro() {

	}

	public Libro(String titulo, String autor, float precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public float getPrecio() {
		return precio;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String toString() {
		String cadena = "";
		cadena += "Titulo del Libro: " + titulo;
		cadena += "\n Autor del Libro: " + autor;
		cadena += "\n Precio del libro: " + precio;
		return cadena;
	}
}

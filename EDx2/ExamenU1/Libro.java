package ExamenU1;

/*
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 20 DE SEPTIEMBRE DEL 2017
 * 
 */

public class Libro {
	private String Titulo;
	private String Autor;
	private float Precio;

	public Libro() {
		
	}

	public Libro(String Titulo, String Autor, float Precio) {
		this.Titulo = Titulo;
		this.Autor = Autor;
		this.Precio = Precio;
	}

	public String getTitulo() {
		return Titulo;
	}

	public String getAutor() {
		return Autor;
	}

	public float getPrecio() {
		return Precio;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public void setPrecio(float precio) {
		Precio = precio;
	}

	public String toString(){
		String cadena="";
		cadena+="Titulo del Libro: "+Titulo;
		cadena+="\n Autor del Libro: "+Autor;
		cadena+="\n Precio del libro: "+Precio;
		return cadena;
	}
	
}

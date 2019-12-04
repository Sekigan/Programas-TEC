package ExamenU3;

public class Escuela {
	private String nombre;
	private String director;
	private int numAlumnos;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getNumAlumnos() {
		return numAlumnos;
	}

	public void setNumAlumnos(int numAlumnos) {
		this.numAlumnos = numAlumnos;
	}
	public String toString() {
		String cadena="";
		cadena+="Nombre: " +getNombre() ;
		cadena+="\nDirector: " + getDirector() ;
		cadena+="\nNumero de Alumnos: "+ getNumAlumnos();
		return cadena;
	}


}

package PracticasU2;

public class Alumno {

	private String nombre;
	private double calif;
	private int grupo;

	public Alumno() {

	}

	public Alumno(String nombre, double calif, int grupo) {
		this.nombre = nombre;
		this.calif = calif;
		this.grupo = grupo;

	}

	public String getNombre() {
		return nombre;
	}

	public double getCalif() {
		return calif;
	}

	public int getGrupo() {
		return grupo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCalif(double calif) {
		this.calif = calif;
	}

	public void setGrupo(int grupo) {
		this.grupo = grupo;
	}

	public String toString() {
		String cadena = " ";
		cadena += "\n Nombre" + nombre;
		cadena += "\n Calificacion" + calif;
		cadena += "\n Grupo " + grupo;
		return cadena;
	}

}

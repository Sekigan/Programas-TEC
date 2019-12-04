package PracticasU1;

public class Alumno {

	private String nombre;
	private int numControl;
	private float calif1;
	private float calif2;

	public Alumno() {

	}

	public Alumno(String nombre, int numControl, float calif1, float calif2) {
		this.nombre = nombre;
		this.numControl = numControl;
		this.calif1 = calif1;
		this.calif2 = calif2;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNumControl() {
		return numControl;
	}

	public float getCalif1() {
		return calif1;
	}

	public float getCalif2() {
		return calif2;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNumControl(int numControl) {
		this.numControl = numControl;
	}

	public void setCalif1(float calif1) {
		this.calif1 = calif1;
	}

	public void setCalif2(float calif2) {
		this.calif2 = calif2;
	}

	public String toString(){
	String cadena=" ";
	cadena += "\n Nombre" + nombre;
	cadena += "\n Numero de control"+numControl;
	cadena += "\n Calificacion 1"+ calif1 + " Calificacion 2" + calif2;
	cadena += "\n Promedio " + calcularPromedio();
	return cadena;
	}

	private float calcularPromedio() {
		float suma;
		float promedio;
		suma=calif1+calif2;
		promedio=suma/2;
		return promedio;
	}
	}


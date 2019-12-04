package ExamenU3;

public class Pais {
	private String nombre;
	private String capital;
	private int numEstados;
	private float impuesto;

	public Pais() {

	}

	public Pais(String nombre, String capital, int numEstados, float impuesto) {
		this.nombre = nombre;
		this.capital = capital;
		this.numEstados = numEstados;
		this.impuesto = impuesto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public int getNumEstados() {
		return numEstados;
	}

	public void setNumEstados(int numEstados) {
		this.numEstados = numEstados;
	}

	public float getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(float impuesto) {
		this.impuesto = impuesto;
	}

	public String toString() {
		String cadena = "";
		cadena += "Nombre: " + getNombre();
		cadena += "\nCapital: " + getCapital();
		cadena += "\nNumero de Estados: " + getNumEstados();
		cadena += "\nImpuesto" + getImpuesto();
		return cadena;
	}

}

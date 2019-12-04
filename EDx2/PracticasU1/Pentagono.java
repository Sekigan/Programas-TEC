package PracticasU1;

public class Pentagono {

	private float lado;
	private float apotema;

	public Pentagono() {

	}

	public Pentagono(float lado, float apotema) {
		this.lado = lado;
		this.apotema = apotema;
	}

	public float getLado() {
		return lado;
	}

	public float getApotema() {
		return apotema;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	public void setApotema(float apotema) {
		this.apotema = apotema;
	}

	public String toString() {
		String cadena = " ";
		cadena += "\n Lado" + lado;
		cadena += "\n Apotema" + apotema;
		cadena += "\n Area" + calcularArea();
		cadena += "\n Perimetro" + calcularPerimetro();
		return cadena;
	}

	public float calcularArea() {
		float area;
		area = calcularPerimetro() * apotema / 2;
		return area;

	}

	public float calcularPerimetro() {

		float perimetro = lado * 5;
		return perimetro;

	}

}

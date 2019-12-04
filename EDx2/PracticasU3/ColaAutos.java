package PracticasU3;

public class ColaAutos {

	private Automovil c[];
	private int frente, fin;

	public ColaAutos() {
		c = new Automovil[5];
		frente = 0;
		fin = -1;
	}

	public ColaAutos(int n) {
		c = new Automovil[n];
		frente = 0;
		fin = -1;
	}

	public Automovil[] getC() {
		return c;
	}

	public int getFrente() {
		return frente;
	}

	public int getFin() {
		return fin;
	}

	public void setC(Automovil[] c) {
		this.c = c;
	}

	public void setFrente(int frente) {
		this.frente = frente;
	}

	public void setFin(int fin) {
		this.fin = fin;
	}

	public void insertar(Automovil x) {
		if (!estaLlena()) {
			fin++;
			c[fin] = x;
		}
	}

	public Automovil eliminar() {
		Automovil borrado = null;
		if (!estaVacia()) {
			borrado = c[frente];
			c[frente] = null;
			frente++;
			if (estaVacia()) {
				frente = 0;
				fin = -1;
			}
		}
		return borrado;
	}

	public boolean estaVacia() {
		if (frente > fin)
			return true;
		else
			return false;
	}

	public boolean estaLlena() {
		if (fin == c.length - 1)
			return true;
		else
			return false;
	}

	public int numElementos() {
		return fin - frente + 1;

	}

	public Automovil elementoEnFrente() {
		if (estaVacia())
			return null;
		else
			return c[frente];
	}

	public Automovil elementoEnFin() {
		if (estaVacia())
			return null;
		else
			return c[fin];
	}

	public String toString() {
		String s = "";
		for (int i = frente; i <= fin; i++)
			s += c[i] + "\n";
		return s;
	}

}

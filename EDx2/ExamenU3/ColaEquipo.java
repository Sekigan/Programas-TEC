package ExamenU3;


public class ColaEquipo {

	private Equipo c[];
	private int frente, fin;

	public ColaEquipo() {
		c = new Equipo[5];
		frente = 0;
		fin = -1;
	}

	public ColaEquipo(int n) {
		c = new Equipo[n];
		frente = 0;
		fin = -1;
	}

	public Equipo[] getC() {
		return c;
	}

	public int getFrente() {
		return frente;
	}

	public int getFin() {
		return fin;
	}

	public void setC(Equipo[] c) {
		this.c = c;
	}

	public void setFrente(int frente) {
		this.frente = frente;
	}

	public void setFin(int fin) {
		this.fin = fin;
	}

	public void insertar(Equipo x) {
		if (!estaLlena()) {
			fin++;
			c[fin] = x;
		}
	}

	public Equipo eliminar() {
		Equipo borrado = null;
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

	public Equipo elementoEnFrente() {
		if (estaVacia())
			return null;
		else
			return c[frente];
	}

	public Equipo elementoEnFin() {
		if (estaVacia())
			return null;
		else
			return c[fin];
	}

	public String toString() {
		String s = "";
		for (int i = frente; i <= fin; i++)
			s += c[i].toString() + "\n";
		return s;
	}

}

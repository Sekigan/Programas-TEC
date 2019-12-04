package ExamenU3;

public class ColaEscuela {

	private Escuela c[];
	private int frente, fin;

	public ColaEscuela() {
		c = new Escuela[5];
		frente = 0;
		fin = -1;
	}

	public ColaEscuela(int n) {
		c = new Escuela[n];
		frente = 0;
		fin = -1;
	}

	public Escuela[] getC() {
		return c;
	}

	public int getFrente() {
		return frente;
	}

	public int getFin() {
		return fin;
	}

	public void setC(Escuela[] c) {
		this.c = c;
	}

	public void setFrente(int frente) {
		this.frente = frente;
	}

	public void setFin(int fin) {
		this.fin = fin;
	}

	public void insertar(Escuela x) {
		if (!estaLlena()) {
			fin++;
			c[fin] = x;
		}
	}

	public Escuela eliminar() {
		Escuela borrado = null;
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

	public Escuela elementoEnFrente() {
		if (estaVacia())
			return null;
		else
			return c[frente];
	}

	public Escuela elementoEnFin() {
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

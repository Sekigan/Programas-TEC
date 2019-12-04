package PracticasU3;

public class ColaLibros {
	private Libro c[];
	private int frente, fin;

	public ColaLibros() {
		c = new Libro[5];
		frente = 0;
		fin = -1;
	}

	public ColaLibros(int n) {
		c = new Libro[n];
		frente = 0;
		fin = -1;
	}

	public Libro[] getC() {
		return c;
	}

	public int getFrente() {
		return frente;
	}

	public int getFin() {
		return fin;
	}

	public void setC(Libro[] c) {
		this.c = c;
	}

	public void setFrente(int frente) {
		this.frente = frente;
	}

	public void setFin(int fin) {
		this.fin = fin;
	}

	public void insertar(Libro x) {
		if (!estaLlena()) {
			fin++;
			c[fin] = x;
		}
	}

	public Libro eliminar() {
		Libro borrado = null;
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

	public Libro elementoEnFrente() {
		if (estaVacia())
			return null;
		else
			return c[frente];
	}

	public Libro elementoEnFin() {
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

	public float suma() {

		float suma = 0;
		for (int i = frente; i <= fin; i++) {

			suma += c[i].getPrecio();
		}
		return suma;
	}

	public String aumenta5() {
		String cadena = "";

		for (int i = frente; i <= fin; i++) {
			if (c[i].getNumPaginas() <= 100) {
				cadena += "Titulo del Libro\n"+c[i].getTitulo();
				cadena += "\nPrecio nuevo\n"+c[i].setPrecio(c[i].getPrecio() + (c[i].getPrecio() * 0.05f));

			}

		}
		return cadena;

	}

	public String titulo() {
		if (estaVacia())
			return null;
		else
			return c[frente].getTitulo();
	}

}

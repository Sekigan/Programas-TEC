package ExamenU2;

public class PilaLibros {
	private Libro[] p;
	private int tope;

	public PilaLibros() {
		p = new Libro[5];
		tope = -1;
	}

	// 2do constructor
	public PilaLibros(int n) {
		p = new Libro[n];
		tope = -1;
	}

	// getters y setters
	public Libro[] getP() {
		return p;
	}

	public int getTope() {
		return tope;
	}

	public void setP(Libro[] p) {
		this.p = p;
	}

	public void setTope(int tope) {
		this.tope = tope;
	}

	// determinar si la pila esta vacia
	public boolean estaVacia() {
		if (tope == -1)
			return true;
		else
			return false;
	}

	// determininar si la pila esta llena
	public boolean estaLlena() {
		if (tope == (p.length - 1))
			return true;
		else
			return false;
	}

	// numero de datos que hay en la pila
	public int numElementos() {
		return (tope + 1);
	}

	// devolver el elemento del tope
	public Libro elementoEnTope() {
		if (estaVacia())
			return null;
		else
			return p[tope];
	}

	// insertar
	public void insertar(Libro x) {
		if (!estaLlena()) {
			tope++;
			p[tope] = x;
		}
	}

	// eliminar
	public Libro eliminar() {
		Libro borrado;
		if (!estaVacia()) {
			borrado = p[tope];
			p[tope] = null;
			tope--;
		} else
			borrado = null;
		return borrado;
	}

	// tostring
	public String toString() {
		String s = "";
		int i;
		for (i = tope; i >= 0; i--) {
			s += p[i].toString() + "\n";
		}
		return s;

	}

}

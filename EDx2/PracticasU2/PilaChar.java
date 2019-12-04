package PracticasU2;

public class PilaChar {
	// atributos
	private char[] p;
	private int tope;

	// 1er constructor
	public PilaChar() {
		p = new char[5];
		tope = -1;
	}

	// 2do constructor
	public PilaChar(int n) {
		p = new char[n];
		tope = -1;
	}

	// getters y setters
	public char[] getP() {
		return p;
	}

	public int getTope() {
		return tope;
	}

	public void setP(char[] p) {
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

	// devolver el elemento del tope
	public char elementoEnTope() {
		if (estaVacia())
			return '/';
		else
			return p[tope];
	}

	// insertar
	public void insertar(char x) {
		if (!estaLlena()) {
			tope++;
			p[tope] = x;
		}
	}

	// eliminar
	public char eliminar() {
		char borrado;
		if (!estaVacia()) {
			borrado = p[tope];
			p[tope] = '/';
			tope--;
		} else
			borrado = '/';
		return borrado;
	}

	// numero de datos que hay en la pila
	public int numElementos() {
		return (tope + 1);
	}

	// tostring
	public String toString() {
		String s = "";
		int i;
		for (i = tope; i >= 0; i--) {
			s += p[i] + "\n";
		}
		return s;
	}

}

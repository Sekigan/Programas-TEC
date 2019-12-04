package ExamenU2;

public class PilaCiudades {
	private Ciudad[] p;
	private int tope;

	public PilaCiudades() {
		p = new Ciudad[5];
		tope = -1;
	}

	// 2do constructor
	public PilaCiudades(int n) {
		p = new Ciudad[n];
		tope = -1;
	}

	// getters y setters
	public Ciudad[] getP() {
		return p;
	}

	public int getTope() {
		return tope;
	}

	public void setP(Ciudad[] p) {
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
	public Ciudad elementoEnTope() {
		if (estaVacia())
			return null;
		else
			return p[tope];
	}

	// insertar
	public void insertar(Ciudad x) {
		if (!estaLlena()) {
			tope++;
			p[tope] = x;
		}
	}

	// eliminar
	public Ciudad eliminar() {
		Ciudad borrado;
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

package PracticasU2;

public class PilaInt {
	private int[] p;
	private int tope;

	public PilaInt() {
		setP(new int[5]);
		setTope(-1);
	}

	public PilaInt(int n) {
		setP(new int[n]);
		setTope(-1);
	}

	public int[] getP() {
		return p;
	}

	public int getTope() {
		return tope;
	}

	public void setP(int[] p) {
		this.p = p;
	}

	public void setTope(int tope) {
		this.tope = tope;
	}

	public boolean estaVacia() {
		if (tope == -1)
			return true;
		else
			return false;
	}

	public boolean estaLlena() {
		if (tope == (p.length))
			return true;
		else
			return false;
	}

	public int elementoEnTope() {
		if (estaVacia())
			return -9999;
		else
			return p[tope];
	}

	public void insertar(int x) {
		if (!estaLlena()) {
			tope++;
			p[tope] = x;
		}
	}

	public int eliminar() {
		int borrado;
		if (!estaVacia()) {
			borrado = p[tope];
			p[tope] = 0;
			tope--;
		} else
			borrado = -9999;
		return borrado;
	}

	public int numElementos() {
		return (tope + 1);
	}

	public String toString() {
		String s = "";
		int i;
		for (i = tope; i > 0; i--) {
			s += p[i] + "\n";
		}
		return s;
	}
}

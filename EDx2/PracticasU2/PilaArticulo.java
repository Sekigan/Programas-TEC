package PracticasU2;

public class PilaArticulo {
	// atributos
	private Articulo[] p;
	private int tope;

	// 1er constructor
	public PilaArticulo() {
		p = new Articulo[5];
		tope = -1;
	}

	// 2do constructor
	public PilaArticulo(int n) {
		p = new Articulo[n];
		tope = -1;
	}

	// getters y setters
	public Articulo[] getP() {
		return p;
	}

	public int getTope() {
		return tope;
	}

	public void setP(Articulo[] p) {
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
	public Articulo elementoEnTope() {
		if (estaVacia())
			return null;
		else
			return p[tope];
	}

	// insertar
	public void insertar(Articulo x) {
		if (!estaLlena()) {
			tope++;
			p[tope] = x;
		}
	}

	// eliminar
	public Articulo eliminar() {
		Articulo borrado;
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

	public float inventarioTotal() {
		int i;
		float mult, suma = 0;
		for (i = tope; i >= 0; i--) {
			mult = (p[i].getPrecio()) * (p[i].getCantidad());
			suma += mult;
		}
		return suma;
	}

	public String mayorPrecio() {
		int i;
		float mayor = 0;
		String descripcion = " ";
		for (i = tope; i >= 0; i--) {
			if (p[i].getPrecio() > mayor) {
				mayor = p[i].getPrecio();
				descripcion = p[i].getDescripcion();
			}
		}
		return descripcion;
	}

	public void aumenta20porc() {
		int i;
		for (i = tope; i >= 0; i--) {
			p[i].setPrecio(p[i].getPrecio() + (p[i].getPrecio() * 0.2f));
		}
	}

	public String articulosMenor15() {
		int i;
		String desc = " ";
		for (i = tope; i >= 0; i--) {
			if (p[i].getCantidad() <= 15) {
				desc += p[i].getDescripcion() + "\n";
			}
		}
		return desc;
	}
}
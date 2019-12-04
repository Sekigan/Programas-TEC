package PracticasU2;

public class PilaAlumnos {
	private Alumno[] p;
	private int tope;

	public PilaAlumnos() {
		p = new Alumno[5];
		tope = -1;
	}

	// 2do constructor
	public PilaAlumnos(int n) {
		p = new Alumno[n];
		tope = -1;
	}

	// getters y setters
	public Alumno[] getP() {
		return p;
	}

	public int getTope() {
		return tope;
	}

	public void setP(Alumno[] p) {
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
	public Alumno elementoEnTope() {
		if (estaVacia())
			return null;
		else
			return p[tope];
	}

	// insertar
	public void insertar(Alumno x) {
		if (!estaLlena()) {
			tope++;
			p[tope] = x;
		}
	}

	// eliminar
	public Alumno eliminar() {
		Alumno borrado;
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

	public void aumenta5pts() {
		int i;
		for (i = tope; i >= 0; i--) {

			p[i].setCalif(p[i].getCalif() + (5));
			if (p[i].getCalif() > 100) {
				p[i].setCalif(100);
			}
		}
	}

	public String reprobadosIN() {
		int i;
		String reprobados = " ";
		for (i = tope; i >= 0; i--) {
			if (p[i].getCalif() <= 70) {
				reprobados += p[i].getNombre() + "\n";
			}
		}
		return reprobados;
	}

	public int promedio() {
		int i, suma = 0, prom = 0;
		for (i = tope; i >= 0; i--) {
			suma += p[i].getCalif();
			prom = suma / p.length;
		}
		return prom;
	}

}

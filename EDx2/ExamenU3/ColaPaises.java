package ExamenU3;

public class ColaPaises {

	private Pais c[];
	private int frente, fin;

	public ColaPaises() {
		c = new Pais[5];
		frente = 0;
		fin = -1;
	}

	public ColaPaises(int n) {
		c = new Pais[n];
		frente = 0;
		fin = -1;
	}

	public Pais[] getC() {
		return c;
	}

	public int getFrente() {
		return frente;
	}

	public int getFin() {
		return fin;
	}

	public void setC(Pais[] c) {
		this.c = c;
	}

	public void setFrente(int frente) {
		this.frente = frente;
	}

	public void setFin(int fin) {
		this.fin = fin;
	}

	public void insertar(Pais x) {
		if (!estaLlena()) {
			fin++;
			c[fin] = x;
		}
	}

	public Pais eliminar() {
		Pais borrado = null;
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

	public Pais elementoEnFrente() {
		if (estaVacia())
			return null;
		else
			return c[frente];
	}

	public Pais elementoEnFin() {
		if (estaVacia())
			return null;
		else
			return c[fin];
	}

	public String toString() {
		String s = "";
		for (int i = frente; i <= fin; i++)
			s += c[i].toString() + "\n"+"\n";
		return s;
	}

	public String paisN() {
		if (estaVacia())
			return null;
		else
			return c[frente].getNombre();
	}

	public float ingresoT() {
		float impuestos = 0;
		for (int i = frente; i <= fin; i++) {
			impuestos += c[i].getNumEstados() * c[i].getImpuesto();
		}
		return impuestos;
	}

	public void aumenta20(String paisI) {
		int i;
		for (i = frente; i <= fin; i++) {
			if (paisI.equals(c[i].getNombre())) {
				c[i].setImpuesto(c[i].getImpuesto() + c[i].getImpuesto() * (.20f));
			}
		}
	}

	public String paisImp20(String paisI) {
		int i;
		String pais = "";
		for (i = frente; i <= fin; i++) {
			if (paisI.equals(c[i].getNombre())) {
				if (paisI.equals(c[i].getNombre())) {
					pais += "\nNombre del pais\n" + c[i].getNombre() + "\nImpuesto modificado \n" + c[i].getImpuesto();
				}
			}
			
		}return pais;
	}

	public String listaP() {
		int i;
		String pais = "";
		for (i = frente; i <= fin; i++) {
			pais +=  c[i].getNombre() + "\n";

		}
		return pais;
	}
}

package jahaziel;



public class tiposs{
	private tipos1[] p;
	private int tope;

	public tiposs() {
		p = new tipos1[7];
		tope = -1;
	}

	// 2do constructor
	public tiposs(int n) {
		p = new tipos1[n];
		tope = -1;
	}

	// getters y setters
	public tipos1[] getP() {
		return p;
	}

	public int getTope() {
		return tope;
	}

	public void setP(tipos1[] p) {
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
	public tipos1 elementoEnTope() {
		if (estaVacia())
			return null;
		else
			return p[tope];
	}

	// insertar
	public  void insertar(tipos1 x) {
		if (!estaLlena()) {
			tope++;
			p[tope] = x;
		}
	}

	// eliminar
	public tipos1 eliminar() {
		tipos1 borrado;
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

	public double calculaK (double f) {
		int i;
		double k=0;
		for (i = tope; i >= 0; i--) {
		k= ((1+Math.sqrt(1+(f*f)))/2);
			
			
		}
		return k;
	}
	
	public double calcularF(double diametro) {
		double fconst= 60;
		double c1= 0.0063;
		
		double f=c1+(diametro*diametro)*fconst;
			return f;
	}
	public String tipox() {
		int i;
		String tipo = " ";
		for (i = tope; i >= 0; i--) {
			
				tipo += p[i].getTipo()+ "  TIPO   [ " + i + " ]  "+"\n";
			
		}
		return tipo;
	}
}

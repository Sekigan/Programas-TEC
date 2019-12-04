package ExamenU2;

public class PilaVuelos {
	private Vuelo[] p;
	private int tope;

	public PilaVuelos() {
		p = new Vuelo[5];
		tope = -1;
	}

	// 2do constructor
	public PilaVuelos(int n) {
		p = new Vuelo[n];
		tope = -1;
	}

	// getters y setters
	public Vuelo[] getP() {
		return p;
	}

	public int getTope() {
		return tope;
	}

	public void setP(Vuelo[] p) {
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
	public Vuelo elementoEnTope() {
		if (estaVacia())
			return null;
		else
			return p[tope];
	}

	// insertar
	public void insertar(Vuelo x) {
		if (!estaLlena()) {
			tope++;
			p[tope] = x;
		}
	}

	// eliminar
	public Vuelo eliminar() {
		Vuelo borrado;
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

	public void aumenta580(String ciudadMod) {
		int i;
		for (i = tope; i >= 0; i--) {
			if(ciudadMod.equals(p[i].getCiudadDestino())){
			p[i].setPrecio(p[i].getPrecio() + (580f));
		}}
	}
	
	public float vuelosSuma() {
		int i;
		float suma = 0;
		for (i = tope; i >= 0; i--) {

			suma += p[i].getPrecio();
		}
		return suma;
	}
	public String vuelosMTY() {
		int i;
		String destino = " ";
		for (i = tope; i >= 0; i--) {
			if ((p[i].getCiudadOrigen()).equals("MONTERREY")) {
				destino += p[i].getCiudadDestino() + "  NUMERO DEL VUELO   [ " + i + " ]  "+"\n";
			}
		}
		return destino;
	}
	public String listaExtranjeros() {
		int i;
		String destino = " ";
		for (i = tope; i >= 0; i--) {
			
				destino += p[i].getCiudadDestino() +"\n";
			}
		
		return destino;
	}

}

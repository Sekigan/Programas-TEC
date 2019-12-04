package colas;

public class ColaCircular implements ICola {

	Object[] arreglo;
	int frente;
	int fondo;
	int count = 0;

	public ColaCircular(int tamaño) {
		arreglo = new Object[tamaño];
		for (int i = 0; i < arreglo.length; i++)
			arreglo[i] = new Object();
		frente = 0;
		fondo = -1;
	}

	public void limpiarA() {
		while (count > 0) {
			arreglo[frente] = null;
			if (++frente == arreglo.length)
				frente = 0;
			--count;
		}
	}

	public boolean isVacio() {
		if (count == 0)
			return true;
		else
			return false;

	}

	public boolean isLLeno() {
		if (!isVacio()) {
			if ((fondo == (arreglo.length - 1) && (frente == 0)) || (fondo == (frente - 1))) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	public Object getFrente() {
		if (!isVacio()) {
			return arreglo[frente];
		} else {
			return null;
		}
	}

	public Object getFondo() {

		if (!isVacio()) {
			return arreglo[fondo];
		} else {
			return null;
		}

	}

	public void encolar(Object obj) throws Exception {
		if (count == arreglo.length)
			throw new Exception();
		if (++fondo == arreglo.length)
			fondo = 0;
		arreglo[fondo] = obj;

		count++;
	}

	public Object desencolar() throws Exception {
 		if (count == 0)
			throw new Exception();
		Object resultado = arreglo[frente];
		arreglo[frente] = null;
		if (++frente == arreglo.length)
			frente = 0;
		--count;
		
		return resultado;

	}

	public int getTam() {
		return count;
	}

	public String toString() {
		String salida = "";
		Object elemento = null;
		ColaCircular colaAux = new ColaCircular(count);
		while (!this.isVacio()) {
			try {

				elemento = this.desencolar();
			} catch (Exception e) {

				e.printStackTrace();
			}

			salida += elemento + "\n";
			try {
				colaAux.encolar(elemento);
			} catch (Exception e) {

				e.printStackTrace();
			}

		}
		while (!colaAux.isVacio()) {

			try {
				this.encolar(colaAux.desencolar());
			} catch (Exception e) {

				e.printStackTrace();
			}

		}
		return salida;

	}
}

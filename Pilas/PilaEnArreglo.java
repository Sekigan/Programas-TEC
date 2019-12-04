package Pilas;

public class PilaEnArreglo implements InterfazPila {
	private Object[] arreglo;
	private int top = -1;

	public PilaEnArreglo() {
		arreglo = new Object[20];
	}

	public int tamaño() {
		return top;
	}

	public PilaEnArreglo(int tam) {
		arreglo = new Object[tam];
	}

	public void push(Object obj) {
		if (!isLlena()) {
			top++;
			arreglo[top] = obj;
		}
	}

	public Object pop() {
		Object tmp;
		if (!isVacia()) {
			tmp = arreglo[top];
			top--;
			return tmp;
		}

		return "La pila esta vacia";
	}

	public boolean isVacia() {
		return top == -1;
	}

	public boolean isLlena() {
		return top == arreglo.length - 1;
	}

	public Object getTop() {
		if (!isVacia()) {

			return arreglo[top];
		}
		return null;
	}

	
		
		
		
		 
		
		
	

	
}
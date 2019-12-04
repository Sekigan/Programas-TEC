package PracticasU4;

public class ListaAlumnos {
	// ATRIBUTOS
	private NodoAlumno inicio;
	private int numNodos;

	// CONSTRUCTOR
	public ListaAlumnos() {
		inicio = null;
		numNodos = 0;
	}

	// getters
	public NodoAlumno getInicio() {
		return inicio;
	}

	public int getNumNodos() {
		return numNodos;
	}

	// setters
	public void setInicio(NodoAlumno nuevoInicio) {
		inicio = nuevoInicio;
	}

	public void setNumNodos(int nuevoNumNodos) {
		numNodos = nuevoNumNodos;
	}

	// checar si la lista esta vacía
	public boolean estaVacia() {
		if (inicio == null)
			return true;
		else
			return false;
	}

	// insertar un nodo al inicio de la lista. Se recibe el nodo YA CREADO
	public void insertaInicio(NodoAlumno nuevo) {
		nuevo.setLiga(inicio);
		inicio = nuevo;
		numNodos++;
	}

	// toString
	public String toString() {
		NodoAlumno r = inicio;
		String s = "Datos en la lista:\n";
		while (r != null) {
			s += r.toString() + "\n";
			r = r.getLiga();
		}
		return s;
	}

	public float promedio() {
		float promedio=0;
		float suma=0;
		NodoAlumno r = inicio;

		while (r != null) {
			suma += r.getCalif() ;
			
			r = r.getLiga();
		}
		promedio=suma/getNumNodos();
		return promedio;

	}

	public String reprobados(){
		NodoAlumno r = inicio;
		String s = "Alumnos Reprobados:\n";
		while (r != null) {
			if(r.getCalif()<70){
			s+=r.getNombre()+"\n";
			}
			r = r.getLiga();
		}
		return s;
    	  
      }

}
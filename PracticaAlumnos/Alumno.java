package Practica;

public class Alumno extends Persona {

	private Asignatura[] agn;

	public Alumno(String nombre, String apellido_p, String apellido_m, int edad) throws EdadException {
		super(nombre, apellido_p, apellido_m, edad);

		agn = new Asignatura[60];
	}

	public int calcularPromedio() {
		int promedio = 0;
		int sumar = 0;
		int contasg = 0;
		for (int i = 0; i < agn.length; i++) {
			if (agn[i] != null) {

				contasg++;
				sumar += agn[i].getCalificacion();
			}
			if (sumar > 0) {
			}
			promedio = sumar / contasg;

		}

		return promedio;

	}

	public boolean agregarAsgn(Asignatura Asgn) {

		for (int i = 0; i < agn.length; i++) {
			if (agn[i] != null) {
				if (agn[i].equals(Asgn)) {
					return false;
				}
			}
		}
		for (int i = 0; i < agn.length; i++) {
			if (agn[i] == null) {
				agn[i] = Asgn;
				break;
			}
		}
		return true;
	}

	// utilizar el metodo super.toString() de la super clase persona
	// for reforzado
	public String toString() {
		String cadena =super.toString() + "\n";
		for(Asignatura elemento : agn){
			if (elemento != null){
				cadena += elemento.toString();
			}
		}
		
		
		cadena += "\nPromedio--->" + calcularPromedio();
		return cadena;
	}

}

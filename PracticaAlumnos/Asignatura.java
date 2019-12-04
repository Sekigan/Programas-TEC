package Practica;

public class Asignatura {
	private String nombreAsig;
	private int calificacion;

	public Asignatura(String nombreAsig, int calificacion) {
		this.nombreAsig = nombreAsig;
		this.calificacion = calificacion;
	}

	public String getNombreAsig() {
		return nombreAsig;
	}

	public void setNombreAsig(String nombreAsig) {
		this.nombreAsig = nombreAsig;
	}

	public int getCalificacion() {
		
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public boolean equals(Object otraAsignatura) {
		if (otraAsignatura != null) {
			if (otraAsignatura instanceof Asignatura) {

				Asignatura p = (Asignatura) otraAsignatura;

				if (this.nombreAsig.equals(p.getNombreAsig())) {

					return true;
				}
			}

		}
		return false;
	}

	public String getResultado() {
		if (calificacion >= 70) {
			return "Aprobado";
		} else {
			return "Reprobado";
		}
	}

	public String toString() {
		return "\n" + nombreAsig + "    Calificacion---->" + calificacion+"    "+getResultado();
	}

}

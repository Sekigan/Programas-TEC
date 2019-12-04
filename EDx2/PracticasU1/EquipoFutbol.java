package PracticasU1;

public class EquipoFutbol {

	// atributos
	private String nombre;
	private int numJugadores;
	private int puntos;

	// Constructor

	public EquipoFutbol(String n, int nJ, int p) {
		nombre = n;
		numJugadores = nJ;
		puntos = p;
	}

	// Metodos getters
	public String getNombre() {
		return nombre;
	}

	public int getNumJugadores() {
		return numJugadores;
	}

	public int getPuntos() {
		return puntos;
	}
	public void setPuntos( int puntos){
		this.puntos=puntos;
	}
	
	public String toString(){
		String cadena ="";
		cadena+="\n Nombre del Equipo: "+nombre;
		cadena+="\n Numero de Jugadores: "+numJugadores;
		cadena+="\n Puntos del equipo: "+puntos;
		return cadena;
	}
}
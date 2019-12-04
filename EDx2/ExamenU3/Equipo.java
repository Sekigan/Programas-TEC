package ExamenU3;

public class Equipo {
	private String nombre;
	private String ciudad;
	private int numJugadores;

	public String getNombre() {
		return nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public int getNumJugadores() {
		return numJugadores;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void setNumJugadores(int numJugadores) {
		this.numJugadores = numJugadores;
	}

	
	public String toString() {
		String cadena="";
		cadena+="Nombre: " +getNombre() ;
		cadena+="\nCiudad: " + getCiudad() ;
		cadena+="\nNumero de Jugadores: "+ getNumJugadores();
		return cadena;
	}

}

package ExamenU2;

public class Ciudad {
	private String nombre;
	private String estado;
	private int habitantes;

	public Ciudad() {

	}

	public Ciudad(String nombre, String estado, int habitantes) {
		this.nombre = nombre;
		this.estado = estado;
		this.habitantes = habitantes;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEstado() {
		return estado;
	}

	public int getHabitantes() {
		return habitantes;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}
	public String toString() {
		String cadena = "";
		cadena += "\n Nombre de la Ciudad: " + nombre;
		cadena += "\n Estado de la Ciudad: " + estado;
		cadena += "\n Habitantes de la Ciudad: " + habitantes;
		return cadena;
	}

}

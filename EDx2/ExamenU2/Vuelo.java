package ExamenU2;

public class Vuelo {

	private String ciudadOrigen;
	private String ciudadDestino;
	private float precio;

	public Vuelo() {

	}

	public Vuelo(String ciudadOrigen, String ciudadDestino, float precio) {
		this.ciudadOrigen=ciudadOrigen;
		this.ciudadDestino=ciudadDestino;
		this.precio=precio;
	}

	public String getCiudadOrigen() {
		return ciudadOrigen;
	}

	public String getCiudadDestino() {
		return ciudadDestino;
	}

	public float getPrecio() {
		return precio;
	}

	public void setCiudaOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String toString() {
		String cadena = "";
		cadena += "\n Ciudad de Origen: " + ciudadOrigen;
		cadena += "\n Ciudad de destino: " + ciudadDestino;
		cadena += "\n Precio: " + precio;
		return cadena;
	}

}

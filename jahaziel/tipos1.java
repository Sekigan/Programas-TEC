package jahaziel;

public class tipos1 {

	private String tipo;
	private float longitud;
	private float resistividad;
	private float temperatura;
	
	public tipos1() {

	}

	public tipos1(String tipo, float longitud, float resistividad,float temperatura) {
		this.tipo=tipo;
		this.longitud=longitud;
		this.resistividad=resistividad;
		this.temperatura=temperatura;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getLongitud() {
		return longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	public float getResistividad() {
		return resistividad;
	}

	public void setResistividad(float resistividad) {
		this.resistividad = resistividad;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public String toString() {
		String cadena = "";
		cadena += "\n Tipo: " + tipo;
		cadena += "\n longitud: " + longitud;
		cadena += "\n Resistividad: " +resistividad ;
		cadena += "\n Temperatura:  "+temperatura;
		return cadena;
	}


}

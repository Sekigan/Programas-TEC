package PracticasU3;

public class Automovil {
	private String placa;
	private String propietario;

	public Automovil() {

	}

	public Automovil(String placa, String propietario) {
		this.placa = placa;
		this.propietario = propietario;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public String toString() {
		String s="";
		s+="\n Placa= " + placa ;
		s+="\n Propietario= "+ propietario;
		return s;
	}

}

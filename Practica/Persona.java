package Practica;

public class Persona {
	private String nombre;
	private int edad;
	private char genero;
	
	public Persona(String nombre, int edad, char genero){
		this.nombre=nombre;
		this.edad=edad;
		this.genero=genero;
	}
	
	//se crean los gets y set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		
		this.genero = genero;
	}

	public String toString(){
		return "\n Nombre----> " + nombre+
				"\n Edad----> "+ edad+
				"\n Genero----> "+ genero;
	}
	public  boolean equals(Object otraPersona){
		if(otraPersona != null){
			if(otraPersona instanceof Persona){
				
				Persona p = (Persona) otraPersona;
				
					if(this.nombre.equals((p.getNombre()))){
						if(this.edad==(p.getEdad())){
							if(this.genero==(p.getGenero())){
								return true ;
								}
							}
						}
			}	
				}return false;
			
	}

}

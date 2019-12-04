package Practica;



public class Persona {
	protected String nombre;
	protected String apellido_p;
	protected String apellido_m;
	protected int edad;

	public Persona(String nombre, String apellido_p, String apellido_m, int edad)throws EdadException {
		this.nombre = nombre;
		this.apellido_p = apellido_p;
		this.apellido_m = apellido_m;
		if (edad < 1 || edad > 100) {
			throw new EdadException();
		}else{
			this.edad = edad;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido_p() {
		return apellido_p;
	}

	public void setApellido_p(String apellido_p) {
		this.apellido_p = apellido_p;
	}

	public String getApellido_m() {
		return apellido_m;
	}

	public void setApellido_m(String apellido_m) {
		this.apellido_m = apellido_m;
	}

	public int getEdad() {
	
		return edad;
	}

	public void setEdad(int edad) throws EdadException {
		if (edad < 1 || edad > 100) {
			throw new EdadException();
		}else{
			this.edad = edad;
		}}
	public String toString()
	 {
		 String cadena = "";
		 	cadena+="\nNombre---->" + nombre;
		 		cadena +="\nApellido Paterno---->" + apellido_p;
		 			cadena +="\nApellido Materno---->" + apellido_m;
		 				cadena +="\nEdad---->" + edad;
		 return cadena;
	 }
	 
	public  boolean equals(Object otraPersona){
		if(otraPersona != null){
			if(otraPersona instanceof Persona){
				
				Persona p = (Persona) otraPersona;
				
					if(this.nombre.equals((p.getNombre()))){
						if(this.apellido_p.equals((p.getApellido_p()))){
							if(this.apellido_m.equals((p.getApellido_m()))){
								if(this.edad==(p.getEdad()))
								return true ;
								}
							}
						}
			}	
				}return false;
			
	}
	
	}
	

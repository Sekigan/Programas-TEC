package TiendaVirtual;



public class Libro {
	private String titulo;
	private String ISBN;
	private double precio;
	
	public Libro(String titulo, String ISBN, double precio){
		this.titulo=titulo;
		this.ISBN=ISBN;
		this.precio=precio;
	}

	
	public String getTitulo() {
		return titulo;
	}

	
	public void setTitulo(String titulo) {
		
		this.titulo = titulo;
	}

	
	public String getISBN() {
		return ISBN;
	}

	
	public void setISBN(String iSBN) {
		
		ISBN = iSBN;
	}

	
	public double getPrecio() {
		return precio;
	}

	
	public void setPrecio(double precio) {
		
		this.precio = precio;
	}
		public String toString(){
			return "\n Nombre de el libro---->"+titulo+
					"\n ISBN---->"+ISBN+
					"\n Precio de el libro---->"+precio;
			
			
		}
		
		public boolean equals(Object Libron){
			if(Libron != null){
				if(Libron instanceof Libro){
					
					Libro n = (Libro) Libron;
					
						if(this.titulo.equals((n.getTitulo()))){
							if(this.ISBN.equals(n.getISBN())){
								if(this.precio==(n.getPrecio())){
									return true ;
									}
								}
							}
				}	
					}return false;
		}
	}


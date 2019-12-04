package PracticasU2;

//Clase instanciable basica para una pila de enteros 

public class PilaString {

	// Atributos 
	private String [] p; // vector declarado 
	private int tope;
	
	// primer Constructor pila de 5 casillas
	
	public PilaString(){
		p=new String[5];
		tope=-1; // se pone -1 por que la pila esta vacia 
	}
	// 2do Constructor  pial "n" casillas
	public PilaString(int n){
		p=new String[n];
		tope=-1;
		
	}
	//Determinar si la pila está vacia
	
	//Métodos Get
	
	public String[]getP(){
		return p;
	}
	//Métodos Get
	
	public  int getTope(){
		return tope;
	}
	public boolean estaVacia(){
		if(tope==-1){
			return true;
		}else{
			return false;
		}
	}
	//Determinar si la pila esta llena
	
	public boolean estaLlena(){
		if(tope==(p.length-1)){
			return true;
		}else{
			return false;
		}
	}
	//Método para devolver el elemento del tope
	
	
	public String elementoEnTope(){
		if(estaVacia()){
			return null; 
					
		}else{
			return p[tope];
		}
	}
	
	//Métodos Get
	
	//Métodos Set
	public void setP(String[]p){
		this.p=p;
	}
	
	public void setTope(int tope){
		this.tope=tope;
	}
	
	//Insertar
	
    public void insertar (String x){
    	if(!estaLlena()){
    		tope++;
    		p[tope]=x;
    	}
    }
    //Eliminar
    
    public String eliminar(){
    	String borrado;
    	if(!estaVacia()){
    		
    		borrado =p[tope];
    		p[tope]=null;
    		tope--;
    		
    	}else{
    		borrado=null;
    	}
    	return borrado;
    		
    	}
    
    //# de datos que hay actualmente en la pila
    public int numElementos(){
    	return(tope+1); // esta exprecion no modifica el tope
    }
    
    //toString
    public  String toString(){
    	
    	String s="";
    	int i;
    	for(i=tope;i>=0;i--){
    		s+=p[i]+ "\n";
    	}
    	
    	return s;
    	}
    }
    

    
	
	
	


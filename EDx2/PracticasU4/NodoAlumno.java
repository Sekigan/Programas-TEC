package PracticasU4;

/*  Clase instanciable para construir objetos (NODOS) con 2 datos 
     (1 string y 1 float) y 1 liga o apuntador  */

public class NodoAlumno {
      // atributos
      private int numControl;
      private String nombre;
      private float calif;
      private NodoAlumno liga;

      // 1er. constructor
      public NodoAlumno() {
    	numControl=0;
    	nombre = "";
    	calif = 0;
    	liga = null;
       }

       // 2do. constructor
       public NodoAlumno( int nc, String nom, float cal) {
    	numControl=nc;
    	nombre = nom;
    	calif = cal;
    	liga = null;
       }

      // 3er. constructor
       public NodoAlumno(int nc ,String nom, float cal, NodoAlumno enlace) {
    	numControl=nc;
       	nombre = nom;
       	calif = cal;
       	liga = enlace;
      }

      // Métodos set… y get…
       public void setnumControl(int nc) {
       	numControl= nc;
       }

       public void setNombre(String nom) {
    	nombre = nom;
       }

      public void setCalif(float Calif) {
    	calif= Calif;
       }

       public void setLiga(NodoAlumno nuevaLiga) {
    	liga = nuevaLiga;
       }
       
       public int getnumControl(){
       	return numControl;
        }
       
       public String getNombre(){
    	return nombre;
       }

       public float getCalif(){
    	return calif;
      }

      public NodoAlumno getLiga(){
     	return liga;
       }

       public String toString()   {
    	   String s="";
    	   s+="Numero de Control: "+numControl+"\n";
    	   s+="Nombre: "+nombre+"\n";
    	   s+="Calificacion: "+calif+"\n";
    	 
    	return s;
       }
 }

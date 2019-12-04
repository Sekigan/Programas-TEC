package PracticasU4;

/*  Clase instanciable para construir objetos (NODOS) con 2 datos 
     (1 string y 1 float) y 1 liga o apuntador  */

public class Nodo {
      // atributos
      private String dato1;
      private float dato2;
      private Nodo liga;

      // 1er. constructor
      public Nodo() {
    	dato1 = "";
    	dato2 = 0;
    	liga = null;
       }

       // 2do. constructor
       public Nodo(String d1, float d2) {
    	dato1 = d1;
    	dato2 = d2;
    	liga = null;
       }

      // 3er. constructor
       public Nodo(String d1, float d2, Nodo enlace) {
    	dato1 = d1;
    	dato2 = d2;
    	liga = enlace;
      }

      // Métodos set… y get…
      public void setDato1(String nuevoDato1) {
    	dato1 = nuevoDato1;
      }

      public void setDato2(float nuevoDato2) {
    	dato2 = nuevoDato2;
       }

       public void setLiga(Nodo nuevaLiga) {
    	liga = nuevaLiga;
       }

       public String getDato1(){
    	return dato1;
       }

       public float getDato2(){
    	return dato2;
      }

      public Nodo getLiga(){
     	return liga;
       }

       public String toString()   {
    	return "Dato 1: "+dato1 + "\nDato 2: " + dato2;
       }
 }

package PracticasU2;
// para que jale este pograma requieres la clase PilaInt Angel de jesu perales garcia
import javax.swing.JOptionPane;

public class Practica8{

    public static void main(String args [ ]) {

    // DECLARACION DE VARIABLES

    int opcion, num, totalOpciones;

    // VARIABLE String  DONDE SE VAN ARMANDO LAS OPCIONES DEL MENU
    String menu = " MENU DE OPCIONES \n";
    menu += "1.  Insertar un numero \n";
    menu += "2.  Mostrar pila de positivos  \n";
    menu += "3.  Mostrar pila de negativos \n";
    menu += "4.  Eliminar un numero positivo \n";
    menu += "5.  Eliminar un número negativo \n";
    menu += "6.  Cuántos positivos y cuántos negativos  \n";
    menu += "7.  Salir \n";

    totalOpciones = 7;
    
    //declaracion y creacion de dos pilas de numeros
    
    PilaInt a=new PilaInt(15);
    PilaInt b=new PilaInt(15);

    // CICLO ITERATIVO QUE PRESENTA EL MENU DE OPCIONES HASTA QUE EL USUARIO SELECCIONE LA OPCION 5

    do {
    	opcion = Integer.parseInt (JOptionPane.showInputDialog (menu));  // SE CAPTURA DEL TECLADO UN ENTERO (NUMERO DE LA OPCION)

    	switch (opcion){
    		   case 1:
    		   	             num=Integer.parseInt(JOptionPane.showInputDialog("Dame un numero, por favor  "));
    		   	             if(num>=0){       //el numero positivo
    		   	            	 
    		   	            	 a.insertar(num);
    		   	             }else{
    		   	            	 
    		   	            	 b .insertar(num);
    		   	             }

    			              break;
    		   case 2:
                               JOptionPane.showMessageDialog (null, "Pila de Positivos\n" + a.toString()) ;

    			              break;
    		   case 3:
                               JOptionPane.showMessageDialog (null, "Pila de Negativos \n" + b.toString()) ;

    			              break;
    			              
    		   case 4:       if(!a.estaVacia()){
                               JOptionPane.showMessageDialog (null,"Datos eliminados de la pila de positivo\n" + a.toString());
    		             }else{
    			              JOptionPane.showMessageDialog (null,"Pila vacia no se puede eliminar");
    		                  }
    			              break;
    			              
    		   case 5:
    			        if(!b.estaVacia()){
                            JOptionPane.showMessageDialog (null,"Datos eliminados de la pila de negativos\n" + a.toString());
	                      }else{
		                    JOptionPane.showMessageDialog (null,"Pila de negativos vacia no se puede eliminar");
	                           }
		                        break;
    				        
    		   case 6:       
		   	                   JOptionPane.showMessageDialog (null, "numero de elementos de la  pila de positivos \n" + a.numElementos());
		   	                   JOptionPane.showMessageDialog (null, "numero de elementos de la  pila de negativos \n" + b.numElementos());
			                  break;
			        
			        
	          case 7:
   	                          JOptionPane.showMessageDialog (null, "Fin del Programa");
	                          break;


    		default:
    				        JOptionPane.showMessageDialog (null, "Opción NO válida");
    				       break;

    	}  //  FIN DEL SWITCH

    } while (opcion != totalOpciones);   // FIN DEL DO..WHILE


    }  // FIN DEL METODO main


}  // FIN DE LA CLASE
/**
 * @(#)AdmiCuenta.java
 *
 *
 * @author 
 * @version 1.00 2015/12/3
 */



import javax.swing.*;
public class AdmiCuenta {
public static void main (String[] args) {
 int opcion;
 double cantidad1, cantidad2;
  Cuenta r1=new Cuenta();
  String menu = "             MENU DE OPCIONES \n";
	    menu += "1.  Insertar nombre \n";
	    menu += "2.  Numero de cuenta \n";
	    menu += "3.  Tu saldo minimo: \n";
	    menu += "4.  Quieres depositar ? \n";
	    menu += "5.  Quieres Retirar? \n";
	    menu += "6.  Tus datos \n";
	    menu += "7.  Saldo \n";
	    menu += "8.  Salir \n";
		do{
		    opcion= Integer.parseInt(JOptionPane.showInputDialog(menu));
		    switch(opcion){
		        case 1:
		        
		        r1.setTitular(JOptionPane.showInputDialog(null," Ingresa nombre"));
		          break;
		          
		        case 2:
		        r1.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta tu numero de cuenta")));
		        break;
		        
		        case 3:
		        r1.setMinimo(Double.parseDouble(JOptionPane.showInputDialog(null,"Inserta Saldo Minimo")));
		       
		        break;
		        
		        case 4:
		        	double deposito;
		        	
		        	deposito=r1.Depositar(); 
		        	
		        	 
		        JOptionPane.showInputDialog(null,"Cuanto quieres depositar?");
		      
		       break;
		       
		        
		        case 5:
		        	double retiro;
		        	retiro=r1.Retirar(); 
		        	
		        JOptionPane.showInputDialog(null,"Cuanto quieres retirar");
		        
		        break;
		        
		        
		        case 6:
		        JOptionPane.showMessageDialog(null,"tus Datos---->"+r1.toString());
		        break;
		        
		        case 7:
		        double Saldo;
		        Saldo=r1.getSaldo();
		        JOptionPane.showMessageDialog(null,"Tu saldo es---->"+Saldo);
		      break;
		      
		     case 8:
		     JOptionPane.showMessageDialog (null, "Fin del Programa, Adios");
}
  
    
    
		    } while (opcion !=8);   }}
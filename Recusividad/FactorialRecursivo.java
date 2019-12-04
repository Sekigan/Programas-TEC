package Recusividad;

import javax.swing.JOptionPane;

public class FactorialRecursivo {
	public long factorial(long n){
		if(n==1)
			return 1;
		else 
			return n*factorial(n-1);
	}
	public static void main (String [] args){
		int u ;
		u=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
		JOptionPane.showMessageDialog(null,new FactorialRecursivo().factorial(u));
	}
	

}

package Recusividad;

import javax.swing.JOptionPane;

public class SumarNenteros {
	
	int  suma = 0;
	public int sumarIterativo(int n){
		for(int contador=1; contador <= n; contador++){
			suma += Integer.parseInt(JOptionPane.showInputDialog("Ingresa numero"));
		}
		return suma;
	}


public int sumaRecursiva(int n){
	if (n==0){
		return 0;
	}
	else{
		return Integer.parseInt(JOptionPane.showInputDialog("Ingresa numero")) + sumaRecursiva(n-1);
	}
} 
   public static void  main(String[]args){
	   
	   SumarNenteros obj = new SumarNenteros();
	   int n= Integer.parseInt(JOptionPane.showInputDialog("Cuantos numeros vas a sumar"));
	   JOptionPane.showMessageDialog(null, obj.sumarIterativo(n));
	   JOptionPane.showMessageDialog(null, obj.sumaRecursiva(n));
   }
}
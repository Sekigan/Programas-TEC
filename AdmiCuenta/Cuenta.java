/**
 * @(#)Cuenta.java
 *
 *
 * @author 
 * @version 1.00 2015/12/3
 */
public class Cuenta {

    private int numero;
    private String titular;
    private double minimo;
    
    private double Saldo;
    
    public void setNumero(int N){
        this.numero=N;
    }
    public void setTitular(String T){
    	this.titular=T;
    }
    public void setMinimo(double M){
    	this.minimo=M;
    } 
    
  
    public int getNumero(){
    	return numero;
    }
    public String getTitular(){
    	return titular;
    }	
    public double getMinimo(){
    	return minimo;
    }
     public double getSaldo(){
    	return Saldo;
    }
		
  public double Depositar()
  {double deposito=0;
  deposito=Saldo+deposito;
 
  return deposito;}
  	
		public double Retirar(){
		double retiro=0;
		retiro=Saldo-retiro;
		
		return retiro;}
		
		 
		 
   public String toString(){
       return "numero /"+numero  +      
               "Titular: /"+titular +  
               "minimo /"+minimo;
             }
}
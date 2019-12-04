package practicaCuenta;

public class Cuenta {
	private String ncuenta;
	private  double saldo;
	
	
	public Cuenta (String ncuenta,double saldo){
		this.ncuenta=ncuenta;
		this.saldo=saldo;
	}
	
/* pediral usurio saldo inicial
 * double saldo = Double.parseDouble(JOptionPane.showInputDialog("ingrese Saldo"));}
 * 
 * pedir cuenta 
 * string cuenta =JOptionPane.showInputDialog("Ingrese numero de cuenta"));
 * 
 * crear un objeto de la clase cuenta
 * cuenta cuenta1= new cuenta(cuenta,saldo);
 */
	
	
	public void setnCuenta(String N ){
		ncuenta=N;
	}
	
	public String getnCuenta(){
		
		return ncuenta;
	}
	public void setSaldo(double S){
		saldo=S;
	}
	public double getSaldo(){
		return saldo;
	}
	
	public  boolean depo(double monto){
		if(monto<0){
			return false;
		}
		else{
		saldo += monto ;
		return true;
		}
	}
	
	public 	boolean retirar(double monto){
		if(monto <= saldo){
			
			saldo -= monto;
		  return true;
		  
		
		}else{
			return false;
		}
	}
		public String toString(){
			return "Numero de cuenta: " + ncuenta+
					"\t Saldo final: " + saldo;
		}

			
		}
	
		
	
	
	
	



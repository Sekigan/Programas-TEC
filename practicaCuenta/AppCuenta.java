package practicaCuenta;

import javax.swing.JOptionPane;

public class AppCuenta {

	public static void main(String[] args) {
		
		
		int opcion;
		
		opcion=Integer.parseInt(JOptionPane.showInputDialog("Cuantas cuentas ingresara?:"));
		if(opcion>20){
			JOptionPane.showMessageDialog(null,"El programa solo puede aceptar maximo 20 cuentas el total de cuentas sera fijado en 20");
			opcion=20; 
		}
		Cuenta[]cuentas=new Cuenta[opcion];
		
		for(int i=0 ; i<cuentas.length; i++){
			String numero;
			double saldo;
			
			numero=JOptionPane.showInputDialog(null, "Numero de Cuenta: ", "Cuenta "+(i+1), JOptionPane.QUESTION_MESSAGE);
			saldo=Double.parseDouble(JOptionPane.showInputDialog(null, "Saldo inical: ", "Cuenta "+(i+1), JOptionPane.QUESTION_MESSAGE));
			
			cuentas[i]=new Cuenta(numero,saldo);
		
		}
		
		int r=JOptionPane.showConfirmDialog(null, "Desea realizar alguna Transaccion", "Continuar?", JOptionPane.YES_NO_OPTION);
		while(r==0){
			int i=0;
			String numCuenta=JOptionPane.showInputDialog("Dame el numero de cuenta");
			while(!cuentas[i].getnCuenta().equals(numCuenta)){
				i++;
			}
			int opcionRetiroDeposito=Integer.parseInt(JOptionPane.showInputDialog(null,"Que desea realizar? "
					+ "\n1) Depositar"
					+ "\n2) Retirar", "Cuenta "+cuentas[i].getnCuenta(), JOptionPane.QUESTION_MESSAGE));
			if(opcionRetiroDeposito==1){
				int monto=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese monto a depositar: ", "Cuenta "+cuentas[i].getnCuenta(), JOptionPane.QUESTION_MESSAGE));
				if(cuentas[i].depo(monto)){
					JOptionPane.showMessageDialog(null, "Deposito Exitoso");
				}
				else{
					JOptionPane.showMessageDialog(null, "Error al realizar accion");
				}
			}
			else if(opcionRetiroDeposito==2){
				int monto=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese monto a retirar: ", "Cuenta "+cuentas[i].getnCuenta(), JOptionPane.QUESTION_MESSAGE));
				if(cuentas[i].retirar(monto)){
					JOptionPane.showMessageDialog(null, "Retiro Exitoso");
				}
				else{
					JOptionPane.showMessageDialog(null, "Error al realizar accion");
				}
			}
			
			
			r=JOptionPane.showConfirmDialog(null, "Desea realizar otra Transaccion", "Contirnuar?", JOptionPane.YES_NO_OPTION);
		
		}
		String mensaje="";
		for(int i=0;i<cuentas.length;i++){
			mensaje+="Cuenta "+(i+1)+"\n"+cuentas[i].toString()+"\n\n";
		}
		JOptionPane.showMessageDialog(null, mensaje);
		
		
		
		
		
		
		
		
		
	}
	
}

	
	

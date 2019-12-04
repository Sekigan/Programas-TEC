package Arrays;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class BinaDec {

	//Binario a decimal Iterativo
		 public int binEntIterativo(int[] arrEnteros){
			 
			 int pot = 0;
			 int suma = 0;
			 
			 for(int ind=arrEnteros.length-1; ind>=0; ind-- ){
				 suma += arrEnteros[ind] * Math.pow(2, pot);
				 pot ++;
			 }
		return suma;
	}


 
        public static void main(String[]args){
	BinaDec obj = new BinaDec();
	int [] arreglo = {1,0,1,1,1,};
	JOptionPane.showMessageDialog(null, Arrays.toString(arreglo)+"----->"+obj.binEntIterativo(arreglo));
}
}
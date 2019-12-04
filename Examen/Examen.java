package Examen;

import javax.swing.JOptionPane;

public class Examen {
	
	    static int pos=0;
	    public static void main(String[] args) {
	        int a[] = {6,5,4,3,2,4,5,6};
	        JOptionPane.showMessageDialog(null,"Si Contiene un 6"+"\n" +(contieneUn6(a,6)));
	        
	    }
	    
	    public static boolean contieneUn6(int[] arr, int numeroABuscar) {
	        if (pos>=arr.length) {
	            pos=0;
	            return false;
	        }
	        if (arr[pos]==numeroABuscar)
	            return true;
	        else {
	            pos++;
	            return contieneUn6(arr, numeroABuscar);
	        }

	    

	}

}

package PracticasU1;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Fibonnaci {

	public static void main(String[] args) {
		int n = 20;
		int fib[] = new int[n];

		fib[0] = 0;
		fib[1] = 1;

		for (int i = 2; i < fib.length; i++) {
			fib[i] = fib[i - 1] + fib[i - 2]                            ;

		}

		JOptionPane.showMessageDialog(null, Arrays.toString(fib));

	}  
}

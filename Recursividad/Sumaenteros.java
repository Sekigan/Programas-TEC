package Recursividad;

import javax.swing.JOptionPane;

public class Sumaenteros {
	public static int fibonacci(int n) {
		if (n <= 2)
			return 1;

		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		int u = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero"));
		JOptionPane.showMessageDialog(null, fibonacci(u));
	}
}

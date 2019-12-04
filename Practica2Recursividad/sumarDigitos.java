package Practica2Recursividad;

import javax.swing.JOptionPane;

public class sumarDigitos {

	public static int suma(int digito) {

		int suma;
		if (digito == 0)
			return 0;
		else {
			suma = digito % 10;
			digito = digito / 10;
			return suma + suma(digito);
		}
	}

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
		JOptionPane.showMessageDialog(null, "La suma es: " + suma(numero));
	}
}

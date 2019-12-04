package PracticasU1;

import javax.swing.JOptionPane;

public class Practica4 {
	public static void main(String[] args) {
		// inciso A
		float calif[] = new float[7];

		// leer de teclado para llenar vector
		int i;
		for (i = 0; i < calif.length; i++) {
			calif[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Dame la la calificacion " + i));

		}

		double suma = 0;
		for (i = 0; i < calif.length; i++) {
			suma += calif[i];
		}

		System.out.println("calificaciones[" + i + "]=" + calif[i]);
		System.out.println("el promedio de las calificaciones es :" + (suma / calif.length));

		// inciso b
		int num[] = new int[8];

		// llenar vector

		for (i = 0; i < num.length; i++) {
			
			num[i] = (int) Math.pow(3, i);

		}
		System.out.println("vector numero[" + i + "]=" + num[i]);
	}
}

package PracticasU1;

import javax.swing.JOptionPane;

public class Practica5 {
	public static void main(String[] args) {
		// inciso A

		// declarar vector
		float calif[] = new float[7];

		// leer de teclado para llenar vector
		int i;
		for (i = 0; i < calif.length; i++) {
			calif[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Dame la calificacion " + i));

		}

		double suma = 0;
		for (i = 0; i < calif.length; i++) {
			suma += calif[i];
		}

		System.out.println("calificaciones[" + i + "]=" + calif[i]);
		System.out.println("el promedio de las calificaciones es :" + (suma / calif.length));

		// inciso B

		// vector
		int num[] = new int[5];

		// llenar vector con ciclo

		int x = 2;
		for (i = 0; i < num.length; i++) {
			num[i] = x;
			x += 2;

		}
		System.out.println("vector resultante[" + i + "]=" + num[i]);

		// inciso C
		for (i = 0; i < num.length; i++) {
			if (i % 2 == 1)

				num[i] *= 3;

		}
		System.out.println("vector impar[" + i + "]=" + num[i]);

		// inciso D
		int cont = 0;
		for (i = 0; i < calif.length; i++) {
			if (calif[i] < 70)
				cont++;
		}
		System.out.println("la cantidad de calificaciones reprobadas son :" + cont);

	}
}

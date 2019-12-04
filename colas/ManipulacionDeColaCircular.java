package colas;

import java.awt.HeadlessException;
import java.util.Random;

import javax.swing.JOptionPane;

public class ManipulacionDeColaCircular {

	public static String calcularCola(ColaCircular c1) {

		int contador = 0;
		int suma = 0;
		int elemento = 0;
		int mayor = 0;
		ColaCircular aux = new ColaCircular(c1.getTam());

		while (!c1.isVacio()) {
			try {
				elemento = (int) c1.desencolar();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			suma += elemento;
			if (elemento > mayor)
				mayor = elemento;
			try {
				aux.encolar(elemento);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			contador++;
		}
		while (!aux.isVacio()) {
			try {
				c1.encolar(aux.desencolar());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return "La Cola Tiene: " + contador + " Elementos \n La Suma de sus Elementos es: " + suma
				+ "\n El Elemento Mayor es: " + mayor;

	}

	public static void eliminarMayores(ColaCircular c2, int ref) {

		ColaCircular aux2 = new ColaCircular(c2.getTam());
		int elemento = 0;

		while (!c2.isVacio()) {
			try {
				elemento = (int) c2.desencolar();
			} catch (Exception e) {

				e.printStackTrace();
			}

			if (elemento < ref) {
				try {
					aux2.encolar(elemento);
				} catch (Exception e) {

					e.printStackTrace();
				}

			}}
			while (!aux2.isVacio()) {
				try {
					c2.encolar(aux2.desencolar());
				} catch (Exception e) {

					e.printStackTrace();
				}
			}
		
		

	}

	public static void main(String[] args) throws HeadlessException, Exception {

		int tam = Integer.parseInt(JOptionPane.showInputDialog("Dame el tamaño de la cola"));

		ColaCircular ColaA = new ColaCircular(tam);

		for (int i = 0; i < tam; i++) {

			int elemento = new Random().nextInt(100);
			try {
				ColaA.encolar(elemento);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Cola llena");

			}

		}

		JOptionPane.showMessageDialog(null, ColaA.toString() + calcularCola(ColaA));

		int n = Integer.parseInt(
				JOptionPane.showInputDialog("Inserte el valor de referencia del cual se eliminaran los mayores "+"\n" +ColaA));
		eliminarMayores(ColaA, n);
		JOptionPane.showMessageDialog(null, "Elementos Menores a  "+ n +"\n"+ ColaA.toString());
	}
}

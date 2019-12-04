package PracticasU1;

import javax.swing.JOptionPane;

public class Practica3Vectores {

	public static void main(String[] args) {

		// A)
		int[] vA, vB;

		// B)
		vA = new int[7];
		JOptionPane.showMessageDialog(null, " " + vA[6]);
		// C)
		vB = new int[10];
		JOptionPane.showMessageDialog(null, "Tamaño de vB es de " + vB.length);

		// D)
		int cont = 1;
		String s = "";
		for (int i = 0; i < vA.length; i++) {
			vA[i] = cont;
			cont += 2;
			s += "vA[+i+]=" + vA[i] + "\n";

		}
		JOptionPane.showMessageDialog(null, s);

		// E)
		String s1 = "";
		for (int i = 0; i < vB.length; i++) {
			vB[i] = Integer.parseInt(JOptionPane.showInputDialog("Dame numero impares"));
			s1 += "vB[+i+]=" + vB[i] + "\n";

		}
		JOptionPane.showMessageDialog(null, s1);
		//F)
		JOptionPane.showMessageDialog(null, "Datos del Vector A\n" + s + "\nDatos del Vector B\n" + s1);
		//G)
		String vA1 = "";
		int suma=0;
		for (int i = 0; i < vA.length; i++) {

			suma += vA[i];
			vA1 = "Suma de los datos " + suma;
		}
		JOptionPane.showMessageDialog(null, vA1);
		String vB1="";
		String vB2="";
	for (int i = 0; i < vA.length; i++){
		if(vB[i]<0){
			vB1="Numero negativo"+vB[i];
		}
		else{
			vB2="Numero positivo"+vB[i];
		}
		
	}
	JOptionPane.showMessageDialog(null, vB1);
	JOptionPane.showMessageDialog(null, vB2);
	}

}

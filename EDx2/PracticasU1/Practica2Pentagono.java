package PracticasU1;

import javax.swing.JOptionPane;

public class Practica2Pentagono {
	public static void main(String[] args) {

		// inciso a)
		Pentagono pent1, pent2, pent3;

		// inciso b)
		pent1 = new Pentagono();

		// inciso c)
		float l = Float.parseFloat(JOptionPane.showInputDialog("Dame el lado"));
		float a = Float.parseFloat(JOptionPane.showInputDialog("Dame apotema"));
		pent2 = new Pentagono(l, a);

		// inciso d)
		pent3 = pent2;
		
		//inciso e)
	
		JOptionPane.showMessageDialog(null,
				"\n Datos PENTAGONO 1 " + pent1.toString() + 
				"\n Datos PENTAGONO 2 " + pent2.toString() + 
				"\n Datos PENTAGONO 3 " + pent3.toString());
		//incisof)
		JOptionPane.showMessageDialog(null,
				"Area de pent1 \n"+pent1.calcularArea()+
				"\nArea de pent 2 \n"+pent2.calcularArea());

		//inciso g)
		pent3=new Pentagono(13.45f,2.093f);
		JOptionPane.showMessageDialog(null,"Pentagono 3"+pent3.toString());
		//inciso h)
		JOptionPane.showMessageDialog(null,"Area de Pentagono3\n"+pent3.calcularArea()+
				"\nPerimetro de Pentagono3\n"+pent3.calcularPerimetro());
		
		//inciso i)
		pent1.setLado(pent2.getLado());
		pent1.setApotema(pent2.getApotema());
		//inciso j)
		JOptionPane.showMessageDialog(null,
				"\n Datos PENTAGONO 1 " + pent1.toString() + 
				"\n Datos PENTAGONO 2 " + pent2.toString() + 
				"\n Datos PENTAGONO 3 " + pent3.toString());
	}
}

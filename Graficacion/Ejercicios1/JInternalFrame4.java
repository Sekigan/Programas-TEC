package Ejercicios1;

import javax.swing.*;
/*
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 5 de Septiembre de 2017 
 * Ventana con frames dentro de mama Frame :)
 */
public class JInternalFrame4 {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setTitle("Internal Frame");
		f.getContentPane().setLayout(null);
		f.setSize(230,200);
		JInternalFrame f1 = new JInternalFrame("InternalFrame 1");
		f1.setBounds(10,10,150,100);
		f1.setVisible(true);
		JInternalFrame f2=new JInternalFrame("InternalFrame 2");
		f2.setBounds(50, 50, 150, 100);
		f2.setVisible(true);
		f.getContentPane().add(f1);
		f.getContentPane().add(f2);
		
		f.setVisible(true);
	}

}

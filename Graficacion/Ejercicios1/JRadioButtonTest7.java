package Ejercicios1;

import java.awt.FlowLayout;

import javax.swing.*;
/*
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 5 de Septiembre de 2017 
 * ventana de eleccion
 */
public class JRadioButtonTest7 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("JRadioButtonTest");
		f.setSize(200,150);
		f.getContentPane().setLayout(new FlowLayout());
		ButtonGroup bg=new ButtonGroup();
		JRadioButton c1=new JRadioButton("Hombre",true);
		bg.add(c1);
		JRadioButton c2=new JRadioButton("Mujer",true);
		bg.add(c2);
		f.getContentPane().add(c1);
		f.getContentPane().add(c2);
		f.setVisible(true);
	}
}

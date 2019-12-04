package Ejercicios1;

import java.awt.*;
import javax.swing.*;
/*
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 5 de Septiembre de 2017 
 *selección de 2 variables 
 */


public class JToggleButtonTest8 {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setTitle("JToggleButtonTest");
		f.setSize(200,150);
		f.getContentPane().setLayout(new FlowLayout());
		ButtonGroup bg=new ButtonGroup();
		JToggleButton b1=new JToggleButton("Hombre",true);
		bg.add(b1);
		JToggleButton b2=new JToggleButton("Mujer",false);
		bg.add(b2);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.setVisible(true);
		
	}
}

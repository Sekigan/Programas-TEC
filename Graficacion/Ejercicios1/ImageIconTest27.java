package Ejercicios1;

import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;
/*
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 5 de Septiembre de 2017 
 * Ventana con imagen pero no me sale FeelsBadMan
 */
public class ImageIconTest27 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("ImageIconTest");
		f.setSize(700, 750);
		f.getContentPane().setLayout(new FlowLayout());
		JLabel I = new JLabel();
		I.setIcon(new ImageIcon("duke.jpg"));
		f.getContentPane().add(I);
		f.setVisible(true);
	}
}

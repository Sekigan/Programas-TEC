package Ejercicios1;

import java.awt.*;
import javax.swing.*;
/*
 *  * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 5 de Septiembre de 2017 
 * Ventana para escribir texto 
 */
public class JTextFIeld14 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("JTextField");
		f.setSize(200, 150);
		f.getContentPane().setLayout(new FlowLayout());
		JTextField tf=new JTextField("Escribe aqui...");
		f.getContentPane().add(tf);
		f.setVisible(true);
	}
}

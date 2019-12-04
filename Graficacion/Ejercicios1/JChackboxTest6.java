package Ejercicios1;

import java.awt.*;
import javax.swing.*;

public class JChackboxTest6 {
	/*
	 * LUIS URIEL GARCIDUEÑAS FRAUSTRO 
	 * 5 de Septiembre de 2017 
	 * Ventana de confirmacion
	 */

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("JCheckBoxTest");
		f.setSize(200, 150);
		f.getContentPane().setLayout(new FlowLayout());
		;
		JCheckBox c = new JCheckBox("Mayor de 18 añitos?");
		f.getContentPane().add(c);
		f.setVisible(true);
	}

}

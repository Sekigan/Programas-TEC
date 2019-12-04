package Ejercicios1;

import java.awt.*;
import javax.swing.*;

/*
 * * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 5 de Septiembre de 2017 
 * 2 Mensajes en una ventana
 */

public class JLabelTest10 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("JLabelTest");
		f.setSize(200,150);
		f.getContentPane().setLayout(new FlowLayout());
		JLabel l1 = new JLabel("Etiqueta");
		JLabel l2 = new JLabel();
		l2.setText("Otra Etiqueta");
		f.getContentPane().add(l1);
		f.getContentPane().add(l2);
		f.setVisible(true);
	}

}

package Ejercicios1;

import java.awt.*;
import javax.swing.*;
/*
 *  * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 5 de Septiembre de 2017 
 * Scroll bar horizontal para visualizacion
 */
public class JScrollBar13 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("JScrollBarTest");
		f.setSize(200, 150);
		f.getContentPane().setLayout(new FlowLayout());
		JScrollBar sb= new JScrollBar(JScrollBar.HORIZONTAL);
		f.getContentPane().add(sb);
		f.setVisible(true);
	}
}

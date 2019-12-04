package Ejercicios1;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 5 de Septiembre del 2017
 * Ventana con consejo de texto
 */
public class JToolTip23 {
public static void main(String[] args) {
	JFrame f=new JFrame();
	f.setTitle("JToolTest");
	f.setSize(200,150);
	f.getContentPane().setLayout(new FlowLayout());
	JButton b = new JButton("OK");
	b.setToolTipText("Pulsar OK");
	f.getContentPane().add(b);
	f.setVisible(true);
}
}

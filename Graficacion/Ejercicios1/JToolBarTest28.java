package Ejercicios1;

import java.awt.*;
import javax.swing.*;
/*
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 5 de Septiembre de 2017 
 * Barra de tarea para interfaz no me sale :(
 */
public class JToolBarTest28 {
public static void main(String[] args) {
	JFrame f=new JFrame();
	f.setTitle("JToolBartest");
	f.setSize(200, 150);
	JToolBar tb=new JToolBar();
	JButton b=new JButton(new ImageIcon("New24.gif"));
	tb.add(b);
	b=new JButton(new ImageIcon("Open24.gif"));
	tb.add(b);
	b=new JButton(new ImageIcon("Save24.gif"));
	tb.add(b);
	b=new JButton(new ImageIcon("Print24.gif"));
	tb.add(b);
	f.getContentPane().add(tb, BorderLayout.NORTH);
	f.setVisible(true);
}
}

package Ejercicios1;

import java.awt.Dimension;
import javax.swing.*;
/*
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 5 de Septiembre de 2017 
 * Podria ser un mini comic 
 */
public class JSplitPane29 {
public static void main(String[] args) {
	JFrame f=new JFrame();
	f.setTitle("JSplitPaneTest");
	f.setSize(275, 252);
	JLabel l1=new JLabel(new ImageIcon("duke.jpg"));
	l1.setMinimumSize(new Dimension(20, 20));
	JLabel l2=new JLabel(new ImageIcon("duke.jpg"));
	l2.setMinimumSize(new Dimension(20, 20));
	JSplitPane sp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, l1, l2);
	sp.setContinuousLayout(true);
	sp.setOneTouchExpandable(true);
	sp.setDividerLocation(100);
	f.getContentPane().add(sp);
	f.setVisible(true);
}
}

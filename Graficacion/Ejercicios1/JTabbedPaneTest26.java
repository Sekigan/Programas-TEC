package Ejercicios1;

import javax.swing.*;
/*
* LUIS URIEL GARCIDUE�AS FRAUSTRO
* 5 de Septiembre de 2017
* Ventana con varias pesta�as para mostrar dirente informacion o datos
*/
public class JTabbedPaneTest26 {
public static void main(String[] args) {
	JFrame f=new JFrame();
	f.setTitle("JTabbedPaneTest");
	f.setSize(200,150);
	JTabbedPane tabbedPane=new JTabbedPane();
	JPanel panel1=new JPanel();
	tabbedPane.addTab("Pesta�a1", panel1);
	JPanel panel2=new JPanel();
	tabbedPane.addTab("Pesta�a2", panel2);
	f.getContentPane().add(tabbedPane);
	f.setVisible(true);
}
}

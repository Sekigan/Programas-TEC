package Ejercicios1;

import javax.swing.*;
/*
* LUIS URIEL GARCIDUEÑAS FRAUSTRO
* 5 de Septiembre de 2017
* Ventana con varias pestañas para mostrar dirente informacion o datos
*/
public class JTabbedPaneTest26 {
public static void main(String[] args) {
	JFrame f=new JFrame();
	f.setTitle("JTabbedPaneTest");
	f.setSize(200,150);
	JTabbedPane tabbedPane=new JTabbedPane();
	JPanel panel1=new JPanel();
	tabbedPane.addTab("Pestaña1", panel1);
	JPanel panel2=new JPanel();
	tabbedPane.addTab("Pestaña2", panel2);
	f.getContentPane().add(tabbedPane);
	f.setVisible(true);
}
}

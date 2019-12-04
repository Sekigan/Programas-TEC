package Ejercicios1;

import javax.swing.*;

/*
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 5 de Septiembre del 2017
 * Ventana que puede mostrar 2 mensajes individuales
 */

public class JDIalogTest24 {
public static void main(String[] args) {
	JFrame f=new JFrame();
	f.setTitle("JFrameTest");
	f.setSize(200, 150);
	f.setVisible(true);
	
	JDialog d=new JDialog(f);
	d.setTitle("JDialogTest");
	d.setBounds(50,50,70,50);
	d.setVisible(true);
}
}

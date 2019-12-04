package Ejercicios1;

import javax.swing.*;
/*
* LUIS URIEL GARCIDUEÑAS FRAUSTRO
* 5 de Septiembre de 2017
* Ventana para abrir archivos
*/
public class JFileChooser18 {
public static void main(String[] args) {
	JFrame f=new JFrame();
	f.setTitle("JFileChooserTest");
	f.setSize(200,150);
	f.setVisible(true);
	
	JFileChooser fc=new JFileChooser();
	int op= fc.showOpenDialog(f);
	if(op==JFileChooser.APPROVE_OPTION)
		System.out.println(fc.getSelectedFile());
	
}
}

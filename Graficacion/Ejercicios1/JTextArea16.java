package Ejercicios1;

import java.awt.*;
import javax.swing.*;
/*
* LUIS URIEL GARCIDUEÑAS FRAUSTRO
* 5 de Septiembre de 2017
* Ventana para escribir texto
*/
public class JTextArea16 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("JTextAreaText");
		f.setSize(200,150);
		f.getContentPane().setLayout(new FlowLayout());
		JTextArea ta=new JTextArea("Escribe aqui..",5,15);
		f.getContentPane().add(ta);
		f.setVisible(true);
		
	}
}

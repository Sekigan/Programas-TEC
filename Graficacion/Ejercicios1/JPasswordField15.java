package Ejercicios1;

import java.awt.*;
import javax.swing.*;

/*
 *  * LUIS URIEL GARCIDUE�AS FRAUSTRO
 * 5 de Septiembre de 2017 
 * LUIS URIEL GARCIDUE�AS FRAUSTRO 
 * Ventana para escribir contrase�a 
 */

public class JPasswordField15 {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setTitle("JPasswordFieldTest");
		f.setSize(200, 150);
		f.getContentPane().setLayout(new FlowLayout());
		JPasswordField pf=new JPasswordField("chemi");
		f.getContentPane().add(pf);
		f.setVisible(true);
	}
}

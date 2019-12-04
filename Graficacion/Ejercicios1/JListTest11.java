package Ejercicios1;

import java.awt.*;
import javax.swing.*;
/*
 *  
 *  * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 5 de Septiembre de 2017 
 * Varias opciones en una ventana
 */

public class JListTest11 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("JListTest");
		f.setSize(200, 150);
		f.getContentPane().setLayout(new FlowLayout());
		String[] lista = { "Primero", "Segundo", "Tercero", "Cuarto" };
		JList l = new JList(lista);
		f.getContentPane().add(l);
		f.setVisible(true);
	}
}

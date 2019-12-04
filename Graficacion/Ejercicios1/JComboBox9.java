package Ejercicios1;

import java.awt.*;
import javax.swing.*;
import javax.swing.JComboBox;
/*
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 5 de Septiembre de 2017 
 * seleccion en menu desplegables 
 */
public class JComboBox9 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		JFrame f= new JFrame();
		f.setTitle("JComboBoxTest");
		f.setSize(200,150);
		f.getContentPane().setLayout(new FlowLayout());
		String [] lista={"Rojo","Amarillo","Blanco"};
		JComboBox c = new JComboBox(lista);
		f.getContentPane().add(c);
		f.setVisible(true);
	}
}

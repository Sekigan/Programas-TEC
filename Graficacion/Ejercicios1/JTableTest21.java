package Ejercicios1;

import java.awt.*;
import javax.swing.*;
/*
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 5 de Septiembre del 2017
 * Ventana para mostrar datos de una BD
 */
public class JTableTest21 {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setTitle("JTableTest");
		f.setSize(600, 150);
		f.getContentPane().setLayout(new FlowLayout());
		Object[][] datos=
			{
					{"Nombre1","Apellido1",new Integer(911234567) },
					{"Nombre2","Apellido2",new Integer(917463527) },
					{"Nombre3","Apellido3",new Integer(912494735) },
					{"Nombre4","Apellido4",new Integer(912387448) },
			};
		String[] columnas={"Nombre","Apellidos","Tfno"};
		JTable t= new JTable(datos,columnas);
		JScrollPane sp=new JScrollPane(t);
		f.getContentPane().add(sp);
		f.setVisible(true);
	}
}

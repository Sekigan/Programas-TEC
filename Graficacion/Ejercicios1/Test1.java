package Ejercicios1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
/*
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 5 de Septiembre de 2017 
 * Boton simple de confirmacion se ve mas viejo
 */
public class Test1 {

	public static void main(String[] args) {
		Frame f=new Frame();
		f.setTitle("Test de Migracion");
		f.setSize(200,150);
		f.setLayout(new FlowLayout());
		Button b=new Button("OK");
		f.add(b);
		f.setVisible(true);

	}

}

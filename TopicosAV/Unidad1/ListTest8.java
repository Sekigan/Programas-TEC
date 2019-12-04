package Unidad1;

/* * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 4 de Septiembre de 2017 
 * Lista de seleccion
 */
import java.awt.*;

public class ListTest8 {
	public static void main(String... args) {
		Frame f = new Frame();
		f.setTitle("ListTest");
		f.setSize(200, 150);
		f.setLayout(new FlowLayout());
		List l = new List(3);
		l.add("Primero");
		l.add("Segundo");
		l.add("Tercero");
		l.add("Cuatro");
		f.add(l);
		f.setVisible(true);
	}
}
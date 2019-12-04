package Ejercicios1;

import javax.swing.*;
/*
 *  * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 5 de Septiembre de 2017 
 * menu de la configuracion de la ventana
 */
public class JMenuBarTest12 {
	public static void main(String[] args) {
		JFrame f = new JFrame("JMenuBarTest");
		f.setSize(200, 150);
		JMenuBar mb = new JMenuBar();
		JMenu m1 = new JMenu("Menu 1");
		m1.add(new JMenuItem("Opcion 1"));
		m1.add(new JMenuItem("Opcion 2"));
		JMenu m2 = new JMenu("Menu2");
		m2.add(new JCheckBoxMenuItem("Opcion1"));
		m2.add(new JCheckBoxMenuItem("Opcion 2", true));
		m2.addSeparator();
		m2.add(new JRadioButtonMenuItem("Opcion 3",true));
		mb.add(m1);
		mb.add(m2);
		f.setJMenuBar(mb);
		f.setVisible(true);
	}
}

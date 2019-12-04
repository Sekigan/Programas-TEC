package Practica1Recursividad;

import javax.swing.JOptionPane;

public class RemplazarXs {

	public static String remplazar(String s, char de, char a) {
		if (s.length() < 1)
			return s;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == de) {
				s = s.substring(0, i) + a + s.substring(++i);
				JOptionPane.showMessageDialog(null, s);
				return remplazar(s, de, a);
			}
		}
		return s;
	}

	public static void main(String[] args) {
		String palabra = JOptionPane.showInputDialog("Inserte Palabra a cambiar");
		char de = 'x';
		char a = 'y';

		JOptionPane.showMessageDialog(null, (palabra));
		String ss = remplazar(palabra, de, a);
		JOptionPane.showMessageDialog(null, ("La nueva palabra es ---->  " + ss));
	}
}

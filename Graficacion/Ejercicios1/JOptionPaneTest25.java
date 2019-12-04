package Ejercicios1;

import javax.swing.*;
/*
* LUIS URIEL GARCIDUEÑAS FRAUSTRO
* 5 de Septiembre de 2017
* Podria servir para ingreso de datos, confirmacion, opcion, informacion
*/

public class JOptionPaneTest25 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("JOptionPaneTest");
		f.setSize(200, 150);
		JOptionPane.showMessageDialog(f, "MessageDialog");
		Object[] opciones = { "Aceptar", "Cancelar" };
		int i = JOptionPane.showOptionDialog(f, "OptionDialog", "Option", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
		i = JOptionPane.showConfirmDialog(f, "ConfirmDIalog");
		String s = JOptionPane.showInputDialog(f, "Input Dialog");
	}
}

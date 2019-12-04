package Unidad1;

import java.awt.Frame;
/*
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 7 DE SEPTIEMBRE 2017
 * Crea un frame con un activador para la ventana.
 */

public class WindowEventTest_1_22 {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setTitle("FrameTest");
		f.setSize(200, 150);
		f.addWindowListener(new WindowListenerTest21());
		f.setVisible(true);
	}
}

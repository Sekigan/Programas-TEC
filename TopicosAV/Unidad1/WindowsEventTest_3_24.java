package Unidad1;

import java.awt.*;
import java.awt.event.*;
/*
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 7 DE SEPTIEMBRE 2017
 */

public class WindowsEventTest_3_24 {
	public static void main(String[] args) {
		WindowsEventTest_3_24 w = new WindowsEventTest_3_24();
	}

	public WindowsEventTest_3_24() {
		Frame f = new Frame();
		f.setTitle("FrameTest");
		f.setSize(200, 150);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent ev) {
				System.exit(0);
			}
		});
		f.setVisible(true);
	}
}

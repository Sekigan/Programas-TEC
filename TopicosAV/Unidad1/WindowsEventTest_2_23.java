package Unidad1;

import java.awt.*;
import java.awt.event.*;
/*
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 7 DE SEPTIEMBRE 2017
 */

public class WindowsEventTest_2_23 implements WindowListener {
	public static void main(String[] args) {
		WindowsEventTest_2_23 w = new WindowsEventTest_2_23();
	}

	public WindowsEventTest_2_23() {
		Frame f = new Frame();
		f.setTitle("FrameTest");
		f.setSize(200, 150);
		f.addWindowListener(this);
		f.setVisible(true);
	}

	public void windowActivated(WindowEvent ev) {
	}

	public void windowClosed(WindowEvent ev) {
	}

	public void windowClosing(WindowEvent ev) {
		System.exit(0);
	}

	public void windowDeactivated(WindowEvent ev) {
	}

	public void windowDeiconified(WindowEvent ev) {
	}

	public void windowIconified(WindowEvent ev) {
	}

	public void windowOpened(WindowEvent ev) {
	}
}

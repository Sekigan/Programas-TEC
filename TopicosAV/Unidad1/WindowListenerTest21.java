package Unidad1;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/*
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 7 DE SEPTIEMBRE DEL 2017
 * muestra los adaptadores, los cuales funcionan al ser aplicados, este cierra
 * o termina un proceso.
 */
 

public class WindowListenerTest21 extends WindowAdapter {
	public void windowClosing(WindowEvent ev) {
		System.exit(0);
	}
}

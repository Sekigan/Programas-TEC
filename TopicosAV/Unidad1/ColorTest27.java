package Unidad1;
/*
* LUIS URIEL GARCIDUEÑAS FRAUSTRO
* 7 DE SEPTIEMBRE DEL 2017
* 
* Crea una ventana que cambia de color negro a 
* rojo dependiendo del movimiento del mouse.
*/


import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class ColorTest27 {

	Frame f = null;

	public static void main(String[] args) {
		new ColorTest27();
	}

	public ColorTest27() {
		f = new Frame();
		f.setTitle("ColorTest");
		f.setSize(300, 150);
		f.setBackground(Color.BLACK);
		f.setVisible(true);
		f.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent ev) {
				int r = f.getBackground().getRed();
				if (r < 255)
					f.setBackground(new Color(r + 1, 0, 0));
				else
					f.setBackground(Color.BLACK);
			}
		});
	}

}
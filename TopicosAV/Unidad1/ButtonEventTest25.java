package Unidad1;

import java.awt.*;

public class ButtonEventTest25 {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setTitle("ButtonEventTest");
		f.setSize(200, 150);
		f.setLayout(new FlowLayout());

		Button b1 = new Button("Aceptar");
		b1.addActionListener(new ActionListenerTest26());
		f.add(b1);
		Button b2 = new Button("Cancelar");
		b2.addActionListener(new ActionListenerTest26());
		f.add(b2);
		f.setVisible(true);
	}
}

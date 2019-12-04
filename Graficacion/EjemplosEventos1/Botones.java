package EjemplosEventos1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Botones extends JApplet implements ActionListener {

	private JButton rojo, azul, negro;
	private Rect miRect;
	private Color color;

	public void init() {
		Container c = getContentPane();
		JPanel panelDeBotones = new JPanel();

		rojo = new JButton("Rojo");
		panelDeBotones.add(rojo);
		rojo.addActionListener(this);

		azul = new JButton("Azul");
		panelDeBotones.add(azul);
		azul.addActionListener(this);

		negro = new JButton("Negro");
		panelDeBotones.add(negro);
		negro.addActionListener(this);

		c.add(panelDeBotones, BorderLayout.NORTH);

		color = new Color(255, 175, 175);

		miRect = new Rect(color);
		c.add(miRect, BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == rojo)
			color = new Color(255, 0, 0);
		if (event.getSource() == azul)
			color = new Color(0, 0, 255);
		if (event.getSource() == negro)
			color = new Color(0, 0, 0);
		miRect.cambiarColor(color);
		miRect.mostrar();
	}
}

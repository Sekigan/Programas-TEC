package Unidad1;
/* 
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 7 DE SEPTIEMBRE DEL 2017
* En una sola ventana, muestra formas y figuras,de diferentes formas
*/

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

public class GraphicsTest30 extends Frame {
	public static void main(String[] args) {
		new GraphicsTest30().setVisible(true);
	}

	public GraphicsTest30() {
		this.setTitle("GraphicsTest");
		this.setBackground(Color.LIGHT_GRAY);
		this.setSize(300, 150);
	}

	public void paint(Graphics g) {
		g.setColor(Color.LIGHT_GRAY);
		g.draw3DRect(10, 30, this.getWidth() - 20, this.getHeight(), true);
		g.setColor(Color.BLACK);
		g.drawLine(15, 35, 65, 65);
		g.drawRect(70, 35, 50, 30);
		g.drawRoundRect(125, 35, 50, 30, 10, 10);
		g.drawOval(180, 35, 50, 30);
		g.drawArc(235, 35, 50, 30, 25, 200);
		int[] x = { 15, 65, 15, 65 };
		int[] y = { 90, 90, 120, 120 };
		g.drawPolygon(x, y, x.length);
		g.setColor(Color.RED);
		g.fillRect(70, 90, 50, 30);
		g.fillRoundRect(125, 90, 50, 30, 10, 10);
		g.fillOval(180, 90, 50, 30);
		g.fillArc(235, 90, 50, 30, 25, 200);
		g.setColor(Color.BLACK);
		g.setFont(new Font("SansSerif", Font.PLAIN, 9));
		g.drawString("Linea", 30, 80);
		g.drawString("Rectangulos", 95, 80);
		g.drawString("Óvalo", 192, 80);
		g.drawString("Arco", 250, 80);
		g.drawString("Poligono", 22, 135);
		g.drawString("Rectángulos", 95, 135);
		g.drawString("Óvalo", 192, 135);
		g.drawString("Arco", 250, 135);
	}

}

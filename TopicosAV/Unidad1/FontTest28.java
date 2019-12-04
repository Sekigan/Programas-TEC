package Unidad1;


import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;

/*
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 7 DE SEPTIEMBRE
 *  
 * En una ventana crea cinco frases,  cada  una muestra de tipo de 
 * letra, cada uno con estilo diferente.
 */
 
public class FontTest28 {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setTitle("FontTest");
		f.setSize(200, 200);
		f.setLayout(new FlowLayout());
		Label l1 = new Label("Serif");
		l1.setFont(new Font("Serif", Font.PLAIN, 20));
		Label l2 = new Label("SansSreif");
		l2.setFont(new Font("SansSerif", Font.PLAIN, 20));
		Label l3 = new Label("Monospaced");
		l3.setFont(new Font("Monospaced", Font.ITALIC, 20));
		Label l4 = new Label("Dialog");
		l4.setFont(new Font("Dialog", Font.BOLD, 20));
		Label l5 = new Label("DialogInput");
		l5.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 20));
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.setVisible(true);
	}

}

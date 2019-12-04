package Unidad1;
/*
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 7 DE SEPTIEMBRE DEL 2017
* En un frame, crea un boton. Al momento que el cursor del mouse pasa sobre el boton
* el cursor a la manita 
*/


import java.awt.Button;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CursorTest29 {
	Frame f =  null;

	public static void main(String[] args) {
		new CursorTest29();
	}
	
	public CursorTest29(){
		f = new Frame();
		f.setTitle("CursorTest");
		f.setSize(300, 150);
		f.setLayout(new FlowLayout());
		Button b1 = new Button("Aceptar");
		b1.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent ev){
				f.setCursor(Cursor.HAND_CURSOR);
			}
			
			public void mouseExited(MouseEvent ev){
				f.setCursor(Cursor.DEFAULT_CURSOR);
			}
		});
		f.add(b1);
		f.setVisible(true);
	}

}

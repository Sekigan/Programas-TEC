package Unidad1;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 *  LUIS URIEL GARCIDUEÑAS FRAUSTRO
 *  7 DE SEPTIEMBRE DEL 2017 
 * Este codigo tienen que ser heredado a otra clase para poder mostrar las leyendas dependiendo
 * de las acciones.
 */
 class ActionListenerTest26 implements ActionListener{
	public void actionPerformed(ActionEvent ev){
		if(((Button)ev.getSource()).getLabel().equals("Aceptar"))
			System.out.println("Haz pulsado Aceptar");
		else
			System.out.println("Haz pulsado Cancelar");
		
	}

}

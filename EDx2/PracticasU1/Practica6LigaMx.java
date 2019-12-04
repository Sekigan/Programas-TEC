package PracticasU1;

import javax.swing.JOptionPane;

public class Practica6LigaMx {

	public static void main(String[] args) {
		// inciso A)
		EquipoFutbol[] LigaMx = new EquipoFutbol[6];

		int i = 0;
		String nombre;
		int numJugadores;
		int puntos;
		// Inciso B)
		for (i = 0; i < LigaMx.length; i += 2) {
			nombre = JOptionPane.showInputDialog("Dame Nombre");
			numJugadores = Integer.parseInt(JOptionPane.showInputDialog("numero de jugadores"));
			puntos = Integer.parseInt(JOptionPane.showInputDialog("Puntos"));
			LigaMx[i] = new EquipoFutbol(nombre, numJugadores, puntos);
		}
		// Inciso c)
		LigaMx[5] = new EquipoFutbol("BomberosFc", 22, 33);

		// Inciso D
		for (i = 0; i < LigaMx.length; i++) {
			if (LigaMx[i] != null) {
				JOptionPane.showMessageDialog(null, LigaMx[i].toString());
			} else {
				JOptionPane.showMessageDialog(null, "El equipo del indice  [ " + i + " ] no existe");
			}

		}
		// Inciso E)
		int suma = 0;
		for (i = 0; i < LigaMx.length; i++) {
			if (LigaMx[i] != null) {
				suma += LigaMx[i].getPuntos();
			}
		}
		JOptionPane.showMessageDialog(null, "Los Puntos de todos los equipos son : " + suma);
		// Inciso F)
		String n = "";
		for (i = 0; i < LigaMx.length; i++) {
			if (LigaMx[i] != null) {
				if (LigaMx[i].getPuntos() > 15)
					n += LigaMx[i];

			}

		}
		JOptionPane.showMessageDialog(null, "Equipos con mas de 15 puntos \n " + n);
	}

}

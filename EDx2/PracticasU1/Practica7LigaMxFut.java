package PracticasU1;

import javax.swing.JOptionPane;

public class Practica7LigaMxFut {

	public static void main(String[] args) {
		// Inciso a)
		EquipoFutbol[] ligaNorte = new EquipoFutbol[5];
		EquipoFutbol[] ligaSur = new EquipoFutbol[7];

		// inciso B)
		String nombre;
		int numJugadores;
		int puntos;
		int i;

		for (i = 1; i <= 3; i++) {
			nombre = JOptionPane.showInputDialog("Dame Nombre Del Equipo LIGA NORTE").toUpperCase();
			numJugadores = Integer.parseInt(JOptionPane.showInputDialog("numero de jugadores"));
			puntos = Integer.parseInt(JOptionPane.showInputDialog("Puntos"));
			ligaNorte[i] = new EquipoFutbol(nombre, numJugadores, puntos);

		}

		// Inciso C)
		ligaSur[0] = new EquipoFutbol("LOBOSBUAB", 22, 32);
		// Inciso D)
		for (i = 2; i <= 5; i++) {
			nombre = JOptionPane.showInputDialog("Dame Nombre Del Equipo LIGA SUR").toUpperCase();
			numJugadores = Integer.parseInt(JOptionPane.showInputDialog("numero de jugadores"));
			puntos = Integer.parseInt(JOptionPane.showInputDialog("Puntos"));
			ligaSur[i] = new EquipoFutbol(nombre, numJugadores, puntos);

		}

		// Inciso E)
		JOptionPane.showMessageDialog(null, "EQUIPOS LIGA NORTE");
		for (i = 0; i < ligaNorte.length; i++) {
			if (ligaNorte[i] != null) {
				JOptionPane.showMessageDialog(null, ligaNorte[i].toString());
			} else {
				JOptionPane.showMessageDialog(null, "El equipo del indice  [ " + i + " ] no existe");
			}

		}

		JOptionPane.showMessageDialog(null, "EQUIPOS LIGA SUR");
		for (i = 0; i < ligaSur.length; i++) {
			if (ligaSur[i] != null) {
				JOptionPane.showMessageDialog(null, ligaSur[i].toString());
			} else {
				JOptionPane.showMessageDialog(null, "El equipo del indice  [ " + i + " ] no existe");
			}

		}
		// Inciso F)
		String equipoAbuscar = JOptionPane.showInputDialog("Dame el Equipo A Buscar EN LA LIGA NORTE");
		for (i = 0; i < ligaNorte.length; i++) {
			if (ligaNorte[i] != null) {
				if (ligaNorte[i].getNombre().equals(equipoAbuscar)) {
					JOptionPane.showMessageDialog(null, "EL EQUIPO SI EXISTE EN LA LIGA NORTE");
				} else {
					JOptionPane.showMessageDialog(null, "NO SE ENCONTRO EL EQUIPO EN LA LIGA NORTE");
				}

			}
		}
		String equipoAbuscar1 = JOptionPane.showInputDialog("Dame el Equipo A Buscar EN LA LIGA SUR");
		for (i = 0; i < ligaSur.length; i++) {
			if (ligaSur[i] != null) {
				if (ligaSur[i].getNombre().equals(equipoAbuscar1)) {
					JOptionPane.showMessageDialog(null, "EL EQUIPO SI EXISTE EN LA LIGA SUR");
				} else {
					JOptionPane.showMessageDialog(null, "NO SE ENCONTRO EL EQUIPO EN LA LIGA SUR");
				}

			}
		}

		// INCISO G)
		for (i = 0; i < ligaSur.length; i++) {
			if (ligaSur[i] != null) {
				ligaSur[i].setPuntos(ligaSur[i].getPuntos() + 2);
			}
		}
		// Inciso H)
		JOptionPane.showMessageDialog(null, "EQUIPOS LIGA NORTE");
		for (i = 0; i < ligaNorte.length; i++) {
			if (ligaNorte[i] != null) {
				JOptionPane.showMessageDialog(null, ligaNorte[i].toString());
			} else {
				JOptionPane.showMessageDialog(null, "El equipo del indice  [ " + i + " ] no existe");
			}

		}

		JOptionPane.showMessageDialog(null, "EQUIPOS LIGA SUR");
		for (i = 0; i < ligaSur.length; i++) {
			if (ligaSur[i] != null) {
				JOptionPane.showMessageDialog(null, ligaSur[i].toString());
			} else {
				JOptionPane.showMessageDialog(null, "El equipo del indice  [ " + i + " ] no existe");
			}

		}
	}

}

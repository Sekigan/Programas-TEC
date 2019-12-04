package Traductor;

import java.io.*;

import javax.swing.JOptionPane;

public class Practica3 {

	static String[] TradIng = { "The", "silence", "always", "this", "here", "and", "in", "all", "parts", "to", "times", "is",
			"true", "the", "we feel", "plus", "sharp", "there are", "fog", "in", "the", "Meadows", "the", "door", "the",
			"warehouse", "this", "open", "from", "pair", "in", "pair", "to", "the", "far", "sings", "a", "thrush", "y",
			"a", "butterfly", "white", "flaps", "without", "cease", "around", "from", "the", "branch", "of the", "elm",
			"what", "he", "swing", "on", "the", "background", "from", "the", "put", "the", "sun", "the", "twilight",
			"fades", "faces", "and", "signs", "barley", "he", "perceives", "the", "chiaroscuro", "is", "this", "the",
			"night", "the", "heart", "of the", "summer", "and", "the", "old", "clock", "the", "pocket", "starts", "to",
			"tick", "the", "soon", "with", "a", "force", "unused", "above", "of the", "desk." };

	static String[] comEsp = { "el", "silencio", "siempre", "esta", "aqui", "y", "en", "todas", "partes", "a", "veces", "es",
			"cierto", "lo", "sentimos", "mas", "nitido", "hay", "niebla", "en", "los", "prados", "la", "puerta", "del",
			"almacen", "esta", "abierta", "de", "par", "en", "par", "a", "lo", "lejos", "canta", "un", "tordo", "y",
			"una", "mariposa", "blanca", "aletea", "sin", "cesar", "alrededor", "de", "la", "rama", "del", "olmo",
			"que", "se", "mece", "sobre", "el", "fondo", "de", "la", "puesta", "del", "sol", "el", "crepusculo",
			"desvanece", "rostros", "y", "signos", "apenas", "se", "percibe", "el", "claroscuro", "es", "esta", "la",
			"noche", "del", "corazón", "del", "verano", "y", "el", "viejo", "reloj", "de", "bolsillo", "empieza", "a",
			"tictaquear", "de", "pronto", "con", "una", "fuerza", "inusitada", "encima", "del", "escritorio" };

	public static void main(String[] args) throws FileNotFoundException, IOException {

		File archivo1 = null;
		FileReader fr = null;
		BufferedReader br = null;
		String archivo = "";
		String[] tokens;
		archivo1 = new File("Texto.txt");
		fr = new FileReader(archivo1);
		br = new BufferedReader(fr);

		int numPalab = 0, numLineas = 0, control = 0, indice = 0;

		File ArchivoR = new File("TextoTraducido.txt");
		FileWriter fw = new FileWriter(ArchivoR);
		BufferedWriter bufferw = new BufferedWriter(fw);

		while (br.ready()) {

			archivo += br.readLine() + " ";
			numLineas++;

			tokens = archivo.split(" ");

			numPalab += tokens.length;
			numPalab -= control;
			control = tokens.length;

			try {

				do {

					if (tokens[indice].toLowerCase().equals(comEsp[indice])) {
						bufferw.write(TradIng[indice]);
						bufferw.write(" ");
						System.out.print(TradIng[indice] + " ");
					}
					indice++;

				} while (indice < numPalab);
				System.out.println();
				bufferw.newLine();

			} catch (Exception ex) {
			}

		}

		bufferw.close();
		br.close();
		JOptionPane.showMessageDialog(null, "La cantidad de palabras fue de: " + numPalab);
		JOptionPane.showMessageDialog(null, "La cantidad de lineas fue de: " + numLineas);

	}

}

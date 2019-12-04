package Simulacion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ganancias {

	Random rand = new Random();

	public int costoS() {

		int n = rand.nextInt(11) + 0;

		return n;

	}

	public double costoSS(int n) {
		Double[] costos = { 0.95, 0.96, 0.97, 0.98, 0.99, 1.00, 1.01, 1.02, 1.03, 1.04, 1.05 };
		return costos[n];
	}

	public int nreac() {
		int z = rand.nextInt(10) + 1;
		return z;
	}

	public String reaC(int z) {

		String s;
		if (z > 6) {
			s = "DEBIL";
		} else
			s = "FUERTE";
		return s;
	}

	public int ndemanda() {
		int x = rand.nextInt(3) + 1;
		return x;
	}

	public Double demanda(String s, int x) {

		if (x == 1) {
			if (s.equalsIgnoreCase("DEBIL")) {
				return 10000.00;
			} else {
				return 8000.00;
			}
		} else if (x == 2) {
			if (s.equalsIgnoreCase("DEBIL")) {
				return 11000.00;
			} else {
				return 9000.00;
			}
		} else {
			if (s.equalsIgnoreCase("DEBIL")) {
				return 12000.00;
			} else {
				return 10000.00;
			}
		}

	}

	public String toString() {
		String output = "";
		output += "SIMULACION \n";
		output += String.format("%1$35s  %2$26s  %3$20s\n", "COSTO VARIABLE", "REACCION COMPETITIVA", "DEMANDA");
		output += "\n";
		output += String.format("%1$13s  %2$10s  %3$10s  %4$10s  %5$10s  %6$10s  %7$10s  %8$10s\n", "# SIMULACION",
				"NUMERO ", "COSTO $", "NUMERO ", "REACCION", "NUMERO ", "DEMANDA", "GANANCIA");
		output += String.format("%1$13s  %2$10s  %3$10s  %4$10s  %5$10s  %6$10s  %7$10s  %8$10s\n", "", " ALEATORIO",
				"", "ALEATORIO", "", "ALEATORIO", "", "");

		return output;
	}

	public double ganancia(double costoS, double demandA) {

		double g = (2.00 - costoS);
		double h = g * demandA;
		double w = h - 10000.00;

		return w;
	}

	public static void main(String[] args) throws IOException {

		Ganancias g = new Ganancias();
		System.out.println(g.toString());
		String output = "";
		ArrayList<Double> list = new ArrayList<Double>();

		for (int i = 1; i <= 10; i++) {
			int nale1 = g.costoS();
			Double costo = g.costoSS(nale1);
			int ale2 = g.nreac();
			String reac = g.reaC(ale2);
			int ale3 = g.ndemanda();
			Double demand = g.demanda(reac, ale3);
			double ganan = g.ganancia(costo, demand);

			output += String.format("%1$6s  %2$13s  %3$13s  %4$8s  %5$13s  %6$6s  %7$14s  %8$10s\n", i, nale1 + 1,
					costo, ale2, reac, ale3, demand, ganan);
			list.add(ganan);
		}

		 System.out.println(output);

		double suma = 0;
		for (int i = 0; i < list.size(); i++) {
			suma = suma + list.get(i);
		}
		double promedio = suma / list.size();
		double mayor = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > mayor) {
				mayor = list.get(i);
			}
		}
		double menor = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < menor) {
				menor = list.get(i);
			}
		}

		Collections.sort(list);
		int n = list.size();
		int med = (n + 1) / 2;
		int med2 = med + 1;
		double medd = list.get(med);
		double medd2 = list.get(med2);
		double mediana = (medd + medd2) / 2;

		 System.out.println("Ganancia mínima: "+menor);
		 System.out.println("Ganancia máxima: "+mayor);
		 System.out.println("Ganancia promedio: "+promedio);
		 System.out.println("Ganancia mediana: "+mediana);
		output += "\n";
		output += ("Ganancia mínima: " + menor);
		output += "\n";
		output += ("Ganancia máxima: " + mayor);
		output += "\n";
		output += ("Ganancia promedio: " + promedio);
		output += "\n";
		output += ("Ganancia mediana: " + mediana);
		output += "\n";
		
		int n5=0;
		int n1=0;
		int n_15=0;
		int n2 =0;
		int n2_5=0;
		int nx=0;
		for (int i = 0; i < list.size(); i++) {
		if(list.get(i)<0 && list.get(i)>-501){
			n5++;
		}
		if(list.get(i)<-500 && list.get(i)>-1001){
			n1++;
		}
		if(list.get(i)<-1000 && list.get(i)>-1501){
			n_15++;
		}
		if(list.get(i)<-1500 && list.get(i)>-2001){
			n2++;
		}
		if(list.get(i)<-2000 && list.get(i)>-2501){
			n2_5++;
		}
		if(list.get(i)<0){
			nx++;
		}
		
		}
		System.out.println("\n");
		System.out.println("Ganancia 0 a -500 "+n5);
		System.out.println("Ganancia -500 a -1000 "+n1);
		System.out.println("Ganancia -1000 a -1500 "+n_15);
		System.out.println("Ganancia -1500 a -2000 "+n2);
		System.out.println("Ganancia -2000 a -2500 "+n2_5);
		System.out.println(nx);

		FileWriter fw = new FileWriter(new File("Simulacion.txt"));
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(g.toString()+output);
		bw.flush();
		bw.close();
		fw.close();

	}
}

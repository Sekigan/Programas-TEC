package Simulacion;

public class m_multiplicativo {
	public static void main(String[] args) {
		int m = 128;
		int a = 59;
		int xo = 127;
		int media=0;
		int med=0;

		for (int i = 0; i < 33; i++) {

			xo = (xo * a) % m;
			media+=xo;
			String output = "";
			output += String.format("[%1$1s--->%2$5s]", i + 1, xo);
			System.out.println(output);

			if (xo == 127) {
				System.out.println("Se ah degenerado");
			}
		}
		med=media/33;
		System.out.println(med);
	}
}

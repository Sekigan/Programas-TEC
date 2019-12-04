package Simulacion;

public class m_mixto {
	public static void main(String[] args) {
		int m = 253;
		int a = 41;
		int c = 45;
		int xo = 41;
		int media=0;
		int med=0;

		for (int i = 0; i < 100; i++) {

			xo = (xo * a + c) % m;
			media+=xo;
			String output = "";
			output += String.format("[%1$1s--->%2$5s]", i + 1, xo);
			System.out.println(output);
			
			if (xo == 41) {
				System.out.println("Se ah degenerado");
			}  
			
		}
		med=media/100;
		System.out.println(med);
	}
}

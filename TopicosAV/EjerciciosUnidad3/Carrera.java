package EjerciciosUnidad3;

public class Carrera {
public static void main(String[] args) {
	TortugaThread tortuga=new TortugaThread();
	Thread Liebre=new Thread(new LiebreThread());
	tortuga.start();
	Liebre.start();
}
}

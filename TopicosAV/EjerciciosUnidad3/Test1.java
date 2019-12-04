package EjerciciosUnidad3;


//SE CAMBIA LAS PRIORIDADES NOMAS

public class Test1 {
public static void main(String[] args) {
	MiThread2 t1=new MiThread2();
	t1.setName("Thread 1");
	t1.setPriority(Thread.MAX_PRIORITY);
	MiThread2 t2=new MiThread2();
	t2.setName("Thread 2");
	t2.setPriority(Thread.MIN_PRIORITY);
	t1.start();
	t2.start();
}
}

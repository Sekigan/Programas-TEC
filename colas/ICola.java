package colas;

public interface ICola extends IContenedor {
	Object getFrente();

	Object getFondo();

	void encolar(Object obj) throws Exception;

	Object desencolar() throws Exception;
}

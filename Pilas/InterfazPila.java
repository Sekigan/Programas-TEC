package Pilas;

public interface InterfazPila {
	
	void push(Object ob);
	Object pop();
	boolean isVacia();
	boolean isLlena();
	Object getTop();
}

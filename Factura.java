 

/**
 *
 * @author Rishell
 */
public class Factura {
    private String concepto;
     private double valor;
    private String nombre;

    Factura(String nombre, String concepto, double valor) {
        this.nombre=nombre;
        this.concepto=concepto;
        this.valor=valor;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return concepto + "  $" + valor + "  ("+ nombre + ')';
    }
   
    
    
}

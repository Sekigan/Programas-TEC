
 

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Rishell
 */
public class Socio {

    //atributos
    private String cedula;
    private String nombre;
    private double fondos;
    private Tipo tipoSubscripcion;
    private ArrayList<Factura> facturas;
    private ArrayList<String> autorizados;
    public final static double FONDOS_INICIALES_REGULARES = 50000;
    public final static double FONDOS_INICIALES_VIP = 100000;
    public final static double MONTO_MAXIMO_REGULARES = 1000000;
    public final static double MONTO_MAXIMO_VIP = 5000000;

    //Constructores 
    public Socio(String cedula, String nombre, Tipo tipoSubcripcion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.tipoSubscripcion = tipoSubcripcion;
        facturas = new ArrayList();
        autorizados = new ArrayList();
    }

    public Socio(String cedula) {
        this.cedula = cedula;
    }

    public enum Tipo {
        VIP,
        REGULAR
    }

    //Getters && Setters 
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getFondos() {
        return fondos;
    }

    public void setFondos(double fondos) {
        this.fondos = fondos;
    }

    public Tipo getTipoSubscripcion() {
        return tipoSubscripcion;
    }

    public void setTipoSubscripcion(Tipo tipoSubscripcion) {
        this.tipoSubscripcion = tipoSubscripcion;
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(ArrayList<Factura> facturas) {
        this.facturas = facturas;
    }

    public ArrayList<String> getAutorizados() {
        return autorizados;
    }

    public void setAutorizados(ArrayList<String> autorizados) {
        this.autorizados = autorizados;
    }

    //Metodos 
    public void AgregarAutorizado(String nombreAutorizado) throws Exception {
        if (nombre.equals(nombreAutorizado)) {
            throw new Exception("El nombre es el mismo que el socio");
        }

        if (!ExisteAutorizado(nombreAutorizado)) {
            autorizados.add(nombreAutorizado);
        } else {
            throw new Exception("Ya existe!");
        }
    }

    public void EliminarAutorizado(String nombreAutorizado) {
        boolean encontrado = false;
        int numeroAutorizados = autorizados.size();

        for (int numeroAutorizado = 0; numeroAutorizado < numeroAutorizados && !encontrado; numeroAutorizado++) {
            String autorizado = autorizados.get(numeroAutorizado);
            if (autorizado.equals(nombreAutorizado)) {
                encontrado = true;
                autorizados.remove(numeroAutorizado);
            }
        }
    }

    public void PagarFactura(int numeroFactura) throws Exception {

        double nuevosFondos = 0;
        Factura fac = facturas.get(numeroFactura);
        if (fac.getValor() > getFondos()) {
            throw new Exception("No tienes fondos");
        } else {
            nuevosFondos = getFondos() - fac.getValor();
            setFondos(nuevosFondos);
            facturas.remove(numeroFactura);
        }

    }

    public void RegistrarConsumo(String nombre, String concepto, double valor) {
        Factura nuevafactura = new Factura(nombre, concepto, valor);
        facturas.add(nuevafactura);
    }

    public Boolean ExisteAutorizado(String nombreAutorizado) {
        boolean encontrado = false;
        int numeroAutorizados = autorizados.size();
        for (int numeroAutorizado = 0; numeroAutorizado < numeroAutorizados && !encontrado; numeroAutorizado++) {

            String autorizado = autorizados.get(numeroAutorizado);

            if (autorizado.equals(nombreAutorizado)) {
                encontrado = true;

            }
        }
        return encontrado;
    }

    public void Aumentarfondos(double fondos) {
        if (getTipoSubscripcion() == Tipo.REGULAR && fondos < MONTO_MAXIMO_REGULARES) {
            setFondos(fondos + getFondos());
        } else if (getTipoSubscripcion() == Tipo.VIP && fondos < MONTO_MAXIMO_VIP) {
            setFondos(fondos + getFondos());
        }

    }
}

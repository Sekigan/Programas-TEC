
 

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Rishell
 */
public class Club {

    public final static int MAXIMO_VIP = 3;
    private final ArrayList<Socio> socios;
    public int vips=0;

    public Club() {
        socios = new ArrayList();
    }

    public void afiliarSocios(Socio socio) throws Exception {
        Socio socioN = BuscarSocio(socio.getCedula());

        if (socioN == null) {
            Socio nuevoSocio = new Socio(socio.getCedula(), socio.getNombre(), socio.getTipoSubscripcion());
            if (nuevoSocio.getTipoSubscripcion() == Socio.Tipo.REGULAR) {
                nuevoSocio.setFondos(Socio.FONDOS_INICIALES_REGULARES);
                socios.add(nuevoSocio);

            } else if (nuevoSocio.getTipoSubscripcion() == Socio.Tipo.VIP && vips< MAXIMO_VIP) {
                nuevoSocio.setFondos(Socio.FONDOS_INICIALES_VIP);
                socios.add(nuevoSocio);
                vips++;
            }else{
                throw new Exception("No se puede registrar el socio verifique los datos");
            }

        } else {
            throw new Exception("El socio ya existe");
        }
    }

    public Socio BuscarSocio(String cedula) {
        Socio socio = null;
        boolean encontrado = false;
        int numeroSocios = socios.size();

        for (int numeroSocio = 0; numeroSocio < numeroSocios && !encontrado; numeroSocio++) {

            Socio otroSocio = socios.get(numeroSocio);
            if (otroSocio.getCedula().equals(cedula)) {
                socio = otroSocio;
                encontrado = true;
            }
        }
        return socio;
    }

    public ArrayList ObtenerAutorizadosSocio(String cedula) throws Exception {
        Socio socio = BuscarSocio(cedula);

        ArrayList autorizados;

        if (socio == null) {
            throw new Exception("El socio con esa cedula no existe");
        } else {

            autorizados = socio.getAutorizados();

        }

        return autorizados;
    }

    public void AgregarAutorizadoSocio(Socio socioAutorizado, String nombreAutorizado) throws Exception {
        Socio socio = BuscarSocio(socioAutorizado.getCedula());
        if (socio == null) {
            throw new Exception("El socio con esa cedula no existe");
        } else {
            try {
                socio.AgregarAutorizado(nombreAutorizado);
            } catch (Exception a) {
                throw new Exception("Verifique la informacion");
            }
        }
    }

    public void RegistrarConsumo(String cedula, String nombreCliente, String concepto, double valor) throws Exception {
        Socio socio = BuscarSocio(cedula);
        if (socio == null) {
            throw new Exception("El socio con esa cedula no existe");
        } else {
            socio.RegistrarConsumo(nombreCliente, concepto, valor);
        }
    }

    public ArrayList ObtenerFacturasSocio(String cedula) throws Exception {
        ArrayList facturas = new ArrayList();
        Socio socio = BuscarSocio(cedula);
        if (socio == null) {
            throw new Exception("El socio con esa cedula no existe");
        } else {
            facturas = socio.getFacturas();
        }
        return facturas;
    }

    public void PagarFactura(String cedula, int numeroFactura) throws Exception {
        Socio socio = BuscarSocio(cedula);
        if (socio == null) {
            throw new Exception("El socio con esa cedula no existe");
        } else {

            socio.PagarFactura(numeroFactura);
        }
    }
    
    public void AumentarFondos(String cedula, double fondos) throws Exception {
        Socio socio = BuscarSocio(cedula);
        if (socio == null ) {
            throw new Exception("El socio con esa cedula no existe");
        } else {

            socio.Aumentarfondos(fondos);
        }
    }

}

package PracticasU2;
public class Articulo
{
    private String descripcion;
    private int cantidad;
    private float precio;

   
    public Articulo ()
    {
    }
    public Articulo(String descripcion , int cantidad, float precio)
    {
        this. descripcion = descripcion;
        this. cantidad = cantidad;
        this. precio = precio;
    }
   
    public String getDescripcion()
    {
        return descripcion;
    }
    public void setDescripcion( String descripcion)
    {
        this.descripcion=descripcion;
    }
    public int getCantidad()
    {
        return cantidad;
    }
    public void setCantidad(int cantidad)
    {
         this. cantidad = cantidad;
    }
    public float getPrecio()
    {
        return precio;
    }
    public void setPrecio(float precio)
    {
        this.precio=precio;
    }
    public String toString()
    {
        String s = " articulo  ";
        s += "\n descripción : " + descripcion;
        s += "\n cantidad  : " + cantidad;
        s += "\n  precio: " + precio;

        return s;

    }
    

    
}


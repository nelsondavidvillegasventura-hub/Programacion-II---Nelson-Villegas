package Clases;

public class Producto {
    private int idProducto;
    private String nombre;
    private double precioUnitario;

    public Producto(int idProducto, String nombre, double precioUnitario) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
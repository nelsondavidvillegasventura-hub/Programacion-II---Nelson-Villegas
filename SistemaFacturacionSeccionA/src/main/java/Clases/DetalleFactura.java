package Clases;

public class DetalleFactura {
    private int idDetalle;
    private Producto producto;
    private int cantidad;
    private double precioUnitario;

    // Constructor
    public DetalleFactura(int idDetalle, Producto producto, int cantidad, double precioUnitario) {
        this.idDetalle = idDetalle;
        this.producto = producto;
        setCantidad(cantidad);
        setPrecioUnitario(precioUnitario);
    }

    // Método útil para calcular el subtotal de esta línea de detalle
    public double calcularSubtotal() {
        return this.cantidad * this.precioUnitario;
    }

    // Getters y Setters
    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor a cero");
        }
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario < 0) {
            throw new IllegalArgumentException("El precio unitario no puede ser negativo");
        }
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return String.format("Detalle #%d - %s x%d - $%.2f",
                idDetalle, producto, cantidad, calcularSubtotal());
    }
}
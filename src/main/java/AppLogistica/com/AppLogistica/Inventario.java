package AppLogistica.com.AppLogistica;

public class Inventario {
    private Producto producto;
    private Ubicacion ubicacion;
    private int cantidad;
    private String estado;

    public Inventario(Producto producto, Ubicacion ubicacion, int cantidad, String estado) {
        this.producto = producto;
        this.ubicacion = ubicacion;
        this.cantidad = cantidad;
        this.estado = estado;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Producto getProducto() {
        return producto;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getEstado() {
        return estado;
    }
}

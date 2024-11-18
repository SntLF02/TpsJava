package ejerc2;

public class Ingrediente {
    private String nombre;
    private double cantidad;
    private String unidad_medida;

    public Ingrediente(String nombre, double cantidad, String unidad_medida) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidad_medida = unidad_medida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidad_medida() {
        return unidad_medida;
    }

    public void setUnidad_medida(String unidad_medida) {
        this.unidad_medida = unidad_medida;
    }
}

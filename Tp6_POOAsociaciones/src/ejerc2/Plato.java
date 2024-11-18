package ejerc2;

import java.util.ArrayList;

public class Plato {
    private String nombre_completo;
    private double precio;
    private boolean es_bebida;
    private ArrayList<Ingrediente> ingredientes;

    public Plato(String nombre_completo, double precio, boolean es_bebida) {
        this.nombre_completo = nombre_completo;
        this.precio = precio;
        this.es_bebida = es_bebida;
        this.ingredientes = new ArrayList<>();
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEs_bebida() {
        return es_bebida;
    }

    public void setEs_bebida(boolean es_bebida) {
        this.es_bebida = es_bebida;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void agregarIngrediente(Ingrediente nuevoIngrediente){
        this.ingredientes.add(nuevoIngrediente);
    }
}

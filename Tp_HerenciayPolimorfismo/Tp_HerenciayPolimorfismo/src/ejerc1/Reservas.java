package ejerc1;

import java.util.ArrayList;

public class Reservas {

    private ArrayList<Vuelo> vuelos;

    public Reservas(){
        this.vuelos=new ArrayList<>();
    }

    public void agregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    public double calcularPrecio(){
        double precioTotal = 0.0;
        for (Vuelo vuelo : vuelos) {
            precioTotal += vuelo.calcularPrecio();
        }
        return precioTotal;
    }

    public void aplicarPromociones() {
        for (Vuelo vuelo : vuelos) {
            if (vuelo instanceof Promocionable) {
                ((Promocionable) vuelo).aplicarPromocion();
            }
        }
    }

    public void mostrarInformacionVuelos() {
        for (Vuelo vuelo : vuelos) {
            vuelo.mostrarInformacion();
            System.out.println("Precio: $" + vuelo.calcularPrecio());
            System.out.println("---------------------------");
        }
    }

}

package ejerc1;

public class SistemaReservas {
    public static void main(String[] args) {
        Reservas reservas = new Reservas();

        vueloRegular vueloRegular = new vueloRegular(123, "Madrid", "Barcelona", "12/08/2024", 10);
        vueloCharter vueloCharter = new vueloCharter(456, "Nueva York", "Los Ángeles","23/10/24" , 5000.0);

        reservas.agregarVuelo(vueloRegular);
        reservas.agregarVuelo(vueloCharter);

        System.out.println("Información de los vuelos antes de aplicar promociones:");
        reservas.mostrarInformacionVuelos();

        reservas.aplicarPromociones();

        System.out.println("Información de los vuelos después de aplicar promociones:");
        reservas.mostrarInformacionVuelos();

        System.out.println("Precio total de las reservas: $" + reservas.calcularPrecio());
    }
}

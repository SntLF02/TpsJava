package ejerc2;

public class SistemaDePagos {
    public static void main(String[] args) {
        Pagos pagos = new Pagos();

        TarjetaCredito tarjetaCredito = new TarjetaCredito("Juan Pérez", "1234567890123456", "12/25", "123");
        PayPal payPal = new PayPal("Santiago Fernandez", "9876543210987654", "maria.lopez@example.com");

        pagos.agregarMetodoPago(tarjetaCredito);
        pagos.agregarMetodoPago(payPal);

        System.out.println("Informacion de los metodos de pago:");
        pagos.mostrarInformacionMetodosPago();

        System.out.println("\nRealizando pagos:");
        pagos.realizarPagos();

        System.out.println("\nCancelando pagos:");
        pagos.cancelarPagos();
    }
}


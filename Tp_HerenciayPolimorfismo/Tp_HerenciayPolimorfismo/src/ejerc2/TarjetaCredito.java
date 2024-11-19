package ejerc2;


public class TarjetaCredito extends MetodosPago implements Cancelable {
    private String fechaExpiracion;
    private String codigoSeguridad;
    private boolean pagoRealizado;

    public TarjetaCredito(String titular, String numero, String fechaExpiracion, String codigoSeguridad) {
        super(titular, numero);
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
        this.pagoRealizado = false;
    }

    @Override
    public void realizarPago() {

        if (!pagoRealizado) {
            System.out.println("-----------------------------------");
            System.out.println("Realizando pago con tarjeta de credito...");
            System.out.println("Titular: " + titular);
            System.out.println("Numero de tarjeta: " + numero);
            System.out.println("Fecha de expiración: " + fechaExpiracion);
            System.out.println("Codigo de seguridad: " + codigoSeguridad);
            System.out.println("Pago realizado con exito.");
            System.out.println("-----------------------------------");
            pagoRealizado = true;
        } else {
            System.out.println("-----------------------------------");
            System.out.println("El pago ya ha sido realizado.");
            System.out.println("-----------------------------------");
        }
    }

    @Override
    public void cancelarPago() {

        if (pagoRealizado) {
            System.out.println("-----------------------------------");
            System.out.println("Cancelando pago con tarjeta de credito...");
            System.out.println("Pago cancelado con éxito.");
            System.out.println("-----------------------------------");
            pagoRealizado = false;
        } else {
            System.out.println("-----------------------------------");
            System.out.println("No hay pago para cancelar.");
            System.out.println("-----------------------------------");
        }
    }
}
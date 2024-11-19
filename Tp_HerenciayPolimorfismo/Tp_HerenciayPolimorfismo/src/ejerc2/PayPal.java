package ejerc2;

public class PayPal extends MetodosPago implements Cancelable {
    private String correoElectronico;
    private boolean pagoRealizado;

    public PayPal(String titular, String numero, String correoElectronico) {
        super(titular, numero);
        this.correoElectronico = correoElectronico;
        this.pagoRealizado = false;
    }

    @Override
    public void realizarPago() {

        if (!pagoRealizado) {
            System.out.println("-----------------------------------");
            System.out.println("Realizando pago con PayPal...");
            System.out.println("Titular: " + titular);
            System.out.println("Numero de cuenta: " + numero);
            System.out.println("Correo electronico: " + correoElectronico);
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
            System.out.println("Cancelando pago con PayPal...");
            System.out.println("Pago cancelado con éxito.");
            pagoRealizado = false;
            System.out.println("-----------------------------------");
        } else {
            System.out.println("-----------------------------------");
            System.out.println("No hay pago para cancelar.");
            System.out.println("-----------------------------------");
        }
    }
}


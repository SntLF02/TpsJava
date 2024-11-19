package ejerc2;

import java.util.ArrayList;
import java.util.List;

public class Pagos {
    private List<MetodosPago> metodosPago;

    public Pagos() {
        this.metodosPago = new ArrayList<>();
    }

    public void agregarMetodoPago(MetodosPago metodosPago) {
        this.metodosPago.add(metodosPago);
    }

    public void realizarPagos() {
        for (MetodosPago metodosPago : this.metodosPago) {
            metodosPago.realizarPago();
        }
    }

    public void cancelarPagos() {
        for (MetodosPago metodosPago : this.metodosPago) {
            if (metodosPago instanceof Cancelable) {
                ((Cancelable) metodosPago).cancelarPago();
            }
        }
    }

    public void mostrarInformacionMetodosPago() {
        for (MetodosPago metodosPago : this.metodosPago) {
            System.out.println("---------------------------");
            System.out.println("Titular: " + metodosPago.titular);
            System.out.println("Numero: " + metodosPago.numero);
            System.out.println("---------------------------");
        }
    }
}


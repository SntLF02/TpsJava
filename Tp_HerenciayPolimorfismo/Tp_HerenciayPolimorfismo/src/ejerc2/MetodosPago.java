package ejerc2;

public abstract class MetodosPago {
    protected String titular;
    protected String numero;

    public MetodosPago(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
    }

    public abstract void realizarPago();
}
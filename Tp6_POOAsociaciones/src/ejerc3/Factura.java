package ejerc3;

import java.util.ArrayList;

public class Factura {

    private String fechafactura;
    private long numeroFactura;
    private double totalCalculoFactura;
    private String cliente;
    private ArrayList<DetalleFactura> detallesFactura;

    public Factura(String fechaactura, long numeroFactura, double totalCalculoFactura, String cliente) {
        this.fechafactura = fechaactura;
        this.numeroFactura = numeroFactura;
        this.totalCalculoFactura = totalCalculoFactura;
        this.cliente = cliente;
        this.detallesFactura = new ArrayList<>();
    }

    public String getFechafactura() {
        return fechafactura;
    }

    public void setFechafactura(String fechafactura) {
        this.fechafactura = fechafactura;
    }

    public long getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(long numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public double getTotalCalculoFactura() {
        return totalCalculoFactura;
    }

    public void setTotalCalculoFactura(double totalCalculoFactura) {
        this.totalCalculoFactura = totalCalculoFactura;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public ArrayList<DetalleFactura> getDetallesFactura() {
        return detallesFactura;
    }

    public void setDetallesFactura(ArrayList<DetalleFactura> detallesFactura) {
        this.detallesFactura = detallesFactura;
    }

    public double addDetallesFactura(DetalleFactura articulo1){
        this.detallesFactura.add(articulo1);
        return articulo1.getSubTotal();
    }
}

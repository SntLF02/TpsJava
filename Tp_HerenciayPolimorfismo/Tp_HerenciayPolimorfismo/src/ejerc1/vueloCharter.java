package ejerc1;

public class vueloCharter extends Vuelo implements Promocionable{

    private double precioTotal;
    private double descuento;

    public vueloCharter (int numeroVuelo,String origen,String destino,String fecha,double precioTotal){
        super  (numeroVuelo, origen, destino, fecha);
        this.precioTotal=precioTotal;
        this.descuento=0.0;
    }
    @Override
    public double calcularPrecio() {
        return precioTotal-descuento;
    }

    @Override
    public void aplicarPromocion() {
        this.descuento=precioTotal*0.05;//%5
    }
}

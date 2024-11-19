package ejerc1;

public class vueloRegular extends Vuelo implements Promocionable{

    private int numeroAsientos;
    private static final double precio_por_asiento = 100.0;
    private double descuento;

    public vueloRegular(int numeroVuelo, String origen, String destino, String fecha,int numeroAsientos){
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos=numeroAsientos;
        this.descuento=0.0;

    }
    @Override
    public double calcularPrecio() {
        return (numeroAsientos * precio_por_asiento)-descuento;
    }

    @Override
    public void aplicarPromocion(){
        this.descuento = (numeroAsientos*precio_por_asiento)*0.1;//%10
    }
}

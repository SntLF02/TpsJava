package ejerc1;

public abstract class Vuelo {
    protected int numeroVuelo;
    protected String origen;
    protected String destino;
    protected String fecha;

    public Vuelo(int numeroVuelo, String origen, String destino, String fecha) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
    }

    public abstract double calcularPrecio ();

    public void mostrarInformacion() {
        System.out.println("Número de vuelo: " + numeroVuelo);
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("Fecha: " + fecha);
    }
}





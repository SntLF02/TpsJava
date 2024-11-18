

public class Planeta {

    String nombre = null ;
    int cantidadSatelites = 0;
    double masaKg = 0;
    double volumenKm3 = 0;
    int diametroKm = 0;
    long distanciaSol = 0;
    boolean observableaVista = false;
    double periodoOrbitalAños;
    double periodoRotacionDias;

    Tipo tipo;
    public enum Tipo {GASEOSO, TERRESTRE, ENANO};

    public Planeta(String nombre, int cantidadSatelites, double masaKg, double volumenKm3, int diametroKm, long distanciaSol, boolean observableaVista, Tipo tipo, double periodoOrbitalAños, double periodoRotacionDias) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masaKg = masaKg;
        this.volumenKm3 =  volumenKm3;
        this.diametroKm = diametroKm;
        this.distanciaSol = distanciaSol;
        this.observableaVista = observableaVista;
        this.tipo = tipo;
        this.periodoOrbitalAños = periodoOrbitalAños;
        this.periodoRotacionDias = periodoRotacionDias;
    }

    public void mostrar(){

        System.out.println("---------------------------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de satélites: " + cantidadSatelites);
        System.out.println("Masa (kg): " + masaKg);
        System.out.println("Volumen (km³): " + volumenKm3);
        System.out.println("Diámetro (km): " + diametroKm);
        System.out.println("Distancia al Sol (km): " + distanciaSol);
        System.out.println("Tipo: " + tipo);
        System.out.println("Observable a vista: " + observableaVista);
        System.out.println("Periodo Orbital: " + periodoOrbitalAños + " años");
        System.out.println("Periodo Rotacional: " + periodoRotacionDias + " dias");
        System.out.println("---------------------------------------------");

    }

    public static void main(String[] args) {
        Planeta tierra = new Planeta("Tierra",1,5972E24,1083E12,12742,149600000,true,Tipo.TERRESTRE,1,1);
        Planeta venus = new Planeta("Venus", 0, 4.867E24, 9.284E11, 12104, 108200000,true, Tipo.TERRESTRE,0.615,243);
        Planeta neptuno = new Planeta("Neptuno", 14, 1.024E26, 6.254E13, 49532, 4495100000L, false, Tipo.GASEOSO,164.8,0.671);

        tierra.mostrar();
        venus.mostrar();
        neptuno.mostrar();
    }
}

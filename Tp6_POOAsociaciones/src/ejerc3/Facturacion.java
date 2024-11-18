package ejerc3;

import java.util.Scanner;

public class Facturacion {
    private static final Scanner leer = new Scanner(System.in);
    private static final String [][] articulos = {
            {"101", "Leche", "25"},
            {"102", "Gaseosa", "30"},
            {"103", "Fideos", "15"},
            {"104", "Arroz", "28"},
            {"105", "Vino", "120"},
            {"106", "Manteca", "20"},
            {"107", "Lavandina", "18"},
            {"108", "Detergente", "46"},
            {"109", "Jabón en Polvo", "96"},
            {"110", "Galletas", "60"}
    };

    public static void main(String[] args) {

        Factura fatura=ingresar_datos();

        mostrar_factura_final(fatura);

        leer.close();
    }

    public static Factura ingresar_datos(){
        double sumaTotal=0;
        String cliente;
        long numeroFactura;

        while (true){
            System.out.println("Ingrese el nombre completo del cliente:");
            cliente = leer.nextLine();

            if (cliente.isEmpty() || cliente.trim().isEmpty()) {
                System.out.println("Error, inténtelo de nuevo.");
            } else {
                break;
            }
        }

        System.out.println("Ingrese la fecha de la factura: dd/mm/aaaa");
        String fechaFactura = leer.nextLine();

        while (true){
            System.out.println("Ingrese el numero de factura: ");

            if (leer.hasNextLong()) {
                numeroFactura = leer.nextLong();
                if (numeroFactura > 0) {
                    break;
                } else {
                    System.out.println("Error, el número de factura debe ser mayor que 0. Inténtelo de nuevo.");
                }
            } else {
                System.out.println("Error, ingrese un número válido. Inténtelo de nuevo.");
                leer.next();
            }
        }


        Factura factura1= new Factura(fechaFactura,numeroFactura,0,cliente);

        while (true){
            DetalleFactura articulos1=pedir_articulos();
            sumaTotal+=factura1.addDetallesFactura(articulos1);

            System.out.println("¿Desea añadir otro articulo? ingrese 'true' por Si o 'False' por No: ");
            if (!leer.nextBoolean()){
                leer.nextLine();
                break;
            }
            leer.nextLine();
        }

        factura1.setTotalCalculoFactura(sumaTotal);

        return factura1;

    }

    public static DetalleFactura pedir_articulos(){

        double subTotal;
        int cantidad;
        int precio=0;
        double descuento=0;
        String nombre=" ";
        String codigo;

        mostrar_inventario();

            while (true){

                System.out.println("Ingrese el codigo del articulo que desea añadir: ");
                codigo=leer.nextLine();

                boolean verf=false;
                for (String [] x : articulos){
                    if (codigo.equals(x[0])){
                        precio= Integer.parseInt(x[2]);
                        nombre=x[1];
                        verf=true;
                        break;
                    }
                }

                if (verf){

                    while (true){
                        System.out.println("ingrese la cantidad del articulo "+codigo+" que desea llevar:");
                        cantidad= leer.nextInt();

                        if (cantidad>0){
                            break;
                        }else{
                            System.out.println("Error, La cantidad a pedir no puede ser 0 o menor");
                        }
                    }

                    if (cantidad>5){
                        descuento=0.1;
                        subTotal=cantidad*(precio-(precio*descuento));
                    }else{
                        subTotal=cantidad*precio;
                    }
                    break;

                }else{
                    System.out.println("Error, No se encontro el articulo");
                }
            }

        leer.nextLine();
        return new DetalleFactura(codigo,nombre,cantidad,precio,descuento,subTotal);

    }

    public  static void mostrar_inventario(){
        System.out.println("|-------------------------------|");
        System.out.println("| Codigo : Descripcion : precio |");
        for (String [] lista : articulos){
            System.out.println("| "+lista[0]+" "+lista[1]+" "+lista[2]);
        }
        System.out.println("|-----------------------------|");
    }

    public static void mostrar_factura_final(Factura factura){

        System.out.println("-----------------------------------------------");
        System.out.println("--------------------Factura--------------------");
        System.out.println("Fecha: "+factura.getFechafactura());
        System.out.println("Numero: "+factura.getNumeroFactura());
        System.out.println("Cliente: "+factura.getCliente());
        System.out.println("Codigo : Articulo : Cantidad : Precio/U : Descuento : SubTotal");

        for (DetalleFactura art : factura.getDetallesFactura()){

            System.out.println("  "+art.getCodigoArticulo()+"    "+art.getNombreArticulo()+"    "+art.getCantidad()+"    "+art.getPrecioUnitario()+"    %"+(art.getDescuentoItem()*100)+"    $"+art.getSubTotal());

        }
        System.out.println("________________________________________________Total: $"+factura.getTotalCalculoFactura());

    }

}

public class ejerc3 {
    public static void main(String[] args) {
        //Una pequeña empresa de servicios tiene una lista de clientes a los que debe enviar facturas,
        // pero quiere procesar solo aquellos que tengan facturas pendientes por más de $500.
        //
        //**Instrucciones**:
        //- Crea un arreglo `clientes` que almacene los nombres de los clientes y un arreglo `facturasPendientes` con el monto
        // de sus facturas pendientes.
        //- Escribe una función `enviarFacturas` que imprima los nombres de los clientes con facturas mayores a $500.

        String [] clientes = {"Santiago","Leonel","Andres","Lucia","Amanda","Pedro"};
        int [] facturasPendientes = {240,525,1420,876,120,450};

        enviarFactura(clientes,facturasPendientes);
    }
    public static void enviarFactura(String [] clientes, int [] facturasPendientes){

        for (int i=0;i<clientes.length;i++){

            if (facturasPendientes[i]>500){
                System.out.println("El cliente '"+clientes[i]+"' tiene una factura pendiente de $"+facturasPendientes[i]);
            }
        }
    }

}

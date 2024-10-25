public class ejerc4 {
    public static void main(String[] args) {
        //Una empresa ofrece descuentos a sus clientes dependiendo de la cantidad de compras que han realizado.
        // Si han comprado más de 10 veces, reciben un 10% de descuento.
        //
        //**Instrucciones**:
        //- Crea un arreglo `clientes` y otro `compras` que almacene la cantidad de compras de cada cliente.
        //- Escribe una función `calcularDescuentos` que recorra el arreglo y aplique el descuento a los clientes que califiquen.

        String [] clientes = {"Santiago","Leonel","Andres","Lucia","Amanda","Pedro"};
        int [] compras = {20,5,14,8,11,16};

        enviarFactura(clientes, compras);
    }
    public static void enviarFactura(String [] clientes, int [] compras){

        for (int i=0;i<clientes.length;i++){

            if (compras[i]>10){
                System.out.println("El cliente '"+clientes[i]+"' recibira un descuento del %10");
            }
        }
    }
}

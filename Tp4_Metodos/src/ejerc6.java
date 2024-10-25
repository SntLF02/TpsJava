public class ejerc6 {
    public static void main(String[] args) {
        //Una pequeña empresa debe calcular el impuesto de venta para cada una de las facturas emitidas.
        //
        //**Instrucciones**:
        //- Crea un arreglo `facturas` con los montos de las facturas de los clientes.
        //- Escribe una función `calcularImpuesto` que aplique un 21% de impuesto a cada factura.

        String [] clientes = {"Santiago","Leonel","Andres","Lucia","Amanda","Pedro"};
        int [] facturas = {240,525,1420,876,120,450};
        double []facturaImpuestos=new double[6];

        calcularImpuesto(facturas,facturaImpuestos);

        System.out.println("Total a pagar de cada cliente con impuestos aplicados:\nCliente: Total factura");
        for (int i=0;i<clientes.length;i++){
            System.out.println(clientes[i]+": $"+facturaImpuestos[i]);
        }
    }
    public static void calcularImpuesto(int[]facturas, double []facturasImpuestos){
        for (int i=0;i< facturas.length;i++){
            facturasImpuestos[i]=facturas[i]+(facturas[i]*0.21);
        }
    }
}

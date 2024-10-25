public class ejerc7 {
    public static void main(String[] args) {
        //Una tienda de ropa ofrece un 15% de descuento a las compras superiores a $500.
        //
        //**Instrucciones**:
        //- Crea un arreglo `compras` que almacene los montos de las compras de los clientes.
        //- Escribe una función `aplicarDescuento` que aplique el descuento a las compras que superen los $500.

        String [] clientes = {"Santiago","Leonel","Andres","Lucia","Amanda","Pedro"};
        int [] compras = {235,692,923,876,330,420};
        double [] comprasDescuento =new double[6];

        calcularImpuesto(compras, comprasDescuento);

        System.out.println("Total a pagar de cada cliente con descuento del %15 a quienes superaban los $500:\nCliente: Total a pagar");
        for (int i=0;i<clientes.length;i++){
            System.out.println(clientes[i]+": $"+ comprasDescuento[i]);
        }
    }
    public static void calcularImpuesto(int[] compras, double [] comprasDescuento){

        for (int i = 0; i< compras.length; i++){

            if (compras[i]>500) {
                comprasDescuento[i] = compras[i] - (compras[i] * 0.15);
            } else {
                comprasDescuento[i]=compras[i];
            }
        }
    }

}

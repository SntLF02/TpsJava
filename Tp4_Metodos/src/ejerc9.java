public class ejerc9 {
    public static void main(String[] args) {
        //Una empresa quiere calcular el precio final de sus productos después de aplicar un descuento general del 10%.
        //
        //**Instrucciones**:
        //- Crea un arreglo `preciosOriginales` que almacene el precio original de varios productos.
        //- Escribe una función `calcularPrecioFinal` que aplique el descuento a cada producto y devuelva el precio final.

        String[] productos = {"Televisor", "Celular", "Laptop", "Tablet", "Cámara"};

        int[] preciosOriginales = {505,240,770,120,150};
        double[] precioFinal = new double [5];

        System.out.println("Precios de Productos con un descuento aplicado del %10");
        for (int i=0;i< productos.length;i++){
            precioFinal[i]=calcularPrecioFinal(preciosOriginales[i]);
            System.out.println(productos[i]+": $"+precioFinal[i]);
        }
    }
    public static double calcularPrecioFinal(int preciosOriginales){
        double Pfin;
        Pfin=preciosOriginales-(preciosOriginales*0.1);
        return  Pfin;
    }
}

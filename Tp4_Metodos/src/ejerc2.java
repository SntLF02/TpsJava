public class ejerc2 {
    public static void main(String[] args) {
        //Una tienda de electrónica necesita un informe del inventario, mostrando los productos que tienen menos de 5 unidades en stock.
        //
        //**Instrucciones**:
        //- Crea un arreglo `productos` que almacene los nombres de los productos y otro arreglo `stocks` que almacene la cantidad de stock de cada producto.
        //- Escribe una función `generarReporteBajoStock` que imprima los productos con menos de 5 unidades.

        String[] productos = {"Televisor", "Celular", "Laptop", "Tablet", "Cámara"};
        int[] stocks = {3, 10, 2, 6, 4};

        generarReportesBajoStock(productos,stocks);

    }
    public static void generarReportesBajoStock(String []productos,int[]stock){

        for (int i=0;i<productos.length;i++){
            if (stock[i]<5){
                System.out.println("El producto "+productos[i]+" tiene "+stock[i]+" unidades en stock");
            }
        }

    }
}

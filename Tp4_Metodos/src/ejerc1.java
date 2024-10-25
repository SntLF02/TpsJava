import javax.swing.*;
import java.util.Random;

public class ejerc1 {
    public static void main(String[] args) {
        //Una pequeña tienda registra sus ventas diarias en un arreglo. Se necesita escribir una función que use un bucle para calcular los ingresos totales mensuales.
        //
        //**Instrucciones**:
        //- Crea un arreglo `ventas` que almacene las ventas diarias de una tienda durante 30 días.
        //- Escribe una función `calcularIngresosMensuales` que recorra el arreglo y sume las ventas.
        //- Imprime el total de ingresos mensuales.

        Random rand=new Random();
        int []ventas=new int[30];
        int total;

        for (int i=0;i<30;i++){
            ventas[i]=rand.nextInt(200);
            System.out.print(ventas[i]+" ");
        }

        total=calcularIngresosMensuales(ventas);
        JOptionPane.showMessageDialog(null,"El total de ventas durante el ultimo mes fue de un total de: "+total);

    }
    public static int calcularIngresosMensuales(int []ventas){
        int suma=0;
        for (int i:ventas){
            suma+=i;
        }
        return suma;
    }
}

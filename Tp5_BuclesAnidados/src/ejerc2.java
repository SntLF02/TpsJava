import java.util.Scanner;

public class ejerc2 {
    public static void main(String[] args) {
        // Leer un número N y calcular el factorial de los números desde 0 hasta N.
        int num;
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo:");

        do {
            num=lectura.nextInt();
        } while (num<0);


        System.out.println("El factorial desde "+num+" hasta 0:");
        factorial(num);
    }
    public static void factorial(int num){

        int multiplicacion=1;

        if (num!=0) {
            for (int i = 1; i < num + 1; i++) {
                multiplicacion=multiplicacion*i;
            }
            System.out.println(num+("! = ")+multiplicacion);
            factorial(num-1);
        } else {
            System.out.println("0! = 1");
        }

    }
}

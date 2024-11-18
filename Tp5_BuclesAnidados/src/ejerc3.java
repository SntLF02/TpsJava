import java.util.Scanner;

public class ejerc3 {
    public static void main(String[] args) {
        //Leer un número N y calcular la suma de los factoriales de los números
        // desde 0 hasta N.
        int num;
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo:");
        do {
            num=lectura.nextInt();
        } while(num<0);

        System.out.println("La suma de los factoriales del 0 hasta "+num+" es igual a "+sumfactorial(num));
    }
    public static int sumfactorial(int num){

        int multiplicacion=1,sum=0;

        if (num!=0) {
            for (int i = 1; i < num +1 ; i++) {
                multiplicacion*=i;
            }
            sum+=multiplicacion+sumfactorial(num-1);
        } else {
            sum+=+1;
        }
        return sum;
    }

}

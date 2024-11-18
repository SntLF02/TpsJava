public class ejerc1 {
    public static void main(String[] args) {
        //Mostrar los números perfectos entre 1 y 1000.
        int num=2;

        System.out.println("Numeros perfectos entre el 1 y el 1000:");
        numeroPerfectos(num);
    }
    public static void numeroPerfectos(int num){
        int numPerfecto;
        int suma=0;

        for (int i=1;i<num;i++){
            if (num % i==0){
                suma+=i;
            }
        }
        if (num!=1001) {
            if (suma == num) {
                numPerfecto = suma;
                System.out.print(numPerfecto+" ");
                numeroPerfectos(num + 1);
            } else {
                numeroPerfectos(num + 1);
            }
        }
    }
}


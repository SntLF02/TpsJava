public class ejerc4 {
    public static void main(String[] args) {
        // Programa que muestre en lineas separadas lo siguiente: ZYWXVUTSRQPONMLKJIHGFEDCBA, YWXVUTSRQPONMLKJIHGFEDCBA, WXVUTSRQPONMLKJIHGFEDCBA, ...., DCBA, CBA, BA, A.
        String abecedario="ZYWXVUTSRQPONMLKJIHGFEDCBA";

        for (int i=abecedario.length();i>=0;i--){

            for (int j=0;j<i;j++){

                System.out.print(abecedario.charAt(j));
            }
            System.out.println(" ");
        }
    }
}

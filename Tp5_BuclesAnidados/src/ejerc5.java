public class ejerc5 {
    public static void main(String[] args) {
        //Mostrar un contador de 5 dígitos. En lugar del dígito 3 se debe mostrar E


        for (int i=0;i<100000;i++){
            String muestra=""+i;
            for (int j=0;j<muestra.length();j++){
                if (muestra.charAt(j)=='3'){
                    muestra=muestra.replace('3','E');
                    break;
                }
            }
            System.out.println(muestra);
        }
    }
}

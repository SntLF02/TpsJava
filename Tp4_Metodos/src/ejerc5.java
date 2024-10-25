public class ejerc5 {
    public static void main(String[] args) {
        //Una empresa desea conocer el promedio de satisfacción de sus clientes basado en encuestas de calificación de 1 a 5.
        //
        //**Instrucciones**:
        //- Crea un arreglo `calificaciones` con las puntuaciones de satisfacción de los clientes.
        //- Escribe una función `calcularPromedioSatisfaccion` que recorra el arreglo y calcule el promedio de satisfacción

        int []calificaciones={5,2,3,4,2,3};

        System.out.println("El promedio de satisfaccion de los clientes es de:"+calcularPromedioSatisfaccion(calificaciones));

    }
    public  static float calcularPromedioSatisfaccion(int [] calificaciones){
        int suma=0;

        for (int i:calificaciones){
            suma+=i;
        }
        float promedio=(float)suma/calificaciones.length;
        return  promedio;
    }
}

public class ejerc8 {
    public static void main(String[] args) {
        //Una empresa de servicios necesita llevar el control de las horas trabajadas por sus empleados durante una semana.
        //
        //**Instrucciones**:
        //- Crea un arreglo `empleados` con los nombres de los empleados y otro arreglo `horasTrabajadas` con las horas trabajadas en la semana.
        //- Escribe una función `calcularPagoSemanal` que calcule el pago semanal (a razón de $15 por hora trabajada).

        String []empleados={"Alfredo","Miguel","Laura","Sofia","Joaquin","Cristian"};
        int []horasTrabajadas={37,46,32,48,63,56};
        int [] pago=new int[6];

        calcularPagoSemanal(horasTrabajadas,pago);

        System.out.println("Pago semanal a cada empleado:");
        for (int i=0;i< empleados.length;i++){
            System.out.println(empleados[i]+": $"+pago[i]);
        }
    }
    public static void calcularPagoSemanal(int [] horasTrabajadas,int [] pago){
        for (int i=0;i< horasTrabajadas.length;i++){
            pago[i]=horasTrabajadas[i]*15;
        }
    }
}

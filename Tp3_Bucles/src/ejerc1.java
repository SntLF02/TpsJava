import javax.swing.*;

public class ejerc1 {
    public static void main(String[] args) {
        //Un alumno quiere medir el tiempo total que dedica a sus actividades académicas y personales durante el día.
        //Instrucciones:
        //•	Pide al usuario que ingrese las horas dedicadas a cada actividad: estudiar, hacer ejercicios, leer, y tiempo libre.
        //•	Usa un bucle para registrar las horas y luego calcula el tiempo total dedicado.


        float horas,total;

        total=0;
        String []tipo= {"estudiar: ","hacer ejercicio","leer","tiempo libre"};

        try {

            for (int i=0;i<4;i++){
                horas=Float.parseFloat(JOptionPane.showInputDialog("Ingrese cuantas horas le dedica a "+tipo[i]));
                total+=horas;
            }

            JOptionPane.showMessageDialog(null,"Tiempo total dedicado: "+total+" Hs");

        }   catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Formato incorrecto");
        }



    }
}

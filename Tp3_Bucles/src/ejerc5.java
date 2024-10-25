import javax.swing.*;

public class ejerc5 {
    public static void main(String[] args) {
        //Una empresa desea calcular las horas extras trabajadas por sus empleados. Si un empleado trabaja más de 40 horas en la semana, las horas adicionales se consideran horas extras.
        //Instrucciones:
        //•	Pide al usuario ingresar el número de empleados.
        //•	Usa un bucle para ingresar las horas trabajadas por cada empleado.
        //•	Si un empleado trabajó más de 40 horas, calcula y muestra las horas extras.

        float horasT,horasEx;
        int cantidad;

        while (true){
            try {
                cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados:"));
                break;
            } catch (Exception e){
                JOptionPane.showMessageDialog(null,"Error,vuelva a intentar");
            }
        }
        for (int i=0;i<cantidad;i++) {
            while (true) {
                try {
                    horasT = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas por el empleado N°" + (i + 1) + ":"));
                    break;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error,vuelva a intentar");
                }
            }
            if (horasT>40){
                JOptionPane.showMessageDialog(null,"El empleado N°"+(i+1)+" trabajó un total de "+(horasT-40)+" horas extras");
            }
        }
    }
}

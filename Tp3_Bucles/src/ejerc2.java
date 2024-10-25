import javax.swing.*;

public class ejerc2 {
    public static void main(String[] args) {
        //Una empresa desea calcular el salario semanal de sus empleados basándose en las horas trabajadas y una tarifa fija por hora.
        //Instrucciones:
        //•	Pide al usuario ingresar la cantidad de empleados.
        //•	Para cada empleado, pide ingresar las horas trabajadas.
        //•	Usa un bucle para calcular el salario de cada empleado (suponiendo una tarifa fija de $15 por hora).

        int cantidad=0; float salario=0;

        while (true) {
            try {
                cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos empleados tiene:"));
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Formato incorrecto");
            }
        }

        float []horas = new float[cantidad];

        for (int i=0;i<cantidad;i++){

            while (true){
                try {
                    horas[i]=Float.parseFloat(JOptionPane.showInputDialog("Horas trabajadas del empleado N°"+(i+1)+":"));
                    break;
                } catch (Exception e){
                    JOptionPane.showMessageDialog(null,"Error al ingresar horas, vuelva a intentar:");
                }
            }
        }

        for (int i=0;i<cantidad;i++){
            JOptionPane.showMessageDialog(null,"Total a pagar al empleado N°"+(i+1)+": $"+(horas[i]*15+"     "));
        }


    }
}

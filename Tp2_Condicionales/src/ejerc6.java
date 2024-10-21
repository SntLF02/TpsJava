import javax.swing.*;

public class ejerc6 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario cuántas horas al día duerme, cuántas horas al día hace
        //ejercicio y cuántas comidas saludables consume al día. Luego, imprime una evaluación de sus
        //hábitos saludables basada en estos datos.

        double horasD,horasE;
        int comidas;
        String habitos;

        try {
            horasD=Double.parseDouble(JOptionPane.showInputDialog("Ingrese cuantas horas al dia duerme:"));
            horasE=Double.parseDouble(JOptionPane.showInputDialog("Ingrese cuantas horas al dia hace ejercicio:"));
            comidas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantas comidas saludable al dia come:"));

            if (horasD >= 7 && horasD <= 9 && horasE >= 1 && comidas >= 3) {
                habitos = "Tus hábitos son excelentes";
            } else if (horasD >= 6 && horasD <= 10 && horasE >= 0.5 && comidas >= 2) {
                habitos = "Tus hábitos son buenos";
            } else {
                habitos = "Podrías mejorar tus hábitos saludables.";
            }
            JOptionPane.showMessageDialog(null,habitos);


        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error al ingresar datos");
        }
    }
}

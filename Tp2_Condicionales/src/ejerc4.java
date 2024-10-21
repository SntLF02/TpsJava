import javax.swing.*;

public class ejerc4 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario su peso en kilogramos y su altura en metros, y luego
        //calcule su Índice de Masa Corporal (IMC). Imprime una recomendación basada en el IMC (bajo
        //peso, peso normal, sobrepeso, obesidad).

        double altura,peso,IMC;

        try {
            peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso en kilogramos: "));
            altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura en metros: "));
            IMC = peso / (altura * altura);

            if (IMC <= 18.5) {
                JOptionPane.showMessageDialog(null, "Indice de Masa Corporal: " + IMC + " Bajo peso");
            } else if (IMC <= 24.9) {
                JOptionPane.showMessageDialog(null, "Indice de Masa Corporal: " + IMC + " Peso normal");
            } else if (IMC <= 29.9) {
                JOptionPane.showMessageDialog(null, "Indice de Masa Corporal: " + IMC + " Sobrepeso");
            } else {
                JOptionPane.showMessageDialog(null, "Indice de Masa Corporal: " + IMC + " Obesidad");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error al ingresar datos");
        }
    }
}

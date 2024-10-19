import javax.swing.*;

public class ejerc7 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario varios factores de felicidad (nivel de satisfacción con la
        //vida, nivel de estrés, nivel de salud, etc.) en una escala del 1 al 10 y luego calcule e imprima un
        //índice de felicidad basado en esos factores.

        double opc1,opc2,opc3,opc4,total;
        String estado;

        opc1=Integer.parseInt(JOptionPane.showInputDialog("Del 1 al 10 cual es su nivel de satisfaccion con la vida?: "));
        opc2=Integer.parseInt(JOptionPane.showInputDialog("Del 1 al 10 cual es su nivel de estres?: "));
        opc3=Integer.parseInt(JOptionPane.showInputDialog("Del 1 al 10 cual es su nivel de salud?: "));
        opc4=Integer.parseInt(JOptionPane.showInputDialog("Del 1 al 10 cual es su nivel de autoestima?: "));

        total=(opc1+(10-opc2)+opc3+opc4)/4;

        if (total<4){
            estado=" :(";
        } else if (total<7){
            estado=" :/";
        } else{
            estado=" :)";
        }

        JOptionPane.showMessageDialog(null,"Indice de felicidad: " + total + estado );
    }
}

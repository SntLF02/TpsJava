import javax.swing.*;
import java.util.Random;

public class ejerc5 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario que elija entre piedra, papel o tijera. Luego, el programa
        //elige una opción al azar y determina quién gana. Imprime el resultado del juego.

        Random random = new Random();

        int opcion=0,maq;
        int numero= random.nextInt(1,4);
        String jug1,jug2;

        try {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Piedra, Papel o Tijeras!!\n" +
                    "Elija una opcion para jugar contra la maquina:\n" +
                    "[1]_Piedra  [2]_Papel  [3]_Tijera"));

        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error al ingresar opcion");
        }

        if (opcion==1){
            jug1="Piedra";
        } else if (opcion==2) {
            jug1="Papel";
        } else if (opcion==3) {
            jug1="Tijera";
        } else {
            jug1="";
        }
        if (numero==1){
            jug2="Piedra";
        } else if (numero==2) {
            jug2="Papel";
        } else if (numero==3) {
            jug2="Tijera";
        } else {
            jug2="";
        }

        if (opcion >=1 && opcion<=3) {
            if (opcion == numero) {
                JOptionPane.showMessageDialog(null, "\n" +
                        "\n" +
                        "\n" +
                        "       Yo ----> " + jug1 + "   vs   " + jug2 + " <---- Maquina          \n" +
                        "\n" +
                        "                            Empate!!");
            } else if ((opcion == 1 && numero == 3) || (opcion == 2 && numero == 1) || (opcion == 3 && numero == 2)) {
                JOptionPane.showMessageDialog(null, "\n" +
                        "\n" +
                        "\n" +
                        "       Yo ----> " + jug1 + "   vs   " + jug2 + " <---- Maquina          \n" +
                        "\n" +
                        "                            Ganaste!!");
            } else {
                JOptionPane.showMessageDialog(null, "\n" +
                        "\n" +
                        "\n" +
                        "       Yo ----> " + jug1 + "   vs   " + jug2 + " <---- Maquina          \n" +
                        "\n" +
                        "                            Perdiste!!");
            }
        }

    }
}

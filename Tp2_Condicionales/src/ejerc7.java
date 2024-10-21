import javax.swing.*;

public class ejerc7 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
        //recomiende una actividad basada en su estado de ánimo.

        int opcion;
        try {
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion segun su estado de animo actual:\n"+
                    "[1]_Feliz   [2]_Triste  [3]_Energetico  [4]_Relajado"));

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Recomendacion:\n" +
                            "Sal a dar un paseo por la naturaleza, toma fotos de cosas bonitas que veas o invita a amigos a pasar el rato.");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Recomendacion:\n" +
                            "No hay nada como una buena película para reconfortarte. También puedes escribir en un diario para liberar tus pensamientos,\n" +
                            " o si prefieres compañía, hablar con un amigo cercano.");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Recomendacion:\n" +
                            "Aprovecha esa energía para hacer ejercicio: una sesión de running, una clase de baile o incluso una intensa sesión de HIIT.");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Recomendacion:\n" +
                            "Lee un buen libro, escucha música suave o practica meditación para mantener esa calma.\n" +
                            "Tomarte el tiempo para un baño caliente también puede ser muy rejuvenecedor.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error,opcion incorrecta");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error, formato incorrecto");
        }
    }
}

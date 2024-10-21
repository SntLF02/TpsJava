import javax.swing.*;

public class ejerc1 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario su género de película favorito (acción, comedia, drama,
        //ciencia ficción) y luego recomiende una película basada en su elección.
        int opcion;
        try {
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese que estilo de pelicula le gustaria ver:\n"+
                    "[1]_Accion   [2]_Comedia  [3]_Drama  [4]_Ciencia Ficcion"));

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Pelicula de accion recomendada: Mad Max: Fury Road ");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Pelicula de comedia recomendada: Superbad");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Pelicula de drama recomendada: The Pursuit of Happyness");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Pelicula de ciencia ficcion recomendada: Blade Runner 2049");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error opcion incorrecta");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error al ingresar opcion");
        }
    }
}

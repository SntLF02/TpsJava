import javax.swing.*;

public class ejerc3 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario su género de libro favorito (fantasía, misterio, romance,
        //ciencia ficción) y luego recomiende un libro basado en su elección.

        int opcion;
        try {
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese que genero de libro le gustaria leer:\n"+
                    "[1]_Fantasia   [2]_Misterio  [3]_Romance  [4]_Ciencia Ficcion"));

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Libro de Fantasia recomendado: El Señor de los Anillos");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Libro de Misterio recomendado: Asesinato en el Expreso de Oriente");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Libro de Romance recomendado: Orgullo y Prejuicio");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Libro de Ciencia Ficcion recomendado: Dune");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error opcion incorrecta");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error al ingresar opcion");
        }
    }
}

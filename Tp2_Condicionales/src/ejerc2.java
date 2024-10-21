import javax.swing.*;

public class ejerc2 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario el precio de un producto y la categoría del cliente
        //(estudiante, adulto, jubilado). Aplica un descuento del 10% para estudiantes, 5% para adultos y
        //15% para jubilados. Imprime el precio final después del descuento.

        int opcion;
        double precio;
        try {

            precio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto "));
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la categoria en que usted se encuentra:\n" +
                    "[1]_Estudiante  [2]_Adulto  [3]_Jubilado "));

            switch (opcion){
                case 1:
                    JOptionPane.showMessageDialog(null,"Le corresponde un descuento del %10 siendo el precio final de: $"+(precio-(precio*0.1)));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Le correcponde un descuento del %5 siendo el precio final de: $"+(precio-(precio*0.05)));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Le correcponde un descuento del %15 siendo el precio final de: $"+(precio-(precio*0.15)));
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Error al ingresar opcion");
            }



        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error");
        }
    }
}

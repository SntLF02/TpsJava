import javax.swing.*;

public class ejerc3 {
    public static void main(String[] args) {
        //Una tienda necesita revisar el inventario de sus productos y determinar si algún artículo tiene menos de 5 unidades disponibles para realizar un pedido.
        //Instrucciones:
        //•	Pide al usuario ingresar el número de productos.
        //•	Usa un bucle para ingresar la cantidad disponible de cada producto.
        //•	Si algún producto tiene menos de 5 unidades, muestra un mensaje indicando que es necesario realizar un pedido.

        int productos=0,cantidad=0;

        while (true){
            try {
                productos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos productos va a ingresar:"));
                break;
            } catch (Exception e){
                JOptionPane.showMessageDialog(null,"Error, vuelva a intentar:");
            }
        }

        for (int i=0;i<productos;i++){
            while (true){
                try {
                    cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que posee del producto N°"+(i+1)+":"));
                    break;
                } catch (Exception e){
                    JOptionPane.showMessageDialog(null,"Error, vuelva a intentar:");
                }
            }
            if (cantidad<5){
                JOptionPane.showMessageDialog(null,"¡AVISO!\n Muy poca cantidad del producto N°"+(i+1)+". Es necesario hacer un pedido");
            }
        }
    }
}

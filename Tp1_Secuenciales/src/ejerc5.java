import javax.swing.*;

public class ejerc5 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario la distancia del viaje en kilómetros, el consumo de
        //combustible del vehículo en litros por kilómetro y el precio del combustible por litro, y luego
        //calcule e imprima el costo total del viaje.

        double distancia,consumo,precio,total;

        distancia=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la dsitancia del viaje en Kilometros: "));
        consumo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el consumo del vehiculo en Litros por Kilometro: "));
        precio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del combustible por Litro: "));
        total=(distancia*consumo)*precio;
        JOptionPane.showMessageDialog(null,"El costo total del viaje sera de $"+total);

    }
}

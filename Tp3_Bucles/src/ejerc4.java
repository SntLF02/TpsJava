import javax.swing.*;

public class ejerc4 {
    public static void main(String[] args) {
        //Una tienda desea registrar las ventas realizadas cada día durante una semana. El programa debe calcular el total de ventas al final de la semana.
        //Instrucciones:
        //•	Usa un bucle para registrar las ventas diarias durante 7 días.
        //•	Al final del bucle, muestra el total de ventas de la semana.

        int ventasD,total=0;

        String []dia={"Lunes:","Martes:","Mierdoles:","Jueves:","Viernes:","Sabado:","Domingo:"};

        for (int i=0;i<7;i++) {
            while (true) {
                try {
                    ventasD = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas ventas hubo el dia " + dia[i]));
                    total+=ventasD;
                    break;
                } catch (Exception e){
                    JOptionPane.showMessageDialog(null,"Error, vuelva a intentar");
                }
            }
        }

        JOptionPane.showMessageDialog(null,"El total de ventas registradas durante la semana fue de un total de: "+total);
    }
}

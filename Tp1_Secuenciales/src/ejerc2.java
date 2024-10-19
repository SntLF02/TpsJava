import javax.swing.*;

public class ejerc2 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario su peso en kilogramos, la duración del ejercicio en
        //minutos y el tipo de ejercicio (correr, nadar, andar en bicicleta), y luego calcule e imprima las
        //calorías quemadas. Utiliza diferentes tasas de calorías quemadas por minuto para cada tipo de
        //ejercicio.

        try {
            int total;
            int peso= Integer.parseInt(JOptionPane.showInputDialog("Ingrese su peso en KG: "));
            int tiempo= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo que dura el ejercicio: "));
            int tipo= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de ejercicio ([1]Correr, [2]Nadar, [3]Bicicleta): "));

            if (tipo==1) {
                if (peso < 50) {
                    total = tiempo * 5;
                } else if (peso < 70) {
                    total = tiempo * 8;
                } else if (peso < 90) {
                    total = tiempo * 10;
                } else if (peso < 110) {
                    total = tiempo * 13;
                } else {
                    total = tiempo * 16;
                }
            } else if (tipo==2) {
                if (peso < 50) {
                    total = tiempo * 3;
                } else if (peso < 70) {
                    total = tiempo * 6;
                } else if (peso < 90) {
                    total = tiempo * 8;
                } else if (peso < 110) {
                    total = tiempo * 11;
                } else {
                    total = tiempo * 15;
                }
            } else if (tipo==3) {
                if (peso < 50) {
                    total = tiempo * 2;
                } else if (peso < 70) {
                    total = tiempo * 5;
                } else if (peso < 90) {
                    total = tiempo * 7;
                } else if (peso < 110) {
                    total = tiempo * 10;
                } else {
                    total = tiempo * 14;
                }
            }
            else {
                total=0;
            }
            JOptionPane.showMessageDialog(null,"La cantidad de calorias quemadas durante el ejercicio fue de un total de: " + total + " cal.");

        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
}

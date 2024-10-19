import javax.swing.*;

public class ejerc3 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario su nivel de condición física (principiante, intermedio,
        //avanzado) y luego genere una rutina de ejercicio semanal con diferentes tipos de ejercicios y
        //duraciones.
       int nivel=0;
        do
            try {
                nivel=Integer.parseInt(JOptionPane.showInputDialog("¿Que nivel de condicion fisica posee?\n" +
                        "[1]_Principiante      [2]_Intermedio       [3]_Avanzado"));
                if (nivel<1 || nivel>3) {
                    JOptionPane.showMessageDialog(null,"Opcion incorrecta");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error al ingresar opcion");
            }
        while (nivel<1 || nivel>3);

        if (nivel==1) {
            JOptionPane.showMessageDialog(null, "Rutina Semanal nivel Principiante\n" +
                    "\n" +
                    "Lunes: - Cardio (caminar) 20 minutos - Estiramiento 10 minutos\n" +
                    "...\n" +
                    "Martes: - Pesas ligeras (piernas) 30 minutos - Estiramiento 10 minutos\n" +
                    "...\n" +
                    "Miércoles: - Yoga suave 30 minutos - Meditación 10 minutos\n" +
                    "...\n" +
                    "Jueves: - Cardio (bicicleta) 20 minutos - Estiramiento 10 minutos\n" +
                    "...\n" +
                    "Viernes: - Pesas ligeras (brazos) 30 minutos - Estiramiento 10 minutos\n" +
                    "...\n" +
                    "Sábado: - HIIT (baja intensidad) 15 minutos - Yoga 20 minutos\n" +
                    "...\n" +
                    "Domingo: - Descanso y caminata ligera 20 minutos");
        } else if (nivel==2) {
            JOptionPane.showMessageDialog(null, "Rutina de Semanal Nivel Intermedio\n"+
                    "\n"+
                    "Lunes: - Cardio (correr) 30 minutos - Abdominales 15 minutos\n" +
                    "...\n" +
                    "Martes: - Pesas (piernas) 45 minutos - Estiramiento 10 minutos\n" +
                    "...\n" +
                    "Miércoles: - Yoga 60 minutos - Meditación 10 minutos\n" +
                    "...\n" +
                    "Jueves: - Cardio (bicicleta) 30 minutos - Abdominales 15 minutos\n" +
                    "...\n" +
                    "Viernes: - Pesas (brazos) 45 minutos - Estiramiento 10 minutos\n" +
                    "...\n" +
                    "Sábado: - HIIT 20 minutos - Yoga 30 minutos\n" +
                    "...\n" +
                    "Domingo: - Descanso y caminata ligera 30 minutos");
        } else if (nivel==3) {
            JOptionPane.showMessageDialog(null, "Rutina de Semanal Nivel Avanzado\n" +
                    "\n" +
                    "Lunes: - CrossFit 60 minutos - Abdominales en intervalos 30 minutos\n" +
                    "...\n" +
                    "Martes: - Pesas (piernas y glúteos) 75 minutos - Yoga de fuerza 20 minutos\n" +
                    "...\n" +
                    "Miércoles: - Entrenamiento funcional 60 minutos - Cardio (escaladora) 30 minutos\n" +
                    "...\n" +
                    "Jueves: - Cardio mixto (correr y bicicleta) 60 minutos - HIIT de core 30 minutos\n" +
                    "...\n" +
                    "Viernes: - Pesas (espalda y hombros) 75 minutos - Estiramiento dinámico 15 minutos\n" +
                    "...\n" +
                    "Sábado: - Boxeo 45 minutos - Yoga restaurativo 30 minutos\n" +
                    "...\n" +
                    "Domingo: - Descanso activo (hiking o natación intensa) 60 minutos");

        } else {
            JOptionPane.showMessageDialog(null, "ERROR inesperado");
        }

    }
}

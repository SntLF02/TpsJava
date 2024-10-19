import javax.swing.*;

public class ejerc6 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario cuántas horas al día puede estudiar y luego genere un
        //plan de estudio semanal distribuyendo esas horas en diferentes materias.

        String Horas = JOptionPane.showInputDialog("¿Cuántas horas al día puedes estudiar?");
        int horasDiarias = Integer.parseInt(Horas);

        String planEstudio = "Plan de Estudio Semanal:\n" +
                "Lunes: Programacion Java - " + horasDiarias + " horas\n" +
                "Martes: Matematica - " + horasDiarias + " horas\n" +
                "Miércoles: Arquitectura SO - " + horasDiarias + " horas\n" +
                "Jueves: Organizacion Emp. - " + horasDiarias + " horas\n" +
                "Viernes: Programacion Python - " + horasDiarias + " horas\n" +
                "Sábado: Programacion Java/Python - " + horasDiarias + " horas\n" +
                "Domingo: Descanso";

        JOptionPane.showMessageDialog(null, planEstudio);

    }
}

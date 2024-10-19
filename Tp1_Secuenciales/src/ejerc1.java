import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ejerc1 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario su fecha de nacimiento (en formato DD/MM/AAAA) y luego
        //imprima su signo del zodiaco y un mensaje de horóscopo correspondiente.

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;

        try {
            String entrada = JOptionPane.showInputDialog("Ingrese su fecha de nacimiento en el formato DD/MM/AAAA: ");
            fecha=formato.parse(entrada);

            Calendar cal = Calendar.getInstance();
            cal.setTime(fecha);
            int dia = cal.get(Calendar.DAY_OF_MONTH);
            int mes = cal.get(Calendar.MONTH) + 1; // Enero es 0, por eso sumamos 1

            if ((dia >= 21 && mes == 3) || (dia <= 19 && mes == 4)) {
                JOptionPane.showMessageDialog(null , "Aries\nEste año estarás reinventándote desde cero\nCon el Nodo Norte lunar en tu signo, es un momento de cambios significativos\ny oportunidades para el crecimiento personal" );
            } else if ((dia >= 20 && mes == 4) || (dia <= 20 && mes == 5)) {
                JOptionPane.showMessageDialog(null , "Tauro\n2024 trae sorpresas y oportunidades, especialmente en la primera mitad del año con Júpiter en tu signo.\nPrepárate para mejoras en tu perfil personal y éxito financiero");
            } else if ((dia >= 21 && mes == 5) || (dia <= 20 && mes == 6)) {
                JOptionPane.showMessageDialog(null ,  "Géminis\nEste año se trata de expansión y aprendizaje.\nJúpiter en tu signo a partir de mayo te traerá nuevas oportunidades para el\ncrecimiento intelectual y personal");
            } else if ((dia >= 21 && mes == 6) || (dia <= 22 && mes == 7)) {
                JOptionPane.showMessageDialog(null , "Cáncer\n2024 será un año de introspección y desarrollo emocional.\nSaturno en Piscis te desafiará a profundizar en tu bienestar espiritual y emocional");
            } else if ((dia >= 23 && mes == 7) || (dia <= 22 && mes == 8)) {
                JOptionPane.showMessageDialog(null , "Leo\nEste año te enfocarás en tus relaciones y en encontrar un equilibrio entre tu vida personal y profesional.\nLas alineaciones planetarias te ayudarán a fortalecer tus vínculos");
            } else if ((dia >= 23 && mes == 8) || (dia <= 22 && mes == 9)) {
                JOptionPane.showMessageDialog(null ,  "Virgo\n2024 será un año de crecimiento profesional y personal.\nCon Saturno en Piscis, enfrentarás desafíos que te ayudarán a desarrollar\nuna mayor sabiduría y conocimiento");
            } else if ((dia >= 23 && mes == 9) || (dia <= 22 && mes == 10)) {
                JOptionPane.showMessageDialog(null , "Libra\nEste año te centrarás en tu bienestar y en encontrar un equilibrio en tu vida.\nLas influencias planetarias te guiarán hacia una mayor armonía y paz interior");
            } else if ((dia >= 23 && mes == 10) || (dia <= 21 && mes == 11)) {
                JOptionPane.showMessageDialog(null , "Escorpio\n2024 será un año de transformación y renovación. Con Plutón moviéndose entre\nCapricornio y Acuario, experimentarás cambios profundos en tu vida");
            } else if ((dia >= 22 && mes == 11) || (dia <= 21 && mes == 12)) {
                JOptionPane.showMessageDialog(null ,  "Sagitario\nEste año te traerá oportunidades para la aventura y el crecimiento personal.\nJúpiter en Géminis a partir de mayo te impulsará a explorar nuevas ideas y experiencias");
            } else if ((dia >= 22 && mes == 12) || (dia <= 19 && mes == 1)) {
                JOptionPane.showMessageDialog(null , "Capricornio\n2024 será un año de consolidación y éxito.\nCon Plutón en tu signo, tendrás la oportunidad de\ntransformar tu carrera y alcanzar nuevas metas");
            } else if ((dia >= 20 && mes == 1) || (dia <= 18 && mes == 2)) {
                JOptionPane.showMessageDialog(null , "Acuario\nEste año te centrarás en tu desarrollo personal y en encontrar tu propósito.\nLas alineaciones planetarias te ayudarán a descubrir nuevas pasiones y objetivos");
            } else if ((dia >= 19 && mes == 2) || (dia <= 20 && mes == 3)) {
                JOptionPane.showMessageDialog(null , "Piscis\n2024 será un año de crecimiento espiritual y emocional.\nCon Saturno en tu signo, enfrentarás desafíos que te ayudarán\na desarrollar una mayor comprensión y sabiduría");
            }

        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null ,"Error");
        }

    }
}

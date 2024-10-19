import javax.swing.*;

public class ejerc4 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
        //genere una lista de reproducción con canciones sugeridas para ese estado de ánimo.
        int opcion=0;
        do
            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog("¿Cual es su estado de ánimo?\n" +
                        "[1]_Feliz      [2]_Triste       [3]_Energico      [4]_Relajado"));
                if (opcion<1 || opcion>4) {
                    JOptionPane.showMessageDialog(null,"Opcion incorrecta");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error al ingresar opcion");
            }
        while (opcion<1 || opcion>4);


        if (opcion==1) {
            JOptionPane.showMessageDialog(null, "Lista de Reproducción - Estado de Ánimo: Feliz\n" +
                    "\n" +
                    "1. Happy - Pharrell Williams\n" +
                    "...\n" +
                    "2. Can't Stop the Feeling! - Justin Timberlake\n" +
                    "...\n" +
                    "3. Walking on Sunshine - Katrina and the Waves\n" +
                    "...\n" +
                    "4. Uptown Funk - Mark Ronson ft. Bruno Mars\n" +
                    "...\n" +
                    "5. Good as Hell - Lizzo\n" +
                    "...\n" +
                    "6. Dancing Queen - ABBA\n" +
                    "...\n" +
                    "7. I Gotta Feeling - The Black Eyed Peas\n" +
                    "...\n" +
                    "8. Shake It Off - Taylor Swift\n" +
                    "...\n" +
                    "9. Celebration - Kool & The Gang\n" +
                    "...\n" +
                    "10. Roar - Katy Perry\n");
        } else if (opcion==2) {
            JOptionPane.showMessageDialog(null, "Lista de Reproducción - Estado de Ánimo: Triste\n" +
                    "\n" +
                    "1. Someone Like You - Adele\n" +
                    "...\n" +
                    "2. Fix You - Coldplay\n" +
                    "...\n" +
                    "3. The Night We Met - Lord Huron\n" +
                    "...\n" +
                    "4. Tears Dry on Their Own - Amy Winehouse\n" +
                    "...\n" +
                    "5. Skinny Love - Bon Iver\n" +
                    "...\n" +
                    "6. Yesterday - The Beatles\n" +
                    "...\n" +
                    "7. Stay With Me - Sam Smith\n" +
                    "...\n" +
                    "8. I'm Not the Only One - Sam Smith\n" +
                    "...\n" +
                    "9. Everybody Hurts - R.E.M.\n" +
                    "...\n" +
                    "10. Breathe Me - Sia\n");
        } else if (opcion==3) {
            JOptionPane.showMessageDialog(null, "Lista de Reproducción - Estado de Ánimo: Enérgico\n" +
                    "\n" +
                    "1. Eye of the Tiger - Survivor\n" +
                    "...\n" +
                    "2. Lose Yourself - Eminem\n" +
                    "...\n" +
                    "3. Run the World (Girls) - Beyoncé\n" +
                    "...\n" +
                    "4. Stronger - Kanye West\n" +
                    "...\n" +
                    "5. Can't Hold Us - Macklemore & Ryan Lewis ft. Ray Dalton\n" +
                    "...\n" +
                    "6. Thunderstruck - AC/DC\n" +
                    "...\n" +
                    "7. Let's Get It Started - The Black Eyed Peas\n" +
                    "...\n" +
                    "8. On Top of the World - Imagine Dragons\n" +
                    "...\n" +
                    "9. Feel So Close - Calvin Harris\n" +
                    "...\n" +
                    "10. We Will Rock You - Queen\n");
        } else if (opcion==4) {
            JOptionPane.showMessageDialog(null, "Lista de Reproducción - Estado de Ánimo: Relajado\n" +
                    "\n" +
                    "1. Weightless - Marconi Union\n" +
                    "...\n" +
                    "2. Clair de Lune - Claude Debussy\n" +
                    "...\n" +
                    "3. Aguas de Março - Antônio Carlos Jobim\n" +
                    "...\n" +
                    "4. Breathe - Telepopmusik\n" +
                    "...\n" +
                    "5. Strawberry Swing - Coldplay\n" +
                    "...\n" +
                    "6. Come Away With Me - Norah Jones\n" +
                    "...\n" +
                    "7. Holocene - Bon Iver\n" +
                    "...\n" +
                    "8. Pink Moon - Nick Drake\n" +
                    "...\n" +
                    "9. Banana Pancakes - Jack Johnson\n" +
                    "...\n" +
                    "10. Peaceful Easy Feeling - Eagles\n");
        } else {
            JOptionPane.showMessageDialog(null,"Error inesperado");
        }
    }
}

import java.util.Scanner;

public class Conjugaison {

    public static void main (String[] args) {
        
        Scanner readScanner = new Scanner(System.in);
        System.out.println("veuiller entrer un verbe du premier groupe");
        String verbe = readScanner.nextLine();

        // essayons de creer un radical pour le verbe qu'on recupere

        String radical = verbe.substring(0, verbe.length() -2);

        // maintenant on cree deux tableaux a parcourir pour la conjugaison du verbe

        String[] prounoums = new String[]{"Je", "Tu", "Il/Elle", "Nous", "Vous", "Ils/Elles"};
        String[] terminaisons = new String[]{"e", "es", "e", "ons", "ez", "ent"};
        
        // Maintenaint nous creer une brique de code permettant l'affichage de la conjugaison du verbe

        for (int i = 0; i < 6; i++) {
            System.out.println(prounoums[i] + " " + radical + terminaisons[i]);
        }

        
    }
    
}
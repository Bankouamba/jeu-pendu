import java.util.Scanner;

public class Pendu {

    static String[] pendu = {
            
                 "+---+\n      |\n       |\n
        |\n         |\n     |\n========= ",
             "  +---+\n  |   |\n     O       |\n            |\n========= ",
        |\n         |\n     |\n========= ",
             "  +---+\n  |   |\n     O       |\n            |\n========= ",
        |\n         |\n      |\n========= ",
             "  +---+\n  |   |\n     O       |\n   
        |\n         |\n      |\n========= ",
           "   +---+\n  |    |\n     O       |\n 
        |\n      |\n         |\n========= ",
             "  +---+\n  |   |\n     O   |\n
        |\n           |\n     |\n========= ",
            "  +---+\n  |     |\n      O    |\n      |\n========= "
             };
           //METHODES
           static void afficherPendu(int erreurs) {
           system.out.println(pendu[erreurs])
           ;
           }
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String motSecret = "JAVA";
        boolean trouve = false;
        int maxErreurs = pendu.length -1;
    }
        while (!trouve){ 

            System.out.print("Entrez une lettre : ");
            char lettre = scanner.next().toUpperCase().charAt(0);

            if (motSecret.indexOf(lettre) != -1) {
                System.out.println("Bonne lettre !");
                trouve = true;
            } else {
                System.out.println("Erreur !"+(maxErreurs - erreurs));
                afficherPendu(erreurs);
            }

        }
    
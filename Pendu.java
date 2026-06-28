import java.util.Scanner;

public class Pendu {
    static int nbv=0;

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

        BanqueMots banquemots= new BanqueMots();
        String motSecret= banquemots.tirerMotAuHasard();
        boolean trouve = false;
<<<<<<< HEAD
        int maxErreurs = pendu.length -1;
    }
        while (!trouve){ 
=======
        int restessai=6;

        while (!trouve && restessai>0) {
>>>>>>> 5b109e9d364e86f4cf202e51a1c6c31348153a56

            System.out.print("Entrez une lettre : ");
            char lettre = scanner.next().toUpperCase().charAt(0);

            if (motSecret.indexOf(lettre) != -1) {
                System.out.println("Bonne lettre !");
                trouve = true;
            } else {
<<<<<<< HEAD
                System.out.println("Erreur !"+(maxErreurs - erreurs));
                afficherPendu(erreurs);
=======
                System.out.println("Mauvaise lettre.");
                restessai--;
                System.out.println("Tentatives restantes:"+restessai);
>>>>>>> 5b109e9d364e86f4cf202e51a1c6c31348153a56
            }


        }
        if (trouve){
            nbv++;
            System.out.println("Victoires,cumul des victoires:"+nbv);
        }
        else{
            System.out.println("oups,le mot etait:"+motSecret);
        }
    
import java.util.Scanner;

public class Pendu {
    static int nbv=0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BanqueMots banquemots= new BanqueMots();
        String motSecret= banquemots.tirerMotAuHasard();
        boolean trouve = false;
        int restessai=6;

        while (!trouve && restessai>0) {

            System.out.print("Entrez une lettre : ");
            char lettre = scanner.next().toUpperCase().charAt(0);

            if (motSecret.indexOf(lettre) != -1) {
                System.out.println("Bonne lettre !");
                trouve = true;
            } else {
                System.out.println("Mauvaise lettre.");
                restessai--;
                System.out.println("Tentatives restantes:"+restessai);
            }


        }
        if (trouve){
            nbv++;
            System.out.println("Victoires,cumul des victoires:"+nbv);
        }
        else{
            System.out.println("oups,le mot etait:"+motSecret);
        }

        System.out.println("Fin du jeu !");
        scanner.close();
    }
}
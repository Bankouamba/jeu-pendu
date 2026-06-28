import java.util.Scanner;

public class Pendu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String motSecret = "JAVA";
        boolean trouve = false;

        while (!trouve) {

            System.out.print("Entrez une lettre : ");
            char lettre = scanner.next().toUpperCase().charAt(0);

            if (motSecret.indexOf(lettre) != -1) {
                System.out.println("Bonne lettre !");
                trouve = true;
            } else {
                System.out.println("Mauvaise lettre.");
            }

        }

        System.out.println("Fin du jeu !");
        scanner.close();
    }
}
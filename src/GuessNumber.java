import java.util.Random;
import java.util.Scanner;
public class GuessNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    /*
    int numberToGuess = 3;
    int userGuess = -1;

    while (userGuess != 3) {
        System.out.println("Gæt et tal mellem 1-10");
        userGuess = input.nextInt();
    }
    System.out.println("Tillykke, du har gættet rigtigt.");
     */

        Random rand = new Random();
        int numberToGuess = rand.nextInt(10) + 1;
        int userGuess = -1;
        int numberOfTries = 0;

        while (userGuess != numberToGuess) {
            System.out.println("Gæt et tal mellem 1-10");
            userGuess = input.nextInt();

            if (userGuess == numberToGuess) {
            } else if (userGuess > numberToGuess) {
                System.out.println("Forkert! Tallet jeg tænker på er mindre. Prøv igen");

            } else {
                System.out.println("Forkert! Tallet jeg tænker på er større. Prøv igen");
            }
            numberOfTries++;
        }
        System.out.println("Rigtigt! Det tal jeg tænkte på var " + numberToGuess + ". Du gættede rigtigt efter " + numberOfTries + " forsøg.");
    }
}
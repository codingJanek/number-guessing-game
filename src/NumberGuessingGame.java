import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number = Math.abs(random.nextInt(50));
        int counter = 0;
        boolean weiter = true;

        while (weiter) {
            System.out.print("Gebe eine zahl zwischen 1 und 50 ein: ");
            int eingabe = scanner.nextInt();
        if (eingabe < number) {
            System.out.println("Deine Zahl ist zu klein!");
            counter++;
        } else if (eingabe > number) {
            System.out.println("Deine zahl ist zu groß!");
            counter++;
        } else {
            counter++;
            System.out.println("Richtig geraten. Du hast " + counter + " Versuche gebraucht");
            weiter = false;
            }
        }
    }
}

**#Number Guessing Game#**

This is a simple Java console application where the player attempts to guess a randomly generated number between 1 and 50. The program provides feedback after each guess and counts the number of attempts.

**Features**

- Generates a random number between 1 and 50.

- Provides feedback if the guess is too high or too low.

- Displays the total number of attempts upon guessing the correct number.

**How to Run the Program**

**Prerequisites**

Ensure you have Java installed on your machine (minimum version 8).

A text editor or IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code) for running Java programs.

Steps to Run

Copy the code below into a file named NumberGuessingGame.java:

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
            System.out.print("Gebe eine Zahl zwischen 1 und 50 ein: ");
            int eingabe = scanner.nextInt();
            if (eingabe < number) {
                System.out.println("Deine Zahl ist zu klein!");
                counter++;
            } else if (eingabe > number) {
                System.out.println("Deine Zahl ist zu groß!");
                counter++;
            } else {
                counter++;
                System.out.println("Richtig geraten. Du hast " + counter + " Versuche gebraucht");
                weiter = false;
            }
        }
    }
}

Open a terminal or command prompt.

Navigate to the directory containing the NumberGuessingGame.java file.

Compile the program using the command:

javac NumberGuessingGame.java

Run the program using the command:

java NumberGuessingGame

Playing the Game

Follow the on-screen prompts to input your guesses.

Sample Output

Gebe eine Zahl zwischen 1 und 50 ein: 25
Deine Zahl ist zu klein!
Gebe eine Zahl zwischen 1 und 50 ein: 40
Deine Zahl ist zu groß!
Gebe eine Zahl zwischen 1 und 50 ein: 30
Richtig geraten. Du hast 3 Versuche gebraucht

Notes

The random number is generated using Java's Random class.

Input validation is not implemented in this version, so entering non-integer values may cause the program to crash.

Possible Improvements

Add input validation to handle non-integer inputs gracefully.

Allow the player to specify the range of numbers.

Add a replay option to restart the game after finishing.

Enjoy playing the game!

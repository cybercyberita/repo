/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: 09/18/2024
 * Platform/compiler:
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Adrian Carrsco
*/
package Assignment1;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;

public class ESPGame 
{
    // enum for the colors
    enum Color {
        BLACK, WHITE, GRAY, SILVER, MAROON, RED, PURPLE, FUCHSIA, GREEN, LIME, OLIVE, YELLOW, NAVY, BLUE, TEAL, AQUA;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int correctGuesses = 0;

        // welcome message and reading from file
        System.out.println("CMSC203 Assignment1: Test your ESP skills!");
        System.out.print("Enter the filename: ");
        String filename = "C:\\Users\\adria\\OneDrive\\Desktop\\CMSC 203\\Assignment1\\" + scanner.nextLine();

        try 
        {
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);

            // display colors from the file
            System.out.println("There are sixteen colors from a file:");
            int lineNumber = 1;
            while (fileScanner.hasNextLine()) 
            {
                String color = fileScanner.nextLine();
                System.out.println(lineNumber + " " + color);
                lineNumber++;
            }

            // game loop - 3 rounds
            for (int round = 1; round <= 3; round++) 
            {
                System.out.println("\nRound " + round);
                System.out.println("I am thinking of a color.");
                System.out.println("Is it one of the list of colors above?");

                // generate random number from 1 to 16
                int randomColorNumber = random.nextInt(16) + 1;
                Color selectedColor = null;

                // get the corresponding color based on the number (manual switch logic here)
                switch (randomColorNumber) {
                    case 1:
                        selectedColor = Color.BLACK;
                        break;
                    case 2:
                        selectedColor = Color.WHITE;
                        break;
                    case 3:
                        selectedColor = Color.GRAY;
                        break;
                    case 4:
                        selectedColor = Color.SILVER;
                        break;
                    case 5:
                        selectedColor = Color.MAROON;
                        break;
                    case 6:
                        selectedColor = Color.RED;
                        break;
                    case 7:
                        selectedColor = Color.PURPLE;
                        break;
                    case 8:
                        selectedColor = Color.FUCHSIA;
                        break;
                    case 9:
                        selectedColor = Color.GREEN;
                        break;
                    case 10:
                        selectedColor = Color.LIME;
                        break;
                    case 11:
                        selectedColor = Color.OLIVE;
                        break;
                    case 12:
                        selectedColor = Color.YELLOW;
                        break;
                    case 13:
                        selectedColor = Color.NAVY;
                        break;
                    case 14:
                        selectedColor = Color.BLUE;
                        break;
                    case 15:
                        selectedColor = Color.TEAL;
                        break;
                    case 16:
                        selectedColor = Color.AQUA;
                        break;
                }

                // user guess
                System.out.print("Enter your guess: ");
                String userGuess = scanner.nextLine().trim();

                // check if the guess is correct
                if (userGuess.equalsIgnoreCase(selectedColor.name())) 
                {
                    System.out.println("I was thinking of " + selectedColor.name() + ".");
                    correctGuesses++;
                } else
                    System.out.println("I was thinking of " + selectedColor.name() + ".");
            }

            // Game over and result
            System.out.println("Game Over");
            System.out.println("You guessed " + correctGuesses + " out of 3 colors correctly.");

            // Get additional information from the user
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Describe yourself: ");
            String description = scanner.nextLine();
            System.out.print("Due Date (MM/DD/YY): ");
            String dueDate = scanner.nextLine();

            // Display final information
            System.out.println("User Name: " + name);
            System.out.println("User Description: " + description);
            System.out.println("Due Date: " + dueDate);

        } catch (FileNotFoundException e)
        {
            System.out.println("File not found. Please make sure the file exists.");
        }
        scanner.close();
    }
}

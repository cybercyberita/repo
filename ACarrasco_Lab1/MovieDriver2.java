package Lab1;

import java.util.Scanner;

public class MovieDriver2 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        String continueResponse;
        do 
        {
            Movie movie = new Movie();

            System.out.println("Enter the movie title:");
            String title = scanner.nextLine();
            movie.setTitle(title);

            System.out.println("Enter the movie rating:");
            String rating = scanner.nextLine();
            movie.setRating(rating);

            System.out.println("Enter the number of tickets sold at a theater:");
            int ticketsSold = scanner.nextInt();
            movie.setSoldTickets(ticketsSold);

            scanner.nextLine();  // Discard the leftover newline character

            System.out.println(movie.toString());

            System.out.println("Do you want to enter another movie? (yes/no):");
            continueResponse = scanner.nextLine();

        } while (continueResponse.equalsIgnoreCase("yes"));

        scanner.close();
    }
}

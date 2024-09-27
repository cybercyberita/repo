package Lab1;

import java.util.Scanner;

public class MovieDriver1 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

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
        
        scanner.close();
    }
}

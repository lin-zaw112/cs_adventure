import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // * Get the player's name and create a new Player object
            Player player = new Player();
            util.clearConsole();
            System.out.print("Enter Your Name: ");
            
            // ! Check if the input is a valid string
            while (!scanner.hasNextLine()) {
                System.out.println("Invalid input. Please enter a valid name.");
                scanner.next();
            }
            String name = scanner.nextLine();

            // * Set the player's name and generate a random luck value
            player.setName(name);
            player.setLuck(util.getRandomNumber(0, 6));

            // * Clear the console and display the player's information
            util.clearConsole();
            util.display(player);
            System.out.println();
            System.out.println("Press Enter to continue...");
            scanner.nextLine();

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // * Get the player's name and create a new Player object
            Player player = new Player();
            util.clearConsole();
            System.out.print("Enter Your Name: ");
            // ! Check if the input is a valid string
            while (!sc.hasNextLine()) {
                System.out.println("Invalid input. Please enter a valid name.");
                sc.next();
            }
            String name = sc.nextLine();
            // * Set the player's name and generate a random luck value
            player.setName(name);
            player.setLuck(util.getRandomNumber(0, 6));
            // * Clear the console and display the player's information
            util.clearConsole();
            util.display(player);
            System.out.println();
            System.out.println("Press Enter to continue...");
            sc.nextLine();
    }
}
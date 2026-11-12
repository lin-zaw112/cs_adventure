public class Main {
    public static void main(String[] args) {
        try {
            playGame();
        } catch (Input.InputClosedException e) {
            System.out.println("\nInput closed. Thanks for playing!");
        }
    }

    private static void playGame() {

            // * Get the player's name and create a new Player object
            Player player = new Player();
            String name = Input.getUserInputStringWithPrompt("Enter Your Name");

            // * Set the player's name
            player.setName(name);

            // * Create a new Game object and start the game
            Game game = new Game(player);
            while (true) {
                game.start();
                System.out.println();
                Util.displayQ("Would you like to play again?", "[1] Yes", "[2] No");
                int choice = Input.getUserInputIntWithPrompt("Enter your choice (1-2)", 1, 2);
                if (choice == 2) {
                    Util.displayAns("Thanks for playing!");
                    break;
                }
                player.reset();
            }
        
    }
}

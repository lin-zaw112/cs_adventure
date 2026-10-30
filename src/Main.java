public class Main {
    public static void main(String[] args) {

            // * Get the player's name and create a new Player object
            Player player = new Player();
            String name = Input.getUserInputStringWithPrompt("Enter Your Name");

            // * Set the player's name and generate a random luck value
            player.setName(name);
            player.changeLuck(util.getRandomNumber(0, 6));

            // * Create a new Game object and start the game
            Game game = new Game(player);
            game.start();

    }
}
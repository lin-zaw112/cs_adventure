public class Game {
    private final Player player;

    public Game(Player player) {
        this.player = player;
    }

    public void start() {
        // * Clear the console and display the player's information
        util.clearConsole();
        player.display();
        System.out.println();
        // * Show the intro Scene
        IntroScene intro = new IntroScene();
        intro.play(player);
    }
}

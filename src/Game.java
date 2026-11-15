public class Game {
    private final Player player;
    private final MusicPlayer musicPlayer;

    public Game(Player player) {
        this.player = player;
        this.musicPlayer = new MusicPlayer();
    }

    public void start() {
        musicPlayer.play("./music/slayr_-_Holding_Instrumental.wav");

        try {
            Util.clearConsole();

            playScenes();
            new Final().play(player);
        } finally {
            // Runs even if a scene throws an exception.
            musicPlayer.stop();
        }
    }

    private void playScenes() {
        if (player.isAlive()) return;

        new IntroScene().play(player);
        if (player.isAlive()) return;

        new CalculusScene().play(player);
        if (player.isAlive()) return;

        new LunchScene().play(player);
        if (player.isAlive()) return;

        if (player.getStudyAfterLunch()) {
            new StudyScene().play(player);
        } else {
            new HangOutScene().play(player);
        }

        if (player.isAlive()) return;

        new EndingScene().play(player);
    }
}

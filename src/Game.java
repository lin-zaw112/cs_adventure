public class Game {
    private final Player player;

    public Game(Player player) {
        this.player = player;
    }

    public void start() {
        // * Clear the console and display the player's information
        Util.clearConsole();
        // * Show the intro Scene
        IntroScene intro = new IntroScene();
        CalculusScene calculus = new CalculusScene();
        LunchScene lunch = new LunchScene();
        EndingScene ending = new EndingScene();
        Final finalScene = new Final();
        while (player.isAlive()) {

            intro.play(player);
            if(player.isAlive()) break;
            calculus.play(player);
            if(player.isAlive()) break;
            lunch.play(player);
            if(player.isAlive()) break;
            if(player.getStudyAfterLunch()){
                StudyScene study = new StudyScene();
                study.play(player);
                if(player.isAlive()) break;
            } else {
                HangOutScene hangOut = new HangOutScene();
                hangOut.play(player);
                if(player.isAlive()) break;
            }
            ending.play(player);
        }
    finalScene.play(player);


    }
}

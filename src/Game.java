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
        HangOutScene hangOut = new HangOutScene();
        Final finalScene = new Final();



        intro.play(player);
        calculus.play(player);
        lunch.play(player);
        if(player.getStudyAfterLunch()){
            StudyScene study = new StudyScene();
            study.play(player);
        } else {
            hangOut.play(player);
        }
        ending.play(player);
        finalScene.play(player);
    }
}

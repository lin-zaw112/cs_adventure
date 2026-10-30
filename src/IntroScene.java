public class IntroScene extends Scene {
    public IntroScene() {
        super("You open the university admission result. Congratulations: you are now a first-year Computer Science student at KMUTT's School of Information Technology (SIT). What do you do first?",
                "1. Celebrate, then look up what Computer Science actually includes.\n" +
                "2. Watch Youtube videos about programming.\n" +
                "3. Tell your family you are gonna rich and has a good job in the future.");
    }

    @Override
    public void display() {
        System.out.println(getTitle());
        System.out.println();
        System.out.println(getDescription());
        System.out.println();
    }

    @Override
    public void play(Player player) {
        System.out.println();
        // * Display the scene's title and description
        display();
        int choice = Input.getUserInputIntWithPrompt("Enter your choice (1-3): ", 1, 3);
        // * Clear the console and update the player's stress and luck based on their choice
        util.clearConsole();
        switch (choice) {
            case 1 :
                break;
            case 2 :
                player.changeStress(10);
                break;
            case 3 :
                player.changeStress( 5);
                player.changeLuck(-1);
                break;
        }
        // * Display the player's updated information and the scene's description
        player.display();
        System.out.println();
        display();
        switch (choice) {
            case 1:
                System.out.println("You celebrate and then look up what Computer Science actually includes. You feel more prepared for your studies.");
                break;
            case 2:
                System.out.println("After 1 week in the university, you realize that most of the courses are not about learning programming, but about understanding the underlying concepts and principles. You start to feel stressed about your future.");
                break;
            case 3:
                System.out.println("After first semester, you start to realize that AI is taking over the world and you are not as lucky as you thought. Your future is not as bright as you expected and you start to feel stressed about your future.");
                break;
        }
        // * Prompt the player to continue to the next scene
        System.out.println();
        Input.Continue();
    }
}

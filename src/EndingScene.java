public class EndingScene extends Scene {
    public EndingScene() {
        super("You finally stop studying after a couple hours. Your stomach growls. You look at the time and realize that it's almost 9pm.  You try to think of something to eat.",
                "");
    }

    @Override
    public void display() {
        System.out.println(getTitle());
        System.out.println();
    }

    @Override
    public void play(Player player) {
        display();

        // Question 1
        System.out.println("A. You don't have anything to eat so you open a food delivery app to order some food.");
        System.out.println();
        System.out.println("[1] You order chicken rice and a side dish with soup.");
        System.out.println("[2] You order fast food from MacDonald's.");
        System.out.println("[3] You keep studying without eating.");
        System.out.println();

        int choice1 = Input.getUserInputIntWithPrompt("Enter your choice (1-3)", 1, 3);

        Util.clearConsole();
        switch (choice1) {
            case 1:
                player.changeStress(-10);
                break;
            case 2:
                player.changeStress(+5);
                break;
            case 3:
                player.changeStress(+5);
                break;
        }

        player.display();
        System.out.println();
        display();
        System.out.println("A. You don't have anything to eat so you open a food delivery app to order some food.");
        System.out.println();
        System.out.println("[1] You order chicken rice and a side dish with soup.");
        System.out.println("[2] You order fast food from MacDonal's.");
        System.out.println("[3] You keep studying without eating.");
        System.out.println();

        switch (choice1) {
            case 1:
                System.out.println("You feel energize with healthy food and ready for another study session.");
                break;
            case 2:
                System.out.println("You feel a little bit sluggish but you study anyway.");
                break;
            case 3:
                System.out.println("Your stormach is making a lot of noise but you ignore it and keep on studying.");
                break;
        }

        System.out.println();
        Input.Continue();

        // Question 2
        player.display();
        System.out.println();
        System.out.println(
                "B. It's time to go to bed. You need to rest for tomorrow. You've given everything you got today. You deserve your rest.");
        System.out.println();
        System.out.println("[1] You wash your face and brush your teeth. You meditate for a bit and go to bed.");
        System.out.println("[2] You drop everything and just go to bed.");
        System.out.println("[3] You pull an all-nighter.");
        System.out.println();

        int choice2 = Input.getUserInputIntWithPrompt("Enter your choice (1-3)", 1, 3);

        Util.clearConsole();
        
        switch (choice2) {
            case 1:
                player.changeStress(-15);
                break;
            case 2:
                player.changeStress(+1);
                break;
            case 3:
                player.changeStress(+20);
                break;
        }

        player.display();
        System.out.println();
        System.out.println(
                "B. It's time to go to bed. You need to rest for tomorrow. You've given everything you got today. You deserve your rest.");
        System.out.println();
        System.out.println("[1] You wash your face and brush your teeth. You meditate for a bit and go to bed.");
        System.out.println("[2] You drop everything and just go to bed.");
        System.out.println("[3] You pull an all-nighter.");
        System.out.println();

        switch (choice2) {
            case 1:
                System.out.println("You feel refresh and calm. You get under the blanket and sleep away.");
                break;
            case 2:
                System.out.println("You feel a little bit dirty but you still sleep anyway.");
                break;
            case 3:
                System.out.println("You feel so much stress so you keep studying and you fell a sleep on the table.");
                break;
        }
        System.out.println();
        Input.Continue();
    }
}

public class EndingScene extends Scene {
    public EndingScene() {
        super("Evening", "You stop studying after a couple of hours. Your stomach growls. It's almost 9 p.m., and you think about what to eat.");
    }


    @Override
    public void play(Player player) {
        display();
        player.display();

        // Question 1
        Util.printTextColor(Util.boldBlue, "A. You don't have anything to eat so you open a food delivery app to order some food.");
        System.out.println();
        Util.printTextColor(Util.boldGreen, "[1] You order fast food from McDonald's.");
        Util.printTextColor(Util.boldGreen, "[2] You order chicken rice and a side dish with soup.");
        Util.printTextColor(Util.boldGreen, "[3] You keep studying without eating.");
        System.out.println();

        int choice1 = Input.getUserInputIntWithPrompt("Enter your choice (1-3)", 1, 3);

        Util.clearConsole();
        switch (choice1) {
            case 2:
                player.changeStress(-10);
                break;
            case 1, 3:
                player.changeStress(+5);
                break;
        }

        display();
        player.display();
        Util.printTextColor(Util.boldBlue, "A. You don't have anything to eat so you open a food delivery app to order some food.");
        System.out.println();
        Util.printTextColor(Util.boldGreen, "[1] You order fast food from McDonald's.");
        Util.printTextColor(Util.boldGreen, "[2] You order chicken rice and a side dish with soup.");
        Util.printTextColor(Util.boldGreen, "[3] You keep studying without eating.");
        System.out.println();

        switch (choice1) {
            case 2:
                Util.displayAns("You feel energized with healthy food and ready for another study session.");
                break;
            case 1:
                Util.displayAns("You feel a little bit sluggish but you study anyway.");
                break;
            case 3:
                Util.displayAns("Your stomach is making a lot of noise but you ignore it and keep on studying.");
                break;
        }

        System.out.println();
        Input.Continue();

        // Question 2
        player.display();
        Util.printTextColor(Util.boldBlue, "B. It's time to go to bed. You need to rest for tomorrow. You've given everything you have today. You deserve your rest.");
        System.out.println();
        Util.printTextColor(Util.boldGreen, "[1] You drop everything and just go to bed.");
        Util.printTextColor(Util.boldGreen, "[2] You wash your face and brush your teeth. You meditate for a bit and go to bed.");
        Util.printTextColor(Util.boldGreen, "[3] You pull an all-nighter.");
        System.out.println();

        int choice2 = Input.getUserInputIntWithPrompt("Enter your choice (1-3)", 1, 3);

        Util.clearConsole();
        
        switch (choice2) {
            case 2:
                player.changeStress(-15);
                break;
            case 1:
                player.changeStress(+1);
                break;
            case 3:
                player.changeStress(+20);
                break;
        }

        player.display();
        Util.printTextColor(Util.boldBlue, "B. It's time to go to bed. You need to rest for tomorrow. You've given everything you have today. You deserve your rest.");
        System.out.println();
        Util.printTextColor(Util.boldGreen, "[1] You drop everything and just go to bed.");
        Util.printTextColor(Util.boldGreen, "[2] You wash your face and brush your teeth. You meditate for a bit and go to bed.");
        Util.printTextColor(Util.boldGreen, "[3] You pull an all-nighter.");
        System.out.println();

        switch (choice2) {
            case 2:
                Util.displayAns("You feel refreshed and calm.\nYou get under the blanket and drift off to sleep.");
                break;
            case 1:
                Util.displayAns("You feel a little bit dirty but you still sleep anyway.");
                break;
            case 3:
                Util.displayAns("You feel so stressed that you keep studying until you fall asleep at the table.");
                break;
        }
        System.out.println();
        Input.Continue();
    }
}

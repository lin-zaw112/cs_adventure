public class HangOutScene extends Scene {
    public HangOutScene() {
        super("Hangout Scene","After finishing your drink, your friends come over to you and say, \"Let's go to a nearby karaoke room!\" You agree to join them, and all of you head to the karaoke room together.");
    }

    @Override
    public void display() {
        Util.printTextColor(Util.boldLightBlue, getTitle());
        System.out.println();
        Util.printTextColor(Util.boldLightBlue, getDescription());
        System.out.println();
        Util.printTextColor(Util.boldLightBlue, "=============================== Let's have some fun!! ==============================");
        System.out.println();
    }

    @Override
    public void play(Player player) {
        // * Display the scene's title and description
        display();
        player.display();
        System.out.println();
        Util.displayQ(
                """
                        A. You and your friends decide to go to the karaoke room first. You think it will reduce exam stress. You arrive at the karaoke room with your friends. The disco lights are flashing. The energy in the room is at an all-time high. You will sing first.\s
                        """,
                "[1] You choose a hyperpop song to get the whole room excited.",
                "[2] You choose a heartbreak song. This makes you miss your ex.",
                "[3] You choose a song nobody likes. Your friends stop you from singing. "
        );

        int choice1 = Input.getUserInputIntWithPrompt("Enter your choice (1-3)", 1, 3);
        // * Clear the console and update the player's stress based on their choice
        Util.clearConsole();
        switch (choice1) {
            case 1 :
                player.changeStress(-8);
                break;
            case 2 :
                player.changeStress(+10);
                break;
            case 3 :
                player.changeStress( 5);
                break;
        }

        display();
        player.display();
        System.out.println();
        Util.displayQ(
                """
                        A. You and your friends decide to go to the karaoke room first. You think it will reduce exam stress. You arrive at the karaoke room with your friends. The disco lights are flashing. The energy in the room is at an all-time high. You will sing first.\s
                        """,
                "[1] You choose a hyperpop song to get the whole room excited.",
                "[2] You choose a heartbreak song. This makes you miss your ex.",
                "[3] You choose a song nobody likes. Your friends stop you from singing. "
        );

        switch (choice1) {
            case 1:
                Util.displayAns("You pick an energetic hyperpop song, and your friends immediately join in, dancing and singing along.\nEveryone has an amazing time.\nYour stress decreases by 8.");
                break;
            case 2:
                Util.displayAns("You start singing along to the heartbreaking lyrics, but soon memories of your ex come rushing back.\nYour mood drops, and your stress increases by 10.");
                break;
            case 3:
                Util.displayAns("You confidently start singing, but your friends immediately complain about your song choice and grab the microphone from you.\nEveryone laughs, leaving you embarrassed.\nYour stress increases by 5.");
                break;
        }

        System.out.println();
        Input.Continue();

        player.display();

        Util.displayQ("""
                        B. After singing your hearts out, you guys go to the nearby gaming cafe. It’s time to show your real talent.
                        """,
                "[1] You carry your friends in the game and win every single match. In that moment, it feels like nothing else matters, and your life seems worth living.",
                "[2] You lose every single match because you can’t focus on the games and think about the exam."
                );

        int choice2 = Input.getUserInputIntWithPrompt("Enter your choice (1-2)", 1, 2);

        switch (choice2) {
            case 1 :
                player.changeStress(-5);
                break;
            case 2 :
                player.changeStress(5);
                break;

        }

        player.display();
        Util.displayQ("""
                        B. After singing your hearts out, you guys go to the nearby gaming cafe. It’s time to show your real talent.
                        """,
                "[1] You carry your friends in the game and win every single match. In that moment, it feels like nothing else matters, and your life seems worth living.",
                "[2] You lose every single match because you can’t focus on the games and think about the exam."
        );

        switch (choice2) {
            case 1:
                Util.displayAns("You dominate every match and carry your team to victory.\nYour friends start calling you \"Faker\" and cheering for you.\nYou feel like a gaming legend, and your confidence goes through the roof.\nYour stress decreases by 5.");
                break;
            case 2:
                Util.displayAns("You keep losing match after match because you cannot concentrate.\nYour friends start questioning your gaming skills, and your frustration builds up.\nYour stress increases by 5.");
                break;

        }

        Util.displayAns("After that, you go home.");




    }





}




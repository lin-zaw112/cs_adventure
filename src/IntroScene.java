public class IntroScene extends Scene {

     public IntroScene() {
        super("Welcome to the Adventure Game!",
                "You open your eyes and the first thing that comes to mind\n" +
                        "is tomorrow's final calculus exam.");
    }

    @Override
    public void display() {
        Util.printTextColor(Util.boldLightBlue, getTitle());
        System.out.println();
        Util.printTextColor(Util.boldLightBlue, getDescription());
        System.out.println();
        Util.printTextColor(Util.boldLightBlue, "============================== Let's get ready for the exam! ===============================");
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
                        You see some notifications on your phone. It is your group chat blowing up with messages,
                        asking for notes and panicking about the exam.
                        """,
                "[1] Reply that you will share the notes later.",
                "[2] Ignore it and keep your mind calm.",
                "[3] Start to panic with them and increase your blood pressure."
        );

        int choice1 = Input.getUserInputIntWithPrompt("Enter your choice (1-3)", 1, 3);
        // * Clear the console and update the player's stress based on their choice
        Util.clearConsole();
        switch (choice1) {
            case 1 :
                player.changeStress(-5);
                break;
            case 2 :
                break;
            case 3 :
                player.changeStress( 5);
                break;
        }
        // * Display the player's updated information and the scene's description
        display();
        player.display();
        System.out.println();
        Util.displayQ(
                """
                        You see some notifications on your phone. It is your group chat blowing up with messages,
                        asking for notes and panicking about the exam.
                        """,
                "[1] Reply that you will share the notes later.",
                "[2] Ignore it and keep your mind calm.",
                "[3] Start to panic with them and increase your blood pressure."
        );

        switch (choice1) {
            case 1:
                Util.displayAns("After replying to your classmates, you put your phone aside and head to the bathroom to freshen up.\nYour stress level decreases a little.");
                break;
            case 2:
                Util.displayAns("You decide not to get distracted by the group chat and remain calm about tomorrow's exam.\nYour stress level remains unchanged.");
                break;
            case 3:
                Util.displayAns("Seeing your classmates panic makes you anxious.\nYou begin doubting your preparation and worrying about tomorrow's exam.\nYour stress level increases.");
                break;
        }
        // * Prompt the player to continue to the next scene

        System.out.println();
        Input.Continue();

        //! first question end
        player.display();
        // * Display the scene's title and description
        Util.displayQ("""
                        You are hungry. You look around the kitchen to find something to eat.
                        You find eggs, coffee, and leftover rice from last night.
                        """,
                "[1] You drink coffee on an empty stomach.",
                "[2] You make egg fried rice and coffee.",
                "[3] You eat nothing to save time.");

        int choice2 = Input.getUserInputIntWithPrompt("Enter your choice (1-3)", 1, 3);
        // * Clear the console and update the player's stress based on their choice
        Util.clearConsole();
        switch (choice2) {
            case 2 :
                player.changeStress(-5);
                break;
            case 1 :

               player.changeStress(3);

                break;
            case 3 :
                player.changeStress( 5);
                break;
        }
        // * Display the player's updated information and the scene's description
        player.display();
        // * Display the scene's title and description
        Util.displayQ("""
                        You are hungry. You look around the kitchen to find something to eat.
                        You find eggs, coffee, and leftover rice from last night.
                        """,
                "[1] You drink coffee on an empty stomach.",
                "[2] You make egg fried rice and coffee.",
                "[3] You eat nothing to save time.");

        switch (choice2) {
            case 2:
                Util.displayAns("After finishing your breakfast, you check the time and realize you need to get ready for class.\nSo, you head to your bedroom and open your wardrobe to find something to wear.\nYour stress level decreases.");
                break;
            case 1:
                Util.displayAns("After spending some time dealing with your stomach discomfort, you realize that you are running out of time.\nYou head to your bedroom to get dressed for class.\nYour stress level increases a little.");
                break;
            case 3:
                Util.displayAns("You eat nothing to save time.\nYour stress level increases for sure.");
                break;
        }
        // * Prompt the player to continue to the next scene

        System.out.println();
        Input.Continue();

        //! second Question end

        player.display();
        // * Display the scene's title and description

        Util.displayQ("You are still in your PJs. You open your wardrobe and find some clothes to change into. ",
                "[1] Put on a comfortable T-shirt and a pair of jeans.",
                "[2] Put on whatever you see first.",
                "[3] Spend 10 minutes choosing the best outfit.");

        int choice3 = Input.getUserInputIntWithPrompt("Enter your choice (1-3)", 1, 3);
        // * Clear the console and update the player's stress based on their choice
        Util.clearConsole();
        switch (choice3) {
            case 1 :
                player.changeStress(-1);
                break;
            case 2 :
                break;
            case 3 :
                player.changeStress( 5);
                break;
        }

        // * Display the player's updated information and the scene's description
        player.display();

        Util.displayQ("You are still in your PJs. You open your wardrobe and find some clothes to change into. ",
                "[1] Put on a comfortable T-shirt and a pair of jeans.",
                "[2] Put on whatever you see first.",
                "[3] Spend 10 minutes choosing the best outfit.");
        switch (choice3) {
            case 1:
                Util.displayAns("After getting dressed, you grab your bag and prepare to leave for class.\nBefore stepping outside, you make sure everything is ready.\nYour stress level decreases.");
                break;
            case 2:
                Util.displayAns("After getting dressed and grabbing your bag, you finally head outside and make your way to university.\nYour stress level remains unchanged.");
                break;
            case 3:
                Util.displayAns("You spend too much time choosing the perfect outfit, changing clothes several times until you are finally satisfied.\nUnfortunately, you lose track of time and become late for class.\nAfter finally deciding on your outfit, you rush to grab your belongings and head towards the door.\nYou have no time to waste!\nYour stress level increases by 5.");
                break;
        }
        // * Prompt the player to continue to the next scene

        System.out.println();
        Input.Continue();

        //! third Question end

        player.display();
        // * Display the scene's title and description

        Util.displayQ("You finished preparing everything to go to class.",
                "[1] Take a deep breath and walk calmly outside.",
                "[2] You check your bag three times to make sure you have everything.");

        int choice4 = Input.getUserInputIntWithPrompt("Enter your choice (1-2)", 1, 2);
        // * Clear the console and update the player's stress based on their choice
        Util.clearConsole();
        switch (choice4) {
            case 1 :
                break;
            case 2 :
                player.changeStress(3);
                break;
        }
        // * Display the player's updated information and the scene's description
        player.display();

        Util.displayQ("You finished preparing everything to go to class.",
                "[1] Take a deep breath and walk calmly outside.",
                "[2] You check your bag three times to make sure you have everything.");

        switch (choice4) {
            case 1:
                Util.displayAns("You finally arrive at university and head straight to your Calculus classroom.\nYou see your friends sitting at the back of the class as usual.\nYour stress level remains unchanged.");
                break;
            case 2:
                Util.displayAns("After finally leaving your room, you rush to university, hoping you haven't missed too much of the Calculus lecture.\nYou are still late for class, so your stress level increases.");
                break;

        }
        // * Prompt the player to continue to the next scene

        System.out.println();
        Input.Continue();

    }
}



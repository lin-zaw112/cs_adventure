public class IntroScene extends Scene {

     public IntroScene() {
        super("",
                "");
    }

    @Override
    public void display() {
        Util.printTextColor(Util.boldLightBlue,"""
    ***********************************************************************
        The alarm rings sharply. You open your eyes and the first
        thing that comes in mind is the final calculus exam for tomorrow.
        You get up with dread.
    ***********************************************************************
    """);
    }
    @Override
    public void play(Player player) {
        // * Display the scene's title and description
        display();
        Util.displayQ(
                "You saw some notifications on your phone. It is your class group chat blowing up with stress, asking for notes and losing their minds",
                "1. Reply that you will share the notes later.",
                "2. Ignore it and keep your mind calm.",
                "3. Starts to panic with them and increase your blood pressure."
        );

        int choice1 = Input.getUserInputIntWithPrompt("Enter your choice (1-3): ", 1, 3);
        // * Clear the console and update the player's stress and luck based on their choice
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
        player.display();
        System.out.println();
        display();
        Util.displayQ(
                "You saw some notifications on your phone. It is your class group chat blowing up with stress, asking for notes and losing their minds",
                "1. Reply that you will share the notes later.",
                "2. Ignore it and keep your mind calm.",
                "3. Starts to panic with them and increase your blood pressure."
        );
        switch (choice1) {
            case 1:
                Util.displayAns("After replying to your classmates, you put your phone aside, and head to the bathroom and clean yourself. Your Stress level reduce a little bit.");
                break;
            case 2:
                System.out.println("""
                You decide not to get distracted by the group chat and remain calm about tomorrow's exam.
                Your stress level remains unchanged.
                """);
                break;
            case 3:
                System.out.println("""
                Seeing your classmates panic makes you anxious. You begin doubting your preparation and
                worrying about tomorrow's exam. So Your stress start to Increase.
                """);
                break;
        }
        // * Prompt the player to continue to the next scene

        System.out.println();
        Input.Continue();

        //! first question end

        System.out.println();
        // * Display the scene's title and description

        displayQ("You are hungry. You look around the kitchen to find something to eat. You found eggs, coffee and left over rice from last night.",
                "1. You make egg fried rice and coffee.\n" +
                "2. You drink coffee on an empty stomach\n" +
                "3. You eat nothing to save time.");

        int choice2 = Input.getUserInputIntWithPrompt("Enter your choice (1-3): ", 1, 3);
        // * Clear the console and update the player's stress and luck based on their choice
        Util.clearConsole();
        switch (choice2) {
            case 1 :
                player.changeStress(-5);
                break;
            case 2 :

               player.changeStress(3);

                break;
            case 3 :
                player.changeStress( 5);
                break;
        }
        // * Display the player's updated information and the scene's description
        player.display();
        System.out.println();

      displayQ("You are hungry. You look around the kitchen to find something to eat. You found eggs, coffee and left over rice from last night.",
                "1. You make egg fried rice and coffee.\n" +
                "2. You drink coffee on an empty stomach\n" +
                "3. You eat nothing to save time.");



        switch (choice2) {
            case 1:
                System.out.println("After finishing your breakfast, you check the time and realize you need to get ready for class. So, you head to your bedroom and open your wardrobe to find something to wear.Your Stress level reduces.");
                break;
            case 2:
                System.out.println("After spending some time dealing with your stomach discomfort, you realize that you are running out of time. You head to your bedroom to get dressed for class.Your stress level remains unchanged.Your Stress level increase a little bit.");
                break;
            case 3:
                System.out.println("You eat nothing to save time.Your strss level increases for sure.");
                break;
        }
        // * Prompt the player to continue to the next scene

        System.out.println();
        Input.Continue();

        //! second Question end

        System.out.println();
        // * Display the scene's title and description

        displayQ("You are still in your PJs. You open your wardrobe and find some clothes to change. ",
                "1. Put on a comfortable T-shirt and a pair of jeans.\n" +
                "2. Put on whatever you see first.\n" +
                "3. Spend 10 minutes trying to wear the best outfit.");

        int choice3 = Input.getUserInputIntWithPrompt("Enter your choice (1-3): ", 1, 3);
        // * Clear the console and update the player's stress and luck based on their choice
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
        System.out.println();

        displayQ("You are still in your PJs. You open your wardrobe and find some clothes to change. ",
                "1. Put on a comfortable T-shirt and a pair of jeans.\n" +
                "2. Put on whatever you see first.\n" +
                "3. Spend 10 minutes trying to wear the best outfit.");



        switch (choice3) {
            case 1:
                System.out.println("After getting dressed, you grab your bag and prepare to leave for class. Before stepping outside, you make sure everything is ready.Your Stress level reduces.");
                break;
            case 2:
                System.out.println("After getting dressed and grabbing your bag, you finally head outside and make your way to university.");
                break;
            case 3:
                System.out.println("You spend too much time choosing the perfect outfit,changing clothes several times until you are finally satisfied. Unfortunately, you lose track of time and become late for class.After finally deciding on your outfit,you rush to grab your belongings and head towards the door.You have no time to waste!Your Stress level increses 555.");
                break;
        }
        // * Prompt the player to continue to the next scene

        System.out.println();
        Input.Continue();

        //! third Question end

        System.out.println();
        // * Display the scene's title and description

        displayQ("You finished preparing everything to go to class.",
                "1. Take a deep breath and walk calmly outside.\n" +
                "2. You check your bag three times to check the necessity.\n");

        int choice4 = Input.getUserInputIntWithPrompt("Enter your choice (1-2): ", 1, 2);
        // * Clear the console and update the player's stress and luck based on their choice
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
        System.out.println();

        displayQ("You finished preparing everything to go to class.",
                "1. Take a deep breath and walk calmly outside.\n" +
                "2. You check your bag three times to check the necessity.\n");


        switch (choice4) {
            case 1:
                System.out.println("You finally arrive at university and head straight to your Calculus classroom. You see your friends sitting at the back of the class as usual.So any stress change.");
                break;
            case 2:
                System.out.println("After finally leaving your room, you rush to university, hoping you haven't missed too much of the Calculus lecture. But still you are late for class, so Your stress level increases.");
                break;

        }
        // * Prompt the player to continue to the next scene

        System.out.println();
        Input.Continue();

    }//play method end



    public void displayQ(String title,String Q){

        System.out.println(title);
        System.out.println();
        System.out.println(Q);
        System.out.println();
    }
}



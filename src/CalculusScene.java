public class CalculusScene extends Scene {
    public CalculusScene() {
        super("After finally leaving your room, you rush to university, hoping you haven't missed too much of the Calculus lecture.", "");
    }

    @Override
    public void display() {
        System.out.println(getTitle());
        System.out.println();
    }

    @Override
    public void play(Player player) {
        // * Display the scene's title and description
        display();
        // * 1st question
        System.out.println("You arrived at the class. You saw your friends at the back of the class as usual.  You have two options: ");
        System.out.println();
        System.out.println("[1] Sit in front of the class where you can hear the professor clearly.");
        System.out.println("[2] Sit with your friends and waste time hooting and hollering.");
        System.out.println();
        int choice1 = Input.getUserInputIntWithPrompt("Enter your choice (1-2): ", 1, 2);
        // * Clear the console and update the player's stress and luck based on their choice
        Util.clearConsole();
        switch (choice1) {
            case 1 :
                player.changeStress(-3);
                break;
            case 2 :
                player.changeStress( 4);
                break;
        }
        // * Display the player's updated information and the scene's description
        player.display();
        System.out.println();
        display();
        System.out.println("You arrived at the class. You saw your friends at the back of the class as usual.  You have two options: ");
        System.out.println();
        System.out.println("[1] Sit in front of the class where you can hear the professor clearly.");
        System.out.println("[2] Sit with your friends and waste time hooting and hollering.");
        System.out.println();
        switch (choice1) {
            case 1:
                System.out.println("You sit in the front row, where you can hear the professor clearly and follow the lesson. You can also ask questions whenever you don't understand something. Your stress decreases by 3.");
                break;
            case 2:
                System.out.println("You waste time by hooting, hollering, watching reels and playing games. Since you don't focus on lectures, you missed some important facts on the subject. Therefore, your anxiety increases by 4 because you don't understand today's topic.");
                break;
        }
        // * Prompt the player to continue to the next scene
        System.out.println();
        Input.Continue();
        
        // *2nd question
        if (choice1 == 2) {
            System.out.println("Your friend who is sitting next to you asks you some questions about the class topic. What do you do?");
            System.out.println();
            System.out.println("[1] Ignore him and pretend that you don't hear him.");
            System.out.println("[2] You tell him that you are as lost as him.");
            System.out.println();
            int choice2 = Input.getUserInputIntWithPrompt("Enter your choice (1-2): ", 1, 2);
            // * Clear the console and update the player's stress and luck based on their choice
            Util.clearConsole();
            switch (choice2) {
                case 1 :
                    player.changeStress(0);
                    break;
                case 2 :
                    player.changeStress(5);
                    break;
            }
            // * Display the player's updated information and the scene's description
            player.display();
            System.out.println();
            display();
            System.out.println("Your friend who is sitting next to you asks you some questions about the class topic. What do you do?");
            System.out.println();
            System.out.println("[1] Ignore him and pretend that you don't hear him.");
            System.out.println("[2] You tell him that you are as lost as him.");
            System.out.println();
            switch (choice2) {
                case 1:
                    System.out.println("You pretend not to hear your friend and continue listening to the lecture. Your friend eventually gives up asking you and tries to figure out the questions alone. Your stress level remains unchanged.");
                    break;
                case 2:
                    System.out.println("Since you tell them that you as lost as them, you're starting to worry in your mind about your upcoming exam and get stress. Your stress increases by 5.");
                    break;
            }
        } else {
            System.out.println("Your friend who is sitting next to you asks you some questions about the class topic. What do you do?");
            System.out.println();
            System.out.println("[1] You try your best to explain the calculus concepts step by step. As you explain the questions, you also improve your own understanding of the topic. Your stress decreases by 5.");
            System.out.println("[2] Ignore him and pretend that you don't hear him.");
            System.out.println("[3] You tell him that you are as lost as him.");
            System.out.println();
            int choice2 = Input.getUserInputIntWithPrompt("Enter your choice (1-3): ", 1, 3);
            // * Clear the console and update the player's stress and luck based on their choice
            Util.clearConsole();
            switch (choice2) {
                case 1 :
                    player.changeStress(-5);
                    break;
                case 2 :
                    player.changeStress(0);
                    break;
                case 3 :
                    player.changeStress(5);
                    break;
            }
            // * Display the player's updated information and the scene's description
            player.display();
            System.out.println();
            display();
            System.out.println("Your friend who is sitting next to you asks you some questions about the class topic. What do you do?");
            System.out.println();
            System.out.println("[1] You try your best to explain the calculus concepts step by step. As you explain the questions, you also improve your own understanding of the topic. Your stress decreases by 5.");
            System.out.println("[2] Ignore him and pretend that you don't hear him.");
            System.out.println("[3] You tell him that you are as lost as him.");
            System.out.println();
            switch (choice2) {
                case 1:
                    System.out.println("You try your best to explain the calculus concepts step by step. As you explain the questions, you also improve your own understanding of the topic. Your stress decreases by 5.");
                    break;
                case 2:
                    System.out.println("You pretend not to hear your friend and continue listening to the lecture. Your friend eventually gives up asking you and tries to figure out the questions alone. Your stress level remains unchanged.");
                    break;
                case 3:
                    System.out.println("Since you tell them that you as lost as them, you're starting to worry in your mind about your upcoming exam and get stress. Your stress increases by 5.");
                    break;
            }
        }
        // * Prompt the player to continue to the next scene
        System.out.println();
        Input.Continue();

        // * 3rd question
        System.out.println("Do you take notes during the lecture? How?");
        System.out.println();
        System.out.println("[1] You take neat and clear notes that can help you review later.");
        System.out.println("[2] You take notes but it is not neat and confusing to read.");
        System.out.println("[3] You don't take any notes because you think you are smarter than Issac Newton and Nikola Tesla combined.");
        System.out.println();
        int choice3 = Input.getUserInputIntWithPrompt("Enter your choice (1-3): ", 1, 3);
        // * Clear the console and update the player's stress and luck based on their choice
        Util.clearConsole();
        switch (choice3) {
            case 1 :
                player.changeStress(-5);
                player.setTakeNotes(true);
                break;
            case 2 :
                player.changeStress(1);
                player.setTakeNotes(true);
                break;
            case 3 :
                player.changeStress(5);
                player.setTakeNotes(false);
                break;
        }
        // * Display the player's updated information and the scene's description
        player.display();
        System.out.println();
        display();
        System.out.println("Do you take notes during the lecture? How?");
        System.out.println();
        System.out.println("[1] You take neat and clear notes that can help you review later.");
        System.out.println("[2] You take notes but it is not neat and confusing to read.");
        System.out.println("[3] You don't take any notes because you think you are smarter than Issac Newton and Nikola Tesla combined.");
        System.out.println();
        switch (choice3) {
            case 1:
                System.out.println("You carefully write down important formulas, examples, and explanations from the lecture. Your notes are well-organized and easy to understand, making it easier to review when you get home. Your stress decreases by 5.");
                break;
            case 2:
                System.out.println("You try to write everything down quickly, but your handwriting becomes messy and difficult to understand. When you look back at your notes, even you struggle to read what you wrote. Your stress increases by 1.");
                break;
            case 3:
                System.out.println("You confidently decide that taking notes is unnecessary because you think you are smarter than Issac Newton and Nikola Tesla combined. However, you feel stressed because you don't fully understand some topics. Your stress increases by 5.");
                break;
        }

        // * Prompt the player to continue to the next scene
        System.out.println();
        Input.Continue();

        // *4th question
        System.out.println("The teacher asked a mutiple choice question. You put your hand up and try to answer the question. You guess the answer.");
        System.out.println();
        // * Generate a random number between 1 to 6
        int randomNumber = (int) (Math.random() * 6) + 1;
        // * Clear the console and update the player's stress and luck based on their choice
        Util.clearConsole();
        if (randomNumber > 0 && randomNumber <= 3) {
            player.changeStress(5);
            System.out.println("Unfortunately, your answer is incorrect. The professor corrects you in front of your friends, leaving you embarrassed. Your stress increases by 5.");
        } else if (randomNumber > 3 && randomNumber <= 6) {
            player.changeStress(-8);
            System.out.println("You successfully give the correct answer. The professor acknowledges your effort, and you feel proud of yourself. Your stress level decreases by 8.");
        }
        // * Display the player's updated information and the scene's description
        player.display();
        // * Prompt the player to continue to the next scene
        System.out.println();
        Input.Continue();
    }
}

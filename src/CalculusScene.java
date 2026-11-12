public class CalculusScene extends Scene {
    public CalculusScene() {
        super("You are in the Calculus class", "After finally leaving your room, you rush to university, hoping you haven't missed too much of the Calculus lecture.");
    }

    @Override
    public void display() {
        Util.printTextColor(Util.boldLightBlue, getTitle());
        System.out.println();
        Util.printTextColor(Util.boldLightBlue, getDescription());
        System.out.println();
        Util.printTextColor(Util.boldLightBlue, "=============================== Welcome to the Calculus class ===============================");
        System.out.println();
    }

    @Override
    public void play(Player player) {
        // * Display the scene's title and description
        display();
        // * 1st question
        player.display();
        Util.displayQ(
                """
                        You arrive at class and see your friends at the back, as usual. You have two options:
                        """,
                "[1] Sit in front of the class where you can hear the professor clearly.",
                "[2] Sit with your friends and waste time hooting and hollering."
        );
        int choice1 = Input.getUserInputIntWithPrompt("Enter your choice (1-2)", 1, 2);
        // * Clear the console and update the player's stress based on their choice
        Util.clearConsole();
        switch (choice1) {
            case 1 :
                player.changeStress(-3);
                break;
            case 2 :
                player.changeStress( 4);
                break;
        }
        // * Display the scene's title and description
        display();
        player.display();
        Util.displayQ(
                """
                        You arrive at class and see your friends at the back, as usual. You have two options:
                        """,
                "[1] Sit in front of the class where you can hear the professor clearly.",
                "[2] Sit with your friends and waste time hooting and hollering."
                );
        switch (choice1) {
            case 1:
                Util.displayAns("You sit in the front row, where you can hear the professor clearly and follow the lesson.\nYou can also ask questions whenever you don't understand something.\nYour stress decreases by 3.");
                break;
            case 2:
                Util.displayAns("You waste time by hooting, hollering, watching reels and playing games.\nSince you don't focus on lectures, you miss some important facts on the subject.\nTherefore, your anxiety increases by 4 because you don't understand today's topic.");
                break;
        }

        // * Prompt the player to continue to the next scene
        System.out.println();
        Input.Continue();

        //! 1st question ends

        // *2nd question
        if (choice1 == 2) {
            // * Display the scene's title and description
            display();
            player.display();
            Util.displayQ(
                    """
                            Your friend who is sitting next to you asks you some questions about the class topic. What do you do?
                            """,
                    "[1] Ignore him and pretend that you don't hear him.",
                    "[2] You tell him that you are just as lost as he is."
                    );

            int choice2 = Input.getUserInputIntWithPrompt("Enter your choice (1-2)", 1, 2);
            // * Clear the console and update the player's stress based on their choice
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
            display();
            player.display();
            Util.displayQ(
                    """
                            Your friend who is sitting next to you asks you some questions about the class topic. What do you do?
                            """,
                    "[1] Ignore him and pretend that you don't hear him.",
                    "[2] You tell him that you are just as lost as he is."
            );
            switch (choice2) {
                case 1:
                    Util.displayAns("You pretend not to hear your friend and continue listening to the lecture.\nYour friend eventually gives up asking you and tries to figure out the questions alone.\nYour stress level remains unchanged.");
                    break;
                case 2:
                    Util.displayAns("Admitting that you are just as lost makes you worry about the upcoming exam.\nYour stress increases by 5.");
                    break;
            }
        } else {
            display();
            player.display();
            Util.displayQ(
                    """
                            Your friend who is sitting next to you asks you some questions about the class topic. What do you do?
                            """,
                    "[1] You explain the answers, becoming more familiar with the topic in the process.",
                    "[2] Ignore him and pretend that you don't hear him.",
                    "[3] You tell him that you are just as lost as he is."
            );
            int choice2 = Input.getUserInputIntWithPrompt("Enter your choice (1-3)", 1, 3);
            // * Clear the console and update the player's stress based on their choice
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
            display();
            player.display();
            Util.displayQ(
                    """
                            Your friend who is sitting next to you asks you some questions about the class topic. What do you do?
                            """,
                    "[1] You explain the answers, becoming more familiar with the topic in the process.",
                    "[2] Ignore him and pretend that you don't hear him.",
                    "[3] You tell him that you are just as lost as he is."
            );
            switch (choice2) {
                case 1:
                    Util.displayAns("You try your best to explain the calculus concepts step by step.\nAs you explain the questions, you also improve your own understanding of the topic.\nYour stress decreases by 5.");
                    break;
                case 2:
                    Util.displayAns("You pretend not to hear your friend and continue listening to the lecture.\nYour friend eventually gives up asking you and tries to figure out the questions alone.\nYour stress level remains unchanged.");
                    break;
                case 3:
                    Util.displayAns("Admitting that you are just as lost makes you worry about the upcoming exam.\nYour stress increases by 5.");
                    break;
            }
        }

        // * Prompt the player to continue to the next scene
        System.out.println();
        Input.Continue();

        //! 2nd question ends

        // * 3rd question
        display();
        player.display();
        Util.displayQ(
                """
                        Do you take notes during the lecture? How?
                        """,
                "[1] You take notes, but they are messy and confusing to read.",
                "[2] You take neat and clear notes that can help you review later.",
                "[3] You don't take any notes because you think you are smarter than Isaac Newton and Nikola Tesla combined."
        );

        int choice3 = Input.getUserInputIntWithPrompt("Enter your choice (1-3)", 1, 3);
        // * Clear the console and update the player's stress based on their choice
        Util.clearConsole();
        switch (choice3) {
            case 2 :
                player.changeStress(-5);
                player.setTakeNotes(true);
                break;
            case 1 :
                player.changeStress(1);
                player.setTakeNotes(true);
                break;
            case 3 :
                player.changeStress(5);
                player.setTakeNotes(false);
                break;
        }
        // * Display the player's updated information and the scene's description
        display();
        player.display();
        Util.displayQ(
                """
                        Do you take notes during the lecture? How?
                        """,
                "[1] You take notes, but they are messy and confusing to read.",
                "[2] You take neat and clear notes that can help you review later.",
                "[3] You don't take any notes because you think you are smarter than Isaac Newton and Nikola Tesla combined."
        );
        switch (choice3) {
            case 2:
                Util.displayAns("You carefully write down important formulas, examples, and explanations from the lecture.\nYour notes are well-organized and easy to understand, making it easier to review when you get home.\nYour stress decreases by 5.");
                break;
            case 1:
                Util.displayAns("You try to write everything down quickly, but your handwriting becomes messy and difficult to understand.\nWhen you look back at your notes, even you struggle to read what you wrote.\nYour stress increases by 1.");
                break;
            case 3:
                Util.displayAns("You confidently decide that taking notes is unnecessary because you think you are smarter than Isaac Newton and Nikola Tesla combined.\nHowever, you feel stressed because you don't fully understand some topics.\nYour stress increases by 5.");
                break;
        }

        // * Prompt the player to continue to the next scene
        System.out.println();
        Input.Continue();

        //! 3rd question ends

        // *4th question
        player.display();
        Util.displayQ(
                """
                        The teacher asks a multiple-choice question. You put your hand up and try to answer the question. You guess the answer.
                        """);
        // * Generate a random number between 1 to 6
        int randomNumber = Util.getRandomNumber(1, 6);
        // * Clear the console and update the player's stress based on their choice
        Util.clearConsole();
        if (randomNumber > 0 && randomNumber <= 3) {
            player.changeStress(5);
            player.display();
            Util.displayQ(
                    """
                            The teacher asks a multiple-choice question. You put your hand up and try to answer the question. You guess the answer.
                            """);
            Util.displayAns("Unfortunately, your answer is incorrect.\nThe professor corrects you in front of your friends, leaving you embarrassed.\nYour stress increases by 5.");
        } else if (randomNumber > 3 && randomNumber <= 6) {
            player.changeStress(-8);
            player.display();
            Util.displayQ(
                    """
                            The teacher asks a multiple-choice question. You put your hand up and try to answer the question. You guess the answer.
                            """);
            Util.displayAns("You successfully give the correct answer.\nThe professor acknowledges your effort, and you feel proud of yourself.\nYour stress level decreases by 8.");
        }

        // * Prompt the player to continue to the next scene
        System.out.println();
        Input.Continue();

        //! 4th question ends
        //! calculus scene ends
    }
}

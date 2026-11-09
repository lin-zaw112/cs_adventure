

public class StudyScene extends Scene{
    public StudyScene() {
        super("After having Lunch, You choose to study.", "");
    }

    @Override
    public void display() {
        System.out.println(getTitle());
        System.out.println();
    
    }

    @Override
    public void play(Player player) {
      //question1
        System.out.println();
        // * Display the scene's title and description
        display();
        System.out.println("A. You plan to review and study for the exam. You think about some places to study.");
        System.out.println();
        System.out.println("[1] You choose the library.");
        System.out.println("[2] You choose to go home.");
        System.out.println();
        int choice1 = Input.getUserInputIntWithPrompt("Enter your choice (1-2): ", 1, 2);

        // * Clear the console and update the player's stress and luck based on their choice
        Util.clearConsole();
        
        switch (choice1) {
            case 1 :
                player.changeStress(0);
                break;
            case 2 :
                player.changeStress(0);
                break;
        }


        player.display();
        
        System.out.println();
        display();
        System.out.println("A. You plan to review and study for the exam. You think about some places to study.");
        System.out.println();
        System.out.println("[1] You choose the library.");
        System.out.println("[2] You choose to go home.");
        System.out.println();
        switch (choice1) {
            case 1:
                System.out.println("You choose to study at the library. You feel focused and productive.");
                break;
            case 2:
                System.out.println("You choose to study at home. You feel comfortable but easily distracted.");
                break;
        }

        System.out.println();
        Input.Continue();
        //question2
        //will need a takenotes booelan from calculus Scene
        boolean takeNotes = false; // This should be set based on the player's previous actions in the game. delete this after the calculus scene is implemented
        if(takeNotes == true){
        System.out.println();
        // * Display the scene's title and description
        display();
        System.out.println("B. You take out books and laptop from your bag. You need to lock in and review your notes.");
        System.out.println();
        System.out.println("[1] You start practicing questions and only look at the notes when necessary");
        System.out.println("[2] You look at the notes from page one to the end. ");
        System.out.println();
        int choice2 = Input.getUserInputIntWithPrompt("Enter your choice (1-2): ", 1, 2);

        // * Clear the console and update the player's stress and luck based on their choice
        Util.clearConsole();
        switch (choice2) {
            case 1 :
                player.changeStress(-5);
                break;
            case 2 :
                player.changeStress(5);
                break;
        }


        player.display();
        System.out.println();
        display();
        System.out.println("B. You take out books and laptop from your bag. You need to lock in and review your notes.");
        System.out.println();
        System.out.println("[1] You start practicing questions and only look at the notes when necessary");
        System.out.println("[2] You look at the notes from page one to the end. ");
        System.out.println();
        switch (choice2) {
            case 1:
                System.out.println("You start practicing questions and only look at the notes when necessary. You feel confident and prepared for the exam.");
                break;
            case 2:
                System.out.println("You look at the notes from page one to the end. You feel overwhelmed and stressed out.");
                break;
        }

        System.out.println();
        Input.Continue();
        }else{
        System.out.println();
        // * Display the scene's title and description
        display();
        System.out.println("C. You found out you did not take any notes and realized that you are cooked.  ");
        System.out.println();
        System.out.println("[1] Try to calm down and search for related topics on the internet and study.");
        System.out.println("[2] Start panicking and run around the place frantically. ");
        System.out.println("[3] You just accept your fate. ");
        System.out.println();
        int choice2 = Input.getUserInputIntWithPrompt("Enter your choice (1-3): ", 1, 3);

        // * Clear the console and update the player's stress and luck based on their choice
        Util.clearConsole();
        switch (choice2) {
            case 1 :
                player.changeStress(-5);
                break;
            case 2 :
                player.changeStress(10);
                break;
            case 3 :
                player.changeStress(-10);
                break;
        }


        player.display();
        System.out.println();
        display();
        System.out.println("C. You found out you did not take any notes and realized that you are cooked.  ");
        System.out.println();
        System.out.println("[1] Try to calm down and search for related topics on the internet and study.");
        System.out.println("[2] Start panicking and run around the place frantically. ");
        System.out.println("[3] You just accept your fate. ");
        System.out.println();

        switch (choice2) {
            case 1:
                System.out.println("You start practicing questions and only look at the notes when necessary. You feel confident and prepared for the exam.");
                break;
            case 2:
                System.out.println("You look at the notes from page one to the end. You feel overwhelmed and stressed out.");
                break;
        }

        System.out.println();
        Input.Continue();
        }
    

      //question3

    System.out.println();
        // * Display the scene's title and description
        display();
        System.out.println("C. You hve been studying for hours without moving. You feel tired and your eyes are sore. You need to take a break.");
        System.out.println();
        System.out.println("[1] You try to move around and stretch every hour.");
        System.out.println("[2] You keep studying without moving. ");
        System.out.println();

        int choice3 = Input.getUserInputIntWithPrompt("Enter your choice (1-2): ", 1, 2);

        // * Clear the console and update the player's stress and luck based on their choice
        Util.clearConsole();
        switch (choice3) {
            case 1 :
                player.changeStress(-5);
                break;
            case 2 :
                player.changeStress(5);
                break;
        }


        player.display();
        System.out.println();
        display();

        System.out.println("C. You hve been studying for hours without moving. You feel tired and your eyes are sore. You need to take a break.");
        System.out.println();
        System.out.println("[1] You try to move around and stretch every hour.");
        System.out.println("[2] You keep studying without moving. ");
        System.out.println();

        switch (choice3) {
            case 1:
                System.out.println("You try to move around and stretch every hour. You feel refreshed and focused.");
                break;
            case 2:
                System.out.println("You keep studying without moving. You feel tired and your eyes are sore. You start to feel stressed out.");
                break;
        }

        System.out.println();
        Input.Continue();        
    }  
}
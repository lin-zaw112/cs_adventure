public class StudyScene extends Scene {
    public StudyScene() {
        super("After lunch, you choose to study.", "");
    }
    @Override
    public void display() {
        Util.printTextColor(Util.boldLightBlue, getTitle());
        System.out.println();
    
    }
    @Override
    public void play(Player player) {
      //question1
        // * Display the scene's title and description
        display();
        player.display();
        Util.printTextColor(Util.boldBlue, "A. You plan to review and study for the exam. You think about some places to study.");
        System.out.println();
        Util.printTextColor(Util.boldGreen, "[1] You choose the library.");
        Util.printTextColor(Util.boldGreen, "[2] You choose to go home.");
        System.out.println();
        int choice1 = Input.getUserInputIntWithPrompt("Enter your choice (1-2)", 1, 2);
        // * Clear the console and update the player's stress based on their choice
        Util.clearConsole();
        display();
        player.display();
        System.out.println();
        Util.printTextColor(Util.boldBlue, "A. You plan to review and study for the exam. You think about some places to study.");
        System.out.println();
        Util.printTextColor(Util.boldGreen, "[1] You choose the library.");
        Util.printTextColor(Util.boldGreen, "[2] You choose to go home.");
        System.out.println();
        switch (choice1) {
            case 1:
                Util.displayAns("You choose to study at the library.\nYou feel focused and productive.");
                break;
            case 2:
                Util.displayAns("You choose to study at home.\nYou feel comfortable but easily distracted.");
                break;
        }
        System.out.println();
        Input.Continue();
        //question2
        //Use the notes flag from the Calculus scene
        if(player.getTakeNotes()){
          System.out.println();
        // * Display the scene's title and description
        display();
        player.display();
        Util.printTextColor(Util.boldBlue, "B. You take out your books and laptop from your bag. You need to lock in and review your notes.");
        System.out.println();
        Util.printTextColor(Util.boldGreen, "[1] You look at the notes from page one to the end. ");
        Util.printTextColor(Util.boldGreen, "[2] You start practicing questions and only look at the notes when necessary.");
        System.out.println();
        int choice2 = Input.getUserInputIntWithPrompt("Enter your choice (1-2)", 1, 2);

        // * Clear the console and update the player's stress based on their choice
        Util.clearConsole();
        switch (choice2) {
            case 2 :
                player.changeStress(-5);
                break;
            case 1 :
                player.changeStress(5);
                break;
        }
        display();
        player.display();
        System.out.println();
        Util.printTextColor(Util.boldBlue, "B. You take out your books and laptop from your bag. You need to lock in and review your notes.");
        System.out.println();
        Util.printTextColor(Util.boldGreen, "[1] You look at the notes from page one to the end. ");
        Util.printTextColor(Util.boldGreen, "[2] You start practicing questions and only look at the notes when necessary.");
        System.out.println();
        switch (choice2) {
            case 2:
                Util.displayAns("You start practicing questions and only look at the notes when necessary.\nYou feel confident and prepared for the exam.");
                break;
            case 1:
                Util.displayAns("You look at the notes from page one to the end.\nYou feel overwhelmed and stressed out.");
                break;
        }

        System.out.println();
        Input.Continue();
        }else{
        System.out.println();
        // * Display the scene's title and description
        display();
        player.display();
        Util.printTextColor(Util.boldBlue, "C. You realize that you did not take any notes and that you are in trouble.");
        System.out.println();
        Util.printTextColor(Util.boldGreen, "[1] Try to calm down and search for related topics on the internet and study.");
        Util.printTextColor(Util.boldGreen, "[2] Start panicking and run around the place frantically. ");
        Util.printTextColor(Util.boldGreen, "[3] You just accept your fate. ");
        System.out.println();
        int choice2 = Input.getUserInputIntWithPrompt("Enter your choice (1-3)", 1, 3);
        // * Clear the console and update the player's stress based on their choice
        Util.clearConsole();
        switch (choice2) {
            case 1 :
                player.changeStress(-5);
                break;
            case 2 :
                player.changeStress(10);
                break;
            case 3 :
                player.changeStress(0);
                break;
        }
        display();
        player.display();
        System.out.println();
        Util.printTextColor(Util.boldBlue, "C. You realize that you did not take any notes and that you are in trouble.");
        System.out.println();
        Util.printTextColor(Util.boldGreen, "[1] Try to calm down and search for related topics on the internet and study.");
        Util.printTextColor(Util.boldGreen, "[2] Start panicking and run around the place frantically. ");
        Util.printTextColor(Util.boldGreen, "[3] You just accept your fate. ");
        System.out.println();
        switch (choice2) {
            case 1:
                Util.displayAns("You search for the topics online and practice related questions.\nYou begin to feel more prepared.\nYour stress decreases by 5.");
                break;
            case 2:
                Util.displayAns("You panic and run around instead of studying.\nYour stress increases by 10.");
                break;
            case 3:
                Util.displayAns("You accept your situation and stop trying to study.\nYour stress level remains unchanged.");
                break;
        }
        System.out.println();
        Input.Continue();
        }
    //question3
    System.out.println();
        // * Display the scene's title and description
        display();
        player.display();
        Util.printTextColor(Util.boldBlue, "C. You have been studying for hours without moving. You feel tired and your eyes are sore. You need to take a break.");
        System.out.println();
        Util.printTextColor(Util.boldGreen, "[1] You try to move around and stretch every hour.");
        Util.printTextColor(Util.boldGreen, "[2] You keep studying without moving. ");
        System.out.println();
        int choice3 = Input.getUserInputIntWithPrompt("Enter your choice (1-2)", 1, 2);
        // * Clear the console and update the player's stress based on their choice
        Util.clearConsole();
        switch (choice3) {
            case 1 :
                player.changeStress(-5);
                break;
            case 2 :
                player.changeStress(5);
                break;
        }
        display();
        player.display();
        System.out.println();
        Util.printTextColor(Util.boldBlue, "C. You have been studying for hours without moving. You feel tired and your eyes are sore. You need to take a break.");
        System.out.println();
        Util.printTextColor(Util.boldGreen, "[1] You try to move around and stretch every hour.");
        Util.printTextColor(Util.boldGreen, "[2] You keep studying without moving. ");
        System.out.println();
        switch (choice3) {
            case 1:
                Util.displayAns("You try to move around and stretch every hour.\nYou feel refreshed and focused.");
                break;
            case 2:
                Util.displayAns("You keep studying without moving.\nYou feel tired and your eyes are sore.\nYou start to feel stressed out.");
                break;
        }
        System.out.println();
        Input.Continue();        
    }  
}

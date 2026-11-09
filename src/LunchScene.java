public class LunchScene extends Scene{
    public LunchScene(){
        super( "You and your friends arrive at the school canteen which is filled with studnets. You are really tired from the class, and you need to refuel yourself","");
    }

    @Override
    public void display() {
        System.out.println(getTitle());
        System.out.println();
       
    }

    @Override
    public void play(Player player) {
        System.out.println();

        display();
        // First Question 
        System.out.println("A. You look around and find something to eat. There is so much varitey of food, but you need to choose carefully. Wrong choice and you won't be able to focus on studying. ");
        System.out.println();
        System.out.println("[1] You choose a warm and filling food that has vegetables, crabs, and protein.");
        System.out.println("[2] You choose a buger set that contains coke, fries, and burgers.");
        System.out.println("[3] You eat nothing and keep cramming while your friends are having lunch.");
        System.out.println();
        // Ask user for input 
        int choice = Input.getUserInputIntWithPrompt("Enter your choice (1-3): ", 1, 3);
        // * Clear the console and update the player's stress and luck based on their choice
        Util.clearConsole();
        switch (choice) {
            case 1 :
                player.changeStress(-3);
                break;
            case 2 :
                player.changeStress(3);
                break;
            case 3 :
                player.changeStress( 5);
                break;
        }

        player.display();
        System.out.println();
        display();
         System.out.println("A. You look around and find something to eat. There is so much varitey of food, but you need to choose carefully. Wrong choice and you won't be able to focus on studying. ");
        System.out.println();
        System.out.println("[1] You choose a warm and filling food that has vegetables, crabs, and protein.");
        System.out.println("[2] You choose a buger set that contains coke, fries, and burgers.");
        System.out.println("[3] You eat nothing and keep cramming while your friends are having lunch.");
        System.out.println();

        switch(choice){
            case 1:
            System.out.println("This is a balanced, nutritious meal. The combination of protein, vegetables, and wholesome ingredients gives your brain steady energy without causing a sugar crash or sluggishness, allowing you to focus effectively on your studying. Your stress level reduce.");
            break;

            case 2:
            System.out.println("Fast food high in refined carbs, sugar, and saturated fats can lead to a post-meal energy crash and grogginess. You will likely feel too sluggish or bloated to concentrate properly on your studying. Your stress level increase.");
            break;

            case 3:
            System.out.println("Skipping a meal entirely leaves your brain starved of necessary fuel and glucose. While you might save time initially, hunger and mental fatigue will soon set in, making it very difficult to retain information or focus on your studying. Your stress level reduce");
            break;
        }
        System.out.println();
        Input.Continue();

        // Question 1 end
        player.display();
        System.out.println();
        System.out.println(" B. You look around to sit. Since it is afternoon, there is no doubt that the canteen is loud and crowded. Fortunately, you found a table near a building beside the canteen. Free from all the noise.");
        System.out.println();
        System.out.println("[1] You go to that table. Quietness helps calm your mind.");
        System.out.println("[2] You sit with your freinds in the loud canteen.");
        System.out.println();
        int choice2 = Input.getUserInputIntWithPrompt("Enter your choice (1-2): ", 1, 2);
        // * Clear the console and update the player's stress and luck based on their choice
        Util.clearConsole();
        switch (choice2) {
            case 1 :
                player.changeStress(-3);
                break;
            case 2 :
                player.changeStress(3);
                break;
        }
        
         player.display();
        System.out.println();
        
        System.out.println(" B. You look around to sit. Since it is afternoon, there is no doubt that the canteen is loud and crowded. Fortunately, you found a table near a building beside the canteen. Free from all the noise.");
        System.out.println();
        System.out.println("[1] You go to that table. Quietness helps calm your mind.");
        System.out.println("[2] You sit with your freinds in the loud canteen.");
        System.out.println();
        
        switch (choice2) {
            case 1:
            System.out.println("Choosing the quiet, noise-free spot beside the building helps calm your mind and lowers your stress levels. Your stress level reduce.");
            break;

            case 2:
            System.out.println("Sitting in the crowded, noisy canteen increases your stress level due to the overwhelming noise environment. Your stress level increase.");
            break;
        }

        System.out.println();
        Input.Continue();
        player.display();
        System.out.println();
        System.out.println("C. Your friend comes up to you and invites you to hang out in the evening. They will go to a karaoke room and watch a movie.  (Really? The exam is tomorrow and you want to hang out? You need new friends gng).");
        System.out.println();
        System.out.println("[1] You refuse politely and prioritize your studies.");
        System.out.println("[2] You refuse rudely and tell them that they should study instead of messing around.");
        System.out.println("[3] You said \"Hell yeah\" and agreed to hang out with them.");
        System.out.println();
        int choice3 = Input.getUserInputIntWithPrompt("Enter your choice (1-3): ", 1, 3);
        // * Clear the console and update the player's stress and luck based on their choice
        Util.clearConsole();
        switch (choice3) {
            case 1 :
                player.changeStress(-4);
                break;
            case 2 :
                player.changeStress(3);
                break;
            case 3 :
                player.changeStress( 5);
                break;
        }

        player.display();
        System.out.println();
        System.out.println("C. Your friend comes up to you and invites you to hang out in the evening. They will go to a karaoke room and watch a movie.  (Really? The exam is tomorrow and you want to hang out? You need new friends gng).");
        System.out.println();
        System.out.println("[1] You refuse politely and prioritize your studies.");
        System.out.println("[2] You refuse rudely and tell them that they should study instead of messing around.");
        System.out.println("[3] You said \"Hell yeah\" and agreed to hang out with them.");
        System.out.println();
        switch(choice3){
            case 1:
            System.out.println("Politely declining your friend's offer allows you to focus peacefully on preparing for tomorrow's exam without drama, reducing your overall stress. Your stress level reduce.");
            break;

            case 2:
            System.out.println("Reacting with hostility causes tension between you and your friend, creating unnecessary conflict right before your exam and increasing your stress. Your stress level increase.");
            break;

            case 3:
            System.out.println("Choosing to go out to karaoke and watch a movie when an exam is tomorrow causes significant stress, knowing you are avoiding study time. Your stress level increase.");
            break;
        }
        System.out.println();
        Input.Continue();
        player.display();
         System.out.println();
        System.out.println("D. While you're sitting there, you feel thirsty. Your water bottle is empty. You look around and see a water station and a coffee vending machine.");
        System.out.println();
        System.out.println("[1] You fill your water bottle up and drink it.");
        System.out.println("[2] You order double expresso Americano.");
        System.out.println();
        int choice4 = Input.getUserInputIntWithPrompt("Enter your choice (1-2): ", 1, 2);
        // * Clear the console and update the player's stress and luck based on their choice
        Util.clearConsole();
        switch (choice3) {
            case 1 :
                player.changeStress(3);
                break;
            case 2 :
                player.changeStress(-5);
                break;
        }

        player.display();
        System.out.println();
        System.out.println("D. While you're sitting there, you feel thirsty. Your water bottle is empty. You look around and see a water station and a coffee vending machine.");
        System.out.println();
        System.out.println("[1] You fill your water bottle up and drink it.");
        System.out.println("[2] You order double expresso Americano.");
        System.out.println();
        switch(choice4){
            case 1:
            System.out.println("Refreshed and properly hydrated, your body gets the clean, natural fuel it needs to stay sharp and maintain balanced, steady focus throughout your study session. Your stress level reduce.");
            break;

            case 2:
            System.out.println("Instead of helping, the strong espresso overstimulates your nervous system, leaving you feeling frantic, restless, and significantly more stressed about your upcoming exam. Your stress increase.");
            break;
        }
        System.out.println();
        Input.Continue();
}
}
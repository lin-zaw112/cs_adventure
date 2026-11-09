import java.util.Scanner;
public class Input {
    private static final Scanner cc = new Scanner(System.in);

    public static void Continue() {
        System.out.println("Press Enter to continue...");
        cc.nextLine();
        // above line is to consume the newline character left in the input buffer
        cc.nextLine();
        util.clearConsole();
    }

    public static String getUserInputStringWithPrompt(String prompt) {
        System.out.print(prompt + ": ");
        while (!cc.hasNextLine()) {
            System.out.println("Invalid input. Please enter a valid input");
            cc.next();
            System.out.print(prompt + ": ");
        }
        return cc.nextLine();
    }

    public static int getInputIntWithPrompt(String prompt) {
        System.out.print(prompt + ": ");
        while (!cc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid input");
            cc.next();
            System.out.print(prompt + ": ");
        }
        return cc.nextInt();
    }

    public static int getUserInputIntWithPrompt(String prompt, int min, int max) {
        int input = Input.getInputIntWithPrompt(prompt);

        while (input < min || input > max) {
            System.out.println("Invalid input. Please enter a valid input");
            input = getInputIntWithPrompt(prompt);
        }
        return input;
    }

}

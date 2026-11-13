import java.util.Scanner;
public class Input {
    private static final Scanner cc = new Scanner(System.in);



    public static void Continue() {
        System.out.println("Press Enter to continue...");
        readLine();
        Util.clearConsole();
    }

    private static String readLine() {
        if (!cc.hasNextLine()) {
           System.out.println("No input available. Please provide input.");
        }
        return cc.nextLine();
    }

    public static String getUserInputStringWithPrompt(String prompt) {
        System.out.print(prompt + ": ");
        return readLine();
    }

    public static int getInputIntWithPrompt(String prompt) {
        System.out.print(prompt + ": ");
        while (true) {
            String line = readLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a whole number.");
                System.out.print(prompt + ": ");
            }
        }
    }

    public static int getUserInputIntWithPrompt(String prompt, int min, int max) {
        int input = Input.getInputIntWithPrompt(prompt);

        while (input < min || input > max) {
            System.out.println("Invalid input. Please enter a number from " + min + " to " + max + ".");
            input = getInputIntWithPrompt(prompt);
        }
        return input;
    }
}

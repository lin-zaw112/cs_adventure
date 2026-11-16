import java.util.Scanner;
public class Input {
    private static final Scanner cc = new Scanner(System.in);
    private static final StringBuilder pendingInput = new StringBuilder();
    private static boolean inputClosed;

    static {
        // One thread reads cc; prompts and animations consume complete lines.
        Thread reader = new Thread(() -> {
            try {
                while (cc.hasNextLine()) {
                    String line = cc.nextLine();
                    synchronized (pendingInput) {
                        pendingInput.append(line).append('\n');
                        pendingInput.notifyAll();
                    }
                }
            } finally {
                synchronized (pendingInput) {
                    inputClosed = true;
                    pendingInput.notifyAll();
                }
            }
        }, "game-input");
        reader.setDaemon(true);
        reader.start();
    }

    // Caller must hold the pendingInput lock.
    private static String removeLine() {
        int end = pendingInput.indexOf("\n");
        String line = pendingInput.substring(0, end);
        pendingInput.delete(0, end + 1);
        return line;
    }

    public static boolean consumeAnimationSkip() {
        synchronized (pendingInput) {
            if (pendingInput.isEmpty()) return false;
            removeLine();
            return true;
        }
    }

    public static void Continue() {
        System.out.print("Press Enter to continue...");
        readLine();
        Util.clearConsole();
    }

    private static String readLine() {
        synchronized (pendingInput) {
            try {
                while (pendingInput.isEmpty()) {
                    if (inputClosed) throw new IllegalStateException("Input is closed.");
                    pendingInput.wait();
                }
                return removeLine();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Input interrupted.", e);
            }
        }
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

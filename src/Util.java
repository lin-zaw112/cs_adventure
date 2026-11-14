public class Util {

    // Text Color

    public static final String resetColor="\u001B[0m";
    // ? Blue and Light Blue are Primary Colors of the School of Information Technology (SIT) at KMUTT
    //  https://www.sit.kmutt.ac.th/en/organizationalidentity/
    public static final String blue="\u001B[38;2;51;102;153m";

    public static final String green="\u001B[32m";
    public static final String shinyYellow="\u001B[93m";


    // Bold color

    public static final String boldRed="\u001B[1;31m";
    // ? Bold Blue and Bold Light Blue are Primary Colors of the School of Information Technology (SIT) at KMUTT
    //  https://www.sit.kmutt.ac.th/en/organizationalidentity/
    public static final String boldBlue="\u001B[1;38;2;51;102;153m";
    public static final String boldLightBlue="\u001B[1;38;2;94;153;204m";
    public static final String boldGreen="\u001B[1;32m";


    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void clearConsole() {
        // ? \033[H — Moves the cursor to the top-left corner.
        // ? \033[2J — Clears the terminal screen.
        // ? \033[3J requests clearing the scrollback buffer on supported terminals.
        System.out.print("\033[H\033[2J\033[3J");
    }

    /*Format to use 
        Util.printTextColor( Util.red ,"hello world"); */

    public static void printTextColor(String color, String text){
        System.out.println(color + text + resetColor);
    }

    public static String formatTitle(String title) {
        String label = " " + title.strip() + " ";
        int padding = Math.max(0, 80 - label.length());
        int left = padding / 2;
        return "=".repeat(left) + label + "=".repeat(padding - left);
    }

    public static void displayQ(String question, String... options){
        printTextColor(Util.boldBlue, question.strip());
        if (options.length > 0) {
            System.out.println();
            for (String option : options) {
                printTextColor(Util.boldGreen, option.strip());
            }
        }
        System.out.println();
    }

    public static void displayAns(String answer) {
        Util.printTextColor(Util.shinyYellow, answer);
    }
}

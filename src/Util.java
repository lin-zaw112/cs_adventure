public class Util {

    // Text Color

    public static final String resetColor="\u001B[0m";
    public static final String red="\u001B[31m";
    // ? Blue and Light Blue are Primary Colors of the School of Information Technology (SIT) at KMUTT
    //  https://www.sit.kmutt.ac.th/en/organizationalidentity/
    public static final String blue="\u001B[38;2;51;102;153m";
    public static final String lightBlue="\u001B[38;2;94;153;204m";

    public static final String green="\u001B[32m";
    public static final String shinyYellow="\u001B[93m";

    //toDo ** Format -> (Util.red +"...."+ resetColor)

    // Bold color

    public static final String resetBold="\u001B[0m";
    public static final String bold="\u001B[1m";
    public static final String boldRed="\u001B[1;31m";
    // ? Bold Blue and Bold Light Blue are Primary Colors of the School of Information Technology (SIT) at KMUTT
    //  https://www.sit.kmutt.ac.th/en/organizationalidentity/
    public static final String boldBlue="\u001B[1;38;2;51;102;153m";
    public static final String boldLightBlue="\u001B[1;38;2;94;153;204m";
    public static final String boldGreen="\u001B[1;32m";
    public static final String boldShinyYellow="\u001B[1;93m";


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

    public static void displayQ(String Question, String... options){
        System.out.println();
        printTextColor(Util.boldBlue,Question);
        System.out.println();
        for (String option : options) {
            printTextColor(Util.boldGreen,option);
        }
        System.out.println();
    }

    public static void displayAns(String answer) {
        for (int i = 0; i < answer.length(); i++) {
            System.out.print(Util.shinyYellow + answer.charAt(i) + "\u001B[0m");
            System.out.flush();
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
              System.out.println("Error: " + e.getMessage());
            }
        }
        System.out.println();
    }
}

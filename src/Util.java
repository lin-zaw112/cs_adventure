public class Util {

    // Text Color

    public static final String resetColor="\u001B[0m";
    public static final String red="\u001B[31m";
    public static final String blue="\u001B[38;2;51;102;153m";
    public static final String green="\u001B[32m";

    //toDo ** Format -> (Util.red +"...."+ resetColor)

    // Bold color

    public static final String resetBold="\u001B[0m";
    public static final String bold="\u001B[1m";
    public static final String boldRed="\u001B[1;31m";
    public static final String boldBlue="\u001B[1;38;2;51;102;153m";
    public static final String boldGreen="\u001B[1;32m";


    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void clearConsole() {
        // ? \033[H — Moves the cursor to the top-left corner.
        // ? \033[2J — Clears the terminal screen.
        // ? \033[3J requests clearing the scrollback buffer on supported terminals.
        System.out.print("\033[H\033[2J\033[3J");
//        System.out.println("--------------------------------------------");
    }

    /*Format to use 
        Util.setTextColor( Util.red ,"hello world");
        Util.setTextBold(Util.boldRed,"hello World"); */

    public static void setTextColor(String color, String text){

        System.out.println(color + text + resetColor);

    }

    public static void setTextBold(String bold,String text){
        System.out.println(bold + text +  resetBold);
    }

}

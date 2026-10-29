public class util {
    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
    public static void display(Player player) {
        System.out.println("Player Name  : " + player.getName());
        System.out.println("Stress Level : " + player.getStressLevel());
        System.out.println("Luck Level   : " + player.getLuckLevel());
    }

    public static void clearConsole() {
        // ? \033[H — Moves the cursor to the top-left corner.
        // ? \033[2J — Clears the terminal screen.
        // ? \033[3J requests clearing the scrollback buffer on supported terminals.
        System.out.print("\033[H\033[2J\033[3J");
//        System.out.println("--------------------------------------------");
    }
}

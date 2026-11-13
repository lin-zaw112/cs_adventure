public class Final extends Scene {

    public Final() {
        super("The Final Verdict", "Your long and exhausting day comes to an end. It's time to face the consequences of your choices.");
    }


    @Override
    public void play(Player player) {
        display();
        player.display();
        
        if (player.getStress() == 0) {
            Util.printTextColor(Util.boldLightBlue, Util.formatTitle("The Ascension to Godhood"));
            System.out.println();
            Util.displayAns("Suddenly, it feels like the world has gone quiet. \r\n" + //
                                "\r\n" + //
                                "The heavy burdens on your shoulders disappear. You are no longer a human being. \r\n" + //
                                "\r\n" + //
                                "You have ascended. YOU HAVE REACHED GODHOOD!!!");
        } else if (player.getStress() <= 40) {
            Util.printTextColor(Util.boldLightBlue, Util.formatTitle("The Light at the End"));
            System.out.println();
            Util.displayAns("The exam results are finally announced.\nYou nervously check your results.\r\n" + //
                                "\r\n" + //
                                "CONGRATULATIONS! YOU PASSED! \r\n" + //
                                "\r\n" + //
                                "Your preparation and care for yourself have paid off. \r\n" + //
                                "\r\n" + //
                                "You smile with relief, knowing that you made it through.");
        } else if (player.getStress() <= 89) {
            Util.printTextColor(Util.boldLightBlue, Util.formatTitle("The Price of Procrastination"));
            System.out.println();
            Util.displayAns("The exam results are announced. \r\n" + //
                                "\r\n" + //
                                "You search for your student ID, only to discover that you didn't pass.\r\n" + //
                                "\r\n" + //
                                "YOU FAILED. You feel disappointed, wondering what went wrong. \r\n" + //
                                "\r\n" + //
                                "Perhaps things could have been different if you had managed your time and stress better. \r\n" + //
                                "\r\n" + //
                                "It's not the end. You can always try again.");
        } else {
            Util.printTextColor(Util.boldLightBlue, Util.formatTitle("The Breaking Point"));
            System.out.println();
            Util.displayAns("After pushing yourself too hard, you suddenly feel dizzy and collapse. \r\n" + //
                                "\r\n" + //
                                "You wake up in a hospital bed. The doctor explains that exhaustion and stress have taken a toll on your body. \r\n" + //
                                "\r\n" + //
                                "You check your phone. The exam is already over. \r\n" + //
                                "\r\n" + //
                                "GAME OVER: Health comes first!");
        }
    }
}

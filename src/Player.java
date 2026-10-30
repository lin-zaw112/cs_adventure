public class Player {
    private String name;
    // stress level ranges from 0 to 100, where 0 is no stress and 100 is maximum stress
    private int stress;
    // luck level ranges from 0 to 6, where 0 is no luck and 6 is maximum luck
    private int luck;

    //region Constructors
    public Player() {
        this.name = "KMUTT ANTS";
        this.stress = 0;
        this.luck = 0;
    }
    //endregion

    //region Getters

    public String getStressLevel() {
        if (stress == 0) {
            return stress + " (Deadly Calm)";
        } else if (stress > 0 && stress <= 50) {
            return stress + " (just a little stressed)";
        } else if (stress > 50 && stress <= 80) {
            return stress + " (Moderate)";
        } else {
            return stress + " ( You are stressed out!)";
        }

    }

    public String getLuckLevel() {
        if (luck == 0) {
            return luck + " (No Luck)";
        } else if (luck > 0 && luck <= 3) {
            return luck + " (Just a little lucky)";
        } else if (luck > 3 && luck <= 5) {
            return luck + " (Moderate)";
        } else {
            return luck + " (You are luckest person in the world!)";
        }
    }

    public void display() {
        System.out.println("Player Name  : " + this.name);
        System.out.println("Stress Level : " + this.getStressLevel());
        System.out.println("Luck Level   : " + this.getLuckLevel());
    }

    //endregion

    //region Setters
    public void setName(String name) {
        this.name = name;
    }

    public void changeStress(int amount) {
        stress = Math.clamp(stress + amount, 0, 100);
    }

    public void changeLuck(int amount) {
        luck = Math.clamp(luck + amount, 0, 6);
    }

    //endregion

}

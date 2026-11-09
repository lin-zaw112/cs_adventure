public class Player {
    private String name;
    // stress level ranges from 0 to 100, where 0 is no stress and 100 is maximum stress
    private int stress;
    private boolean isWantedToStudy = true;

    //region Constructors
    public Player() {
        this.name = "KMUTT ANTS";
        this.stress = 50;
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


    public void display() {
        System.out.println("Player Name  : " + this.name);
        System.out.println("Stress Level : " + this.getStressLevel());
    }

    //endregion

    //region Setters
    public void setName(String name) {
        this.name = name;
    }

    public void changeStress(int amount) {
        stress = Math.clamp(stress + amount, 0, 100);
    }

    //endregion

}

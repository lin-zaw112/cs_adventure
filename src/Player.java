public class Player {
    private String name;
    // stress level ranges from 0 to 100, where 0 is no stress and 100 is maximum stress
    private int stress;
    private boolean studyAfterLunch = true;
    private boolean takeNotes = true;


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

    public int getStress() {
        return this.stress;
    }


    public void display() {
        System.out.print("Name  : ");
        Util.printTextColor(Util.shinyYellow, this.name.toUpperCase());
        if(this.stress <= 50){
            System.out.print("Stress: " );
            Util.printTextColor(Util.green,  getStressLevel());
        } else if(this.stress <= 80){
            System.out.print("Stress: ");
            Util.printTextColor(Util.blue, getStressLevel());
        } else {
            System.out.print("Stress: ");
            Util.printTextColor(Util.boldRed, getStressLevel());
        }
    }

    public boolean getTakeNotes() {
        return takeNotes;
    }

    public  boolean getStudyAfterLunch() {
        return studyAfterLunch;
    }

    //endregion

    //region Setters
    public void setName(String name) {
        this.name = name;
    }

    public void changeStress(int amount) {
        stress = Math.clamp(stress + amount, 0, 100);
    }

    public void setTakeNotes(boolean takeNotes) {
        this.takeNotes = takeNotes;
    }

    public void setStudyAfterLunch(boolean studyAfterLunch) {
        this.studyAfterLunch = studyAfterLunch;
    }
    //endregion

}

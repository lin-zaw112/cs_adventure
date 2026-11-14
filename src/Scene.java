public abstract class Scene implements Playable {
    private final String title;
    private final String description;

    public Scene(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return Util.formatTitle(title);
    }

    public void display() {
        Util.printTextColor(Util.boldLightBlue, getTitle());
        System.out.println();
        if (!description.isBlank()) {
            Util.printTextColor(Util.boldLightBlue, description.strip());
            System.out.println();
        }
    }
    public abstract void play(Player player);
}

public abstract class Scene {
    private final String title;
    private final String description;

    public Scene(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public abstract void display();
    public abstract void play(Player player);
}

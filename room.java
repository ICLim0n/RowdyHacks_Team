public class room {
    private String name;
    private String description;
    private List<String> items;

    public room(String name, String description) {
        this.name = name;
        this.description = description;
        this.items = new ArrayList<>();
    }

    public void enterRoom() {
        // Code to handle entering the room
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getItems() {
        return items;
    }
}
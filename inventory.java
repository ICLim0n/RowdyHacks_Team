public class Inventory {
    private List<String> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public List<String> getItems() {
        return items;
    }

    public void addItem(String item) {
        items.add(item);
    }

    public boolean removeItem(String item) {
        return items.remove(item);
    }
}
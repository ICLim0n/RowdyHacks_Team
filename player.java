import java.util.ArrayList;
import java.util.List;

public class Player {
	private String name;
	private final List<String> inventory;

	public Player(String name) {
		this.name = name;
		this.inventory = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getInventory() {
		return inventory;
	}

	public void addItem(String item) {
		inventory.add(item);
	}

	public boolean removeItem(String item) {
		return inventory.remove(item);
	}
}

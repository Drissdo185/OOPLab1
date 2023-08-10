import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private List<Item> items;

    public Order(int id) {
        this.id = id;
        this.items = new ArrayList<>();
    }

    // get and set ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // get and set list item
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double calculateAverageCost() {
        double totalCost = 0.0;
        for (Item item : items) {
            totalCost += item.getPrice();
        }
        return totalCost / items.size();
    }
}

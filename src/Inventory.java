import java.util.ArrayList;

public class Inventory<T extends Product> {
    private ArrayList<T> items = new ArrayList<>();

    public ArrayList<T> getItems() {
        return items;
    }

    public void setItems(ArrayList<T> items) {
        this.items = items;
    }

    public void applyDiscount (String productName, int discount) {
        for (T item : items) {
            if (item.getTitle().equals(productName)) {
                double price = item.getPrice() - (item.getPrice() * discount / 100.0);
                item.setPrice(price);
            }
        }
    }

    public void addItems (T product) {
        items.add(product);
    }

    public void removeItemsById(int id) {
        String delete = "-" + id;
        items.removeIf(item -> item.getId().endsWith(delete));
    }

    public T findItemsById(int id) {
        String find = "-" + id;
        for (T item : items) {
            if (item.getId().endsWith(find)) {
                return item;
            }
            else {
                System.out.println("Not found");
            }
        }
        return null;
    }

    public void displayAll() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}

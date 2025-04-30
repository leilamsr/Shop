public class Accessory extends Product {
    private String color;

    private static int count = 3;

    public Accessory(String title, double price, String color) {
        super(title, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + color;
    }

    @Override
    protected String generateId() {
        return "Accessory-" + count++;
    }

}

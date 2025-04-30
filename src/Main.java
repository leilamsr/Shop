//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Inventory<Notebook> NotebookInventory = new Inventory<>();
        Inventory<Book> BookInventory = new Inventory<>();
        Inventory<Accessory> AccessoryInventory = new Inventory<>();

        NotebookInventory.addItems(new Notebook("AP" , 80.0, 120, true));
        NotebookInventory.addItems(new Notebook("Math" , 120.0, 200, true));

        BookInventory.addItems(new Book("JAVA" , 450.0, "Gatii" , "AmirKabir" , "Programming"));
        BookInventory.addItems(new Book("Math" , 430.0, "Najafi" , "AmirKabir" , "Math"));

        AccessoryInventory.addItems(new Accessory("Pen" , 50.0, "Black"));
        AccessoryInventory.addItems(new Accessory("Eraser" , 20.0, "Pink"));

        AccessoryInventory.removeItemsById(3);
        NotebookInventory.removeItemsById(2);

        Double totalPrice = calculateTotalPrice(NotebookInventory) + calculateTotalPrice(BookInventory) + calculateTotalPrice(AccessoryInventory);
        System.out.println(totalPrice);

        Product findNote = NotebookInventory.findItemsById(2);
        Product findBook = BookInventory.findItemsById(1);

        BookInventory.applyDiscount("JAVA" , 20);
        BookInventory.applyDiscount("Math" , 40);

        NotebookInventory.displayAll();
        BookInventory.displayAll();
        AccessoryInventory.displayAll();
    }

    public static double calculateTotalPrice(Inventory<? extends Product> inventory) {
        Double totalPrice = 0.0;
        for (Product product : inventory.getItems()) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
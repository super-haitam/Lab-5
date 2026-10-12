package problem4;

public class ShoppingCart {
    private Item[] cart;
    private int capacity;
    private int size = 0;
    private double totalPrice = 0;

    public ShoppingCart(int capacity) {
        this.capacity = Math.max(capacity, 2);
        cart = new Item[this.capacity];
    }

    public void increaseSize() {
        capacity += capacity / 2;

        Item[] temp = cart;
        cart = new Item[capacity];
        for (int i = 0; i < temp.length; ++i) cart[i] = temp[i];
    }

    public void addToCart(Item item) {
        if (size == capacity) { increaseSize(); }

        cart[size++] = item;
        totalPrice += item.getQuantity() * item.getPrice();
    }

    // Getters
    public double getTotalPrice() { return totalPrice; }

    public void printItems() {
        System.out.println("\nCart Content:");
        for (int i = 0; i < size; ++i) {
            System.out.println("\t" + (i+1) + ". " + cart[i]);
        }
    }
}
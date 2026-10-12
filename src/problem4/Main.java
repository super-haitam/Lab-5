package problem4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ShoppingCart sc = new ShoppingCart(1);

        do {
            System.out.println("\nType the info about the item.");

            System.out.print("\t-Name: ");
            String name = scan.next();

            System.out.print("\t-Price: ");
            double price = scan.nextDouble();

            System.out.print("\t-Quantity: ");
            int quantity = scan.nextInt();

            sc.addToCart(new Item(name, price, quantity));

            sc.printItems();

            System.out.println("\nDo you still want to shop? (y/n)");
        } while (scan.next().equalsIgnoreCase("y"));

        System.out.printf("Please pay...\nThe amount is: %f$\n", sc.getTotalPrice());
    }
}

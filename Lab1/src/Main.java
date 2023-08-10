import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create an order
        System.out.print("Enter order ID: ");
        int orderId = scanner.nextInt();
        Order order = new Order(orderId);

        // Add items to the order
        System.out.print("Enter the number of items: ");
        int itemCount = scanner.nextInt();

        for (int i = 1; i <= itemCount; i++) {
            System.out.println("Enter details for item " + i + ":");
            System.out.print("Item ID: ");
            int itemId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Item Name: ");
            String itemName = scanner.nextLine();
            System.out.print("Item Price: ");
            double itemPrice = scanner.nextDouble();

            Item item = new Item(itemId, itemName, itemPrice);
            order.getItems().add(item);
        }

        // Calculate and display the average cost
        double averageCost = order.calculateAverageCost();
        System.out.println("Average Cost: " + averageCost);
    }
}
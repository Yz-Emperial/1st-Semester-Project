import java.util.Scanner;

public class ProductInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt and input for product name
        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();

        // Prompt and input for quantity
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        // Prompt and input for price
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        // Display product information
        System.out.println("\n--- Product Information ---");
        System.out.println("Product Name : " + productName);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Price        : " + price);

        scanner.close();
    }
}
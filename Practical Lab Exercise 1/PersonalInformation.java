import java.util.Scanner;

public class PersonalInformation {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        // Prompt and input for name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt and input for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Prompt and input for height
        System.out.print("Enter your height: ");
        double height = scanner.nextDouble();

        // Displaying the values back to the user
        System.out.print("\n--- Personal Information ---");
        System.out.print("Name: " + name);
        System.out.print("Age: " + age);
        System.out.print("Height: " + height);
    }
}
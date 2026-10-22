import java.util.Scanner;

public class SimpleStudentRecord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt and input for student name
        System.out.print("Enter Student name: ");
        String name = input.nextLine();

        //Prompt and Input for student ID
        System.out.print("Enter Student ID: ");
        String studentID = input.nextLine();

        //Prompt and Input for test mark
        System.out.print("enter test mark: ");
        double testMark = input.nextDouble();

        //Prompt and input for pass status (true/false)
        System.out.println("Passed? (true/false): ");
        boolean passed = input.nextBoolean();

        //Display the information neatly
        System.out.println("\n ===Student Record===");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentID);
        System.out.println("test mark: " + testMark);
        System.out.println("Passed? (true/false): " + passed);
    }
}
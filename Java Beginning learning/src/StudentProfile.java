import java.util.Scanner;

public class StudentProfile{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter age:");
        int age = input.nextInt();

        System.out.print("Enter CGPA:");
        double cgpa = input.nextDouble();

        System.out.print("Enter grade:");
        char grade = input.next().charAt(0);

        System.out.print("Age : " + age);
        System.out.print("CGPA : " + cgpa);
        System.out.print("Age : " + grade);

        input.close();
    }
}


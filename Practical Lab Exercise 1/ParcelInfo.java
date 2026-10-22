import java.util.Scanner;

public class ParcelInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input customer name
        System.out.println("Enter customer name: ");
        String customername= sc.nextLine();

        //Input parcel weight
        System.out.println("Enter parcel weight(kg): ");
        double parcelweight = sc.nextDouble();

        System.out.println();

        //Display results
        System.out.println("Customer: " + customername);
        System.out.println("Parcel Weight: " + parcelweight + "kg");
    }
}
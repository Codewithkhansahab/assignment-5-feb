import java.util.Scanner;

public class Demo{

    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask user for the number of units used
        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();

        // Variable to store the total bill amount
        double billAmount = 0;

        // Calculate bill based on unit consumption
        if (units <= 50) {
            billAmount = units * 3.40;
        } else if (units <= 100) {
            billAmount = 50 * 3.40 + (units - 50) * 3.85;
        } else if (units <= 300) {
            billAmount = 50 * 3.40 + 50 * 3.85 + (units - 100) * 4.80;
        } else if (units <= 500) {
            billAmount = 50 * 3.40 + 50 * 3.85 + 200 * 4.80 + (units - 300) * 5.20;
        } else {
            billAmount = 50 * 3.40 + 50 * 3.85 + 200 * 4.80 + 200 * 5.20 + (units - 500) * 5.55;
        }

        // Print the final bill amount
        System.out.println("Total electricity bill: Rs. " + billAmount);

        // Close the scanner object
        scanner.close();
    }
}

package phonebill2;

import java.util.Scanner;

public class PhoneBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.println("Enter the bill ID:");
        int id = scanner.nextInt();

        System.out.println("Enter the base cost of the plan:");
        double baseCost = scanner.nextDouble();

        System.out.println("Enter the number of allotted minutes:");
        int allottedMinutes = scanner.nextInt();

        System.out.println("Enter the number of minutes used:");
        int minutesUsed = scanner.nextInt();

        // Create a PhoneBill object
        PhoneBill bill = new PhoneBill(id, baseCost, allottedMinutes, minutesUsed);

        // Print the itemized bill
        bill.printItemizedBill();

        scanner.close();
    }
}

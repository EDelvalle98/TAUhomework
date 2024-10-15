package phonebillcalc;

import java.util.Scanner;

public class Main {
    static final double OVERAGE_RATE = 0.25;
    static final double TAX_RATE = 0.15;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the plan fee:");
        double planFee = scanner.nextDouble();

        System.out.println("Enter the number of overage minutes:");
        int overageMinutes = scanner.nextInt();

        double overageFee = calculateOverageFee(overageMinutes);
        double tax = calculateTax(planFee, overageFee);
        double total = calculateTotal(planFee, overageFee, tax);

        printBill(planFee, overageFee, tax, total);

        scanner.close();
    }

    public static double calculateOverageFee(int minutes) {
        return minutes * OVERAGE_RATE;
    }

    public static double calculateTax(double planFee, double overageFee) {
        double subtotal = planFee + overageFee;
        return subtotal * TAX_RATE;
    }

    public static double calculateTotal(double planFee, double overageFee, double tax) {
        return planFee + overageFee + tax;
    }

    public static void printBill(double planFee, double overageFee, double tax, double total) {
        System.out.println("---- Itemized Bill ----");
        System.out.println("Plan Fee: $" + planFee);
        System.out.println("Overage Fee: $" + overageFee);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
    }
}

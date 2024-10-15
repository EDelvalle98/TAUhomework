package phonebill2;

public class PhoneBill {
    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;

    private static final double OVERAGE_RATE = 0.25;
    private static final double TAX_RATE = 0.15;

    public PhoneBill() {
        this.id = 0;
        this.baseCost = 0.0;
        this.allottedMinutes = 0;
        this.minutesUsed = 0;
    }

    public PhoneBill(int id) {
        this.id = id;
        this.baseCost = 0.0;
        this.allottedMinutes = 0;
        this.minutesUsed = 0;
    }

    public PhoneBill(int id, double baseCost, int allottedMinutes, int minutesUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    public double calculateOverage() {
        int overageMinutes = minutesUsed - allottedMinutes;
        return (overageMinutes > 0) ? overageMinutes * OVERAGE_RATE : 0;
    }

    public double calculateTax() {
        double subtotal = baseCost + calculateOverage();
        return subtotal * TAX_RATE;
    }

    public double calculateTotal() {
        return baseCost + calculateOverage() + calculateTax();
    }

    public void printItemizedBill() {
        System.out.println("---- Phone Bill ----");
        System.out.println("ID: " + id);
        System.out.println("Base Cost: $" + baseCost);
        System.out.println("Overage Fee: $" + calculateOverage());
        System.out.println("Tax: $" + calculateTax());
        System.out.println("Total: $" + calculateTotal());
    }
}

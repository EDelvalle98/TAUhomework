package cake;

public class Cake {
    private String flavor;
    private double price;

    // Constructor
    public Cake(String flavor,double price) {
        this.flavor = flavor;
        this.price = price;
    }

    // Getter for flavor
    public String getFlavor() {
        return flavor;
    }

    // Setter for flavor
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }
}

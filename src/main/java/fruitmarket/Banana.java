package fruitmarket;

public class Banana extends Fruit{
    public Banana() {
        setCalories(105);
    }

    public void peel() {
        System.out.println("The banana is peeled");
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana smoothie is made");
    }
}

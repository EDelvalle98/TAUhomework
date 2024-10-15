package fruitmarket;

public class Apple extends Fruit{
    public Apple() {
        setCalories(95);
    }

    public void removeSeeds() {
        System.out.println("Seeds are removed from the apple");
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple juice is made");
    }
}

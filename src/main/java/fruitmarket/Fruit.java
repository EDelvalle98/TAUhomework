package fruitmarket;

public class Fruit {
    private int calories;

    public Fruit() {
        this.calories = 0;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void makeJuice() {
        System.out.println("Juice is made");
    }
}


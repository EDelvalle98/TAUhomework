package fruitmarket;

public class Market {
    public static void main(String[] args) {

    Fruit apple = new Apple();
    Fruit banana = new Banana();

        apple.makeJuice();
        banana.makeJuice();

        if (apple instanceof Apple) {
        ((Apple) apple).removeSeeds();
    }

        if (banana instanceof Banana) {
        ((Banana) banana).peel();
    }

    Fruit[] fruits = {new Apple(), new Banana()};

        for (Fruit fruit : fruits) {
        fruit.makeJuice();

        }
    }
}

package HomeWork_7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Murzik", 50), new Cat("Kisa", 50), new Cat("Snezhok", 25), new Cat("Lili", 5), new Cat("Kote", 1)};

        Plate plate = new Plate(80);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
    }
}

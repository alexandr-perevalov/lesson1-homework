package geekbrains.lesson7homework;

public class Main {
    public static void main(String[] args) {
        //System.out.println("List of cats:");
        Cat[] x = {new Cat("Barsik", 8), new Cat("Mursik", 6), new Cat("Tom", 11)};
        Plate plate = new Plate(10);
        for (Cat c : x) {
            System.out.println(c);
        }
        System.out.println("\n" + plate);

        System.out.println("increase food by 100");
        plate.increaseFood(10);
        System.out.println(plate);

        System.out.println("Cats take food:");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println(c);
            System.out.println(plate);
        }
    }
}

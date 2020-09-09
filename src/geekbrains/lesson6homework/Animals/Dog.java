package geekbrains.lesson6homework.Animals;

import geekbrains.lesson6homework.Animals.Animal;

public class
Dog extends Animal {
    private final int max_run = 500;
    private final int max_swim = 10;

    @Override
    public void run(int length) {
        if ((length >= 0) && (length <= max_run)) System.out.println("Дружок пробежал " + length + " м.");
        else System.out.println("Дружок помер, когда пробежал " + length + " м.");
    }

    @Override
    public void swim(int length) {
        if ((length >= 0) && (length <= max_swim)) System.out.println("Дружок проплыл " + length + " м.");
        else System.out.println("Дружок утонул проплыв " + length + " м.");
    }
}

package geekbrains.lesson6homework.Animals;

import geekbrains.lesson6homework.Animals.Animal;

public class Cat extends Animal {
    private final int max_run = 200;

    @Override
    public void run(int length) {
        if ((length >= 0) && (length <= max_run)) System.out.println("Барсик пробежал " + length + " м.");
        else System.out.println("Барсик помер, когда пробежал " + length + " м.");
    }

    @Override
    public void swim(int length) {
        System.out.println("Котам не нравится плавать");
    }

}

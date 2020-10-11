package geekbrains.lesson6homework.Animals;

abstract class Animal {
    private final int max_run = 0;
    private final int max_swim = 0;

    abstract void run(int length);

    abstract void swim(int length);
}

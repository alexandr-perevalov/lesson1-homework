package geekbrains.lesson7homework;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "PLATE: " + food;
    }

    void decreaseFood(int appetite) {
        if (food >= appetite) {
            food -= appetite;
        }
    }

    int food() {
        return food;
    }

    void increaseFood(int amount) {
        food += amount;
    }
}

package geekbrains.lesson7homework;

public class Cat {

    private String name;
    private int appetite;
    private boolean isFull;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }

    @Override
    public String toString() {
        return "CAT: " + name + " APPETITE: " + appetite + " ISFULL: " + isFull;
    }

    void eat(Plate plate) {
        if (plate.food() > appetite) {
            plate.decreaseFood(appetite);
            isFull = true;
        }
    }

}

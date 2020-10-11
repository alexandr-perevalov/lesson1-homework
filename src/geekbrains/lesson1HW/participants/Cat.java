package lesson1HW.participants;

public class Cat implements Competitor {
    private String name;

    private int maxRunDist;
    private int maxJumpDist;

    private boolean onDistance;

    public Cat(String name, int maxRunDist, int maxJumpDist) {
        this.name = name;
        this.maxRunDist = maxRunDist;
        this.maxJumpDist = maxJumpDist;
        this.onDistance = true;
    }
    public Cat (String name) {
        this(name, 400, 3);
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDist) {
            System.out.printf("%s успешно пробежал %d метров\n ", name,  dist);
        } else {
            System.out.printf("%s не смог пробежать %d метров\n ", name, dist);
            onDistance = false;
        }
    }

    @Override
    public void jump(int h) {
        if (h <= maxJumpDist) {
            System.out.printf("%s успешно прыгнул %d метров\n", name, h);
        } else {
            System.out.printf("%s не смог прыгнуть %d метров\n", name, h);
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.printf("%s %b\n", name, onDistance);
    }
}

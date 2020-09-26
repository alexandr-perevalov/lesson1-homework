package lesson1HW.Obstacles;

import lesson1HW.participants.Competitor;

public class Wall implements Obstacle {
    private int h;

    public Wall (int h){
        this.h = h;
    }

    @Override
    public void doIt(Competitor c) {
        c.run(h);
    }
}

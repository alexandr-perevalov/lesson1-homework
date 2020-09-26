package lesson1HW.Obstacles;

import lesson1HW.participants.Competitor;

public class Cross implements Obstacle {
    private int dist;

    public Cross (int dist){
        this.dist = dist;
    }

    @Override
    public void doIt(Competitor c) {
        c.run(dist);
    }
}

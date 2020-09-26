package lesson1HW;

import lesson1HW.Obstacles.Cross;
import lesson1HW.Obstacles.Obstacle;
import lesson1HW.Obstacles.Wall;
import lesson1HW.participants.Cat;
import lesson1HW.participants.Competitor;
import lesson1HW.participants.Human;
import lesson1HW.participants.Robot;

public class Main {
    public static void main(String[] args) {
        Competitor[] competitors = {
            new Human("Alex",51,2),
            new Cat("Tom",550,1),
            new Robot("Wall-e",999,0)
        };

        Obstacle[] obstacles = {
            new Cross(465),
            new Wall(1)
        };

        for (Competitor c : competitors) {
            for (Obstacle o : obstacles) {
                o.doIt(c);
                if (!c.isOnDistance()) {
                    break;
                }
            }
        }

        for (Competitor competitor : competitors) {
            competitor.info();
        }
    }
}

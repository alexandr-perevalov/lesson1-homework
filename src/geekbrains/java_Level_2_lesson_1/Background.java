package geekbrains.java_Level_2_lesson_1;

import java.awt.*;

public class Background extends Sprite {
    private float time;
    private static final float AMPLITUDE = 255f / 2f;
    private Color color;

    @Override
    void update(GameCanvas canvas, float deltaTime) {
        time += deltaTime;
        int red = Math.round(AMPLITUDE + AMPLITUDE * (float) Math.sin(time * 1f));
        int green = Math.round(AMPLITUDE + AMPLITUDE * (float) Math.sin(time * 15f));
        int blue = Math.round(AMPLITUDE + AMPLITUDE * (float) Math.sin(time * 10f));
        color = new Color(red, green, blue);
    }

    @Override
    void render(GameCanvas gameCanvas, Graphics g) {
        gameCanvas.setBackground(color);
    }
}

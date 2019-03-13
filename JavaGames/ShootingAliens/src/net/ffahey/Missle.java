package net.ffahey;

public class Missle extends Sprite {

    private final int BOARD_WIDTH = 390;
    private final int MISSLE_SPEED = 2;

    public Missle(int x, int y) {
        super(x, y);

        initMissle();
    }

    private void initMissle() {

        loadImage("images/missile.png");
        getImageDimensions();
    }

    public void move() {

        x += MISSLE_SPEED;

        if (x > BOARD_WIDTH) {
            visible = false;
        }
    }
}

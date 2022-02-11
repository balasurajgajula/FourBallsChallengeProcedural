import processing.core.PApplet;

public class FourBallsChallengeProcedural extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int ball1 = 0, ball2 = 0, ball3 = 0, ball4 = 0;

    public static void main(String[] args) {
        PApplet.main("FourBallsChallengeProcedural");
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        ellipse(ball1, HEIGHT / 5, DIAMETER, DIAMETER);
        ball1 += 1;
        ellipse(ball2, 2 * (HEIGHT / 5), DIAMETER, DIAMETER);
        ball2 += 2;
        ellipse(ball3, 3 * (HEIGHT / 5), DIAMETER, DIAMETER);
        ball3 += 3;
        ellipse(ball4, 4 * (HEIGHT / 5), DIAMETER, DIAMETER);
        ball4 += 4;
    }
}

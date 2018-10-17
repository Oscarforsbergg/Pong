package pong.model;

import static pong.model.Pong.GAME_HEIGHT;

/*
 * A Paddle for the Pong game
 * A model class
 *
 */
public class Paddle extends AbstractMovable  {

    public static final double PADDLE_SPEED = 3;
    public static final double PADDLE_HEIGHT = 40;
    public static final double PADDLE_WIDTH = 20;


    public Paddle(double x, double y, double width, double height, double dx, double dy) {
        super(x, y, width, height, dx, dy);
    }

    public Paddle(double x, double y) {
        this(x, y, PADDLE_WIDTH, PADDLE_HEIGHT, PADDLE_SPEED, 2);
    }

    public void move(){
        setX(getX() + getDx());
    }
}

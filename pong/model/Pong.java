package pong.model;


import pong.event.Event;
import pong.event.EventService;

import java.util.ArrayList;
import java.util.List;

/*
 * Logic for the Pong Game
 * Model class representing the "whole" game
 * Nothing visual here
 *
 */
public class Pong {

    public static final double GAME_WIDTH = 600;
    public static final double GAME_HEIGHT = 400;
    public static final double BALL_SPEED_FACTOR = 1.02;
    public static final long HALF_SEC = 500_000_000;


    private int pointsLeft;
    private int pointsRight;

    private Ball ball;
    private Paddle rightPaddle;
    private Paddle leftPaddle;

    public Pong(Ball ball, Paddle rightPaddle, Paddle leftPaddle, Wall topWall, Wall bottomWall){
        this.ball = ball;
        this.rightPaddle = rightPaddle;
        this.leftPaddle = leftPaddle;

    }
    // TODO Constructor

    // --------  Game Logic -------------

    private long timeForLastHit;         // To avoid multiple collisions

    public void update(long now) {
        ball.move();
        if (ball.getX() > GAME_HEIGHT || ball.getX() < 0) {
            if (ball.getX() > 0){
                this.pointsRight++;
            }
            else{
                this.pointsLeft++;
            }
            ball.setX(300 - (Ball.BALL_WIDTH / 2));
            ball.setY(200 - (Ball.BALL_HEIGHT /2));
        }


      // TODO Most game logic here, i.e. move paddles etc.
    }



    // --- Used by GUI  ------------------------

    public List<IPositionable> getPositionables() {
        List<IPositionable> drawables = new ArrayList<>();
        // TODO
        drawables.add(rightPaddle);
        drawables.add(leftPaddle);
        drawables.add(ball);
        return drawables;
    }

    public int getPointsLeft() {
        return pointsLeft;
    }

    public int getPointsRight() {
        return pointsRight;
    }

    public void setSpeedRightPaddle(double dy) {
        // TODO
    }

    public void setSpeedLeftPaddle(double dy) {
        // TODO
    }
}

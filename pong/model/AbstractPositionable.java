package pong.model;

public abstract class AbstractPositionable implements IPositionable {

    private double x;   //Top left corner
    private double y;

    private double width;
    private double height;

    public AbstractPositionable(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getMaxX() {
        return x + width;
    }

    public double getMaxY() {
        return y + height;
    }

    public boolean intersect(AbstractPositionable other) {
        boolean above = other.getMaxY() < getY();
        boolean below = other.getY() > getMaxY();
        boolean leftOf = other.getMaxX() < getX();
        boolean rightOf = other.getX() > getMaxX();
        return !(above || below || rightOf || leftOf);
    }
}

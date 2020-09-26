package Pr06;

import Pr05.Rectangle;

class MovableRectangle extends Rectangle implements Movable {
    private Point center;
    public MovableRectangle(boolean isFilled, String color, double width, double height) {
        super(isFilled, color, width, height);
        center = new Point(5, 3);
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void move(int right, int down) {
        center.move(right, down);
    }
}

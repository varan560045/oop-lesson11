package com.dmdev.oop.practice;

public class Rectangle {
    Point topLeft;
    Point lowerRight;

    public Rectangle(Point topLeft, Point lowerRight) {
        this.topLeft = topLeft;
        this.lowerRight = lowerRight;
    }

    public double getAreaRectangle() {
        double x = topLeft.getX() - lowerRight.getX();
        double y = topLeft.getY() - lowerRight.getY();
        double area = (x * y) > 0 ? x * y : (x * y) * -1;
        return area;
    }

    public double getDiagonal() {
        return topLeft.distance(lowerRight);
    }
}

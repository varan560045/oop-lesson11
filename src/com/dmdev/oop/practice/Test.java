package com.dmdev.oop.practice;

public class Test {
    public static void main(String[] args) {
        Point topLeft1 = new Point(5, 0.0);
        Point lowerRight1 = new Point(0.0, 2);
        Rectangle rectangle1 = new Rectangle(topLeft1, lowerRight1);

        System.out.println("Первый прямоугольник:");
        System.out.println("Площадь: " + rectangle1.getAreaRectangle());
        System.out.println("Диагональ" + rectangle1.getDiagonal());
        System.out.println();

        Point topLeft2 = new Point(3,0);
        Point lowerRight2 = new Point(0, 8);
        Rectangle rectangle2 = new Rectangle(topLeft2, lowerRight2);

        System.out.println("Второй прямоугольник:");
        System.out.println("Площадь: " + rectangle2.getAreaRectangle());
        System.out.println("Диагональ" + rectangle2.getDiagonal());
    }
}

package com.task3;

public class Circle {
    private double radius;
	private double pi;

    public Circle() {
        this.radius = 5.0;
        this.pi = 3.14;
    }
    public Circle(double radius, double pi) {
        this.radius = radius;
        this.pi = pi;
    }
    public double getCircumference() {
        return 2 * pi * radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Circle 1 radius: " + circle1.getRadius());
        System.out.println("Circle 1 circumference: " + circle1.getCircumference());

        Circle circle2 = new Circle(3.0,3.14);
        System.out.println("Circle 2 radius: " + circle2.getRadius());
        System.out.println("Circle 2 circumference: " + circle2.getCircumference());
    }
}

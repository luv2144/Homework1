package com.epam.lesson7;

public class Circle extends Shape {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() { return radius; }
    public void setRadius(int radius) { this.radius = radius; }

    @Override
    public String toString() {
        return super.toString() +
                ", radius=" + radius;
    }

    @Override
    public double calcArea() {
        final double pi = Math.PI;
        return 2 * pi * radius * radius;
    }
}

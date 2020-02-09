package com.epam.lesson7;

public class Rectangle extends Shape {
    private int width;
    private int heigth;

    public Rectangle(String color, int width, int heigth) {
        super(color);
        this.width = width;
        this.heigth = heigth;
    }

    public int getWidth() { return width; }
    public void setWidth(int width) { this.width = width; }
    public int getHeigth() { return heigth; }
    public void setHeigth(int heigth) { this.heigth = heigth; }

    @Override
    public String toString() {
        return super.toString() +
                ", width=" + width +
                ", height=" + heigth;
    }

    @Override
    public double calcArea() {
        return width * heigth;
    }
}

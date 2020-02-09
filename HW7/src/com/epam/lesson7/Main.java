package com.epam.lesson7;

public class Main {
    public static void main(String[] args) {
        Shape[] figures = {new Rectangle("blue", 13, 16),
                new Rectangle("white", 4, 6),
                new Rectangle("black", 8, 10),
                new Rectangle("grey", 12, 14),
                new Circle("green", 6),
                new Circle("red", 5),
                new Circle("yellow", 12),
                new Triangle("rose", 8, 10, 12),
                new Triangle("purple", 16, 14,20)};
        showArrInfo(figures);
        System.out.println("Total area = " + findTotalArea(figures));
        double[] areas = findAreaByType(figures);
        System.out.println("Total area of Rectangle elements: " + areas[0] +
                            "\nTotal area of Circle elements: " + areas[1] +
                            "\nTotal area of Triangle elements: " + areas[2]);
    }

    public static void showArrInfo(Shape[] elements) {
        for (Shape element: elements) {
            System.out.println(element.toString() + ", area=" + element.calcArea());
        }
    }

    public static double findTotalArea(Shape[] elements) {
        double result = 0;
        for (Shape element: elements) {
            result += element.calcArea();
        }
        return result;
    }
    
    public static double[] findAreaByType(Shape[] elements) {
        double[] results = new double[3];
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] instanceof Rectangle) {
                results[0] += elements[i].calcArea();
            } else if (elements[i] instanceof Circle) {
                results[1] += elements[i].calcArea();
            } else if (elements[i] instanceof Triangle) {
                results[2] += elements[i].calcArea();
            } else {
                System.out.println("Unknown shape of array element at index: " + i);
            }
        }
        return results;
    }
}

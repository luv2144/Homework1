package com.epam.lesson5;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------Task 1---------");
        System.out.println("First array");
        int[][] array1 = ArrMethods.generateArr();
        ArrMethods.printArray(array1);
        System.out.println("Second array");
        int[][] array2 = ArrMethods.generateArr();
        ArrMethods.printArray(array2);
        int[][] array3 = ArrMethods.findSumArr(array1, array2);
        System.out.println("Third array");
        ArrMethods.printArray(array3);

        System.out.println("\n---------Task 2---------");
        int[][] task2Arr = ArrMethods.generateArr();
        System.out.println("Your array:");
        ArrMethods.printArray(task2Arr);
        System.out.println("Result arrays:");
        ArrMethods.returnArrs(task2Arr);
    }
}

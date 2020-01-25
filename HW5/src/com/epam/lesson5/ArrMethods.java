package com.epam.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrMethods {
    public static void returnArrs (int[][] arr) {
        final int POSSIBLE_NUM_OF_ELEMS = arr.length * arr[0].length;
        int[] plus = new int [POSSIBLE_NUM_OF_ELEMS];
        int[] minus = new int [POSSIBLE_NUM_OF_ELEMS];
        int countPlusElem = 0;
        int countMinusElem = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    plus[countPlusElem] = arr[i][j];
                    countPlusElem++;
                } else if (arr[i][j] < 0) {
                    minus[countMinusElem] = arr[i][j];
                    countMinusElem++;
                } else {
                    continue;
                }
            }
        }
        int[] plusCopy = Arrays.copyOf(plus, countPlusElem);
        int[] minusCopy = Arrays.copyOf(minus, countMinusElem);
        printArray(plusCopy);
        System.out.println();
        printArray(minusCopy);
    }

    public static int[][] generateArr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the rows: ");
        int numRows = sc.nextInt();
        System.out.print("Enter the number of the elements in a row: ");
        int numElements = sc.nextInt();
        int[][] newArr = new int[numRows][numElements];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numElements; j++) {
                newArr[i][j] = (int) (Math.random()*100) - 50;
            }
        }
        return newArr;
    }

    public static int[][] findSumArr(int[][] arr, int[][] arr2) {
        int[][] arr3 = new int[arr.length][arr[0].length];
        int firstArrElem, secondArrElem, thirdArrElem;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                firstArrElem = arr[i][j];
                secondArrElem = arr2[i][j];
                thirdArrElem = firstArrElem + secondArrElem;
                arr3[i][j] = thirdArrElem;
            }
        }
        return arr3;
    }

    public static void printArray(int[][] array) {
        for (int[] row: array) {
            for (int elem: row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(" " + element);
        }
    }
}

package com.epam.lesson2;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println("Task1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите трехзачное число: ");
        int number = sc.nextInt();
        int hundreds = number / 100;
        int tens = (number - hundreds * 100) / 10;
        int ones = number - hundreds * 100 - tens * 10;
        int reversedNumber = ones * 100 + tens * 10 + hundreds;
        int difference = number - reversedNumber;
        System.out.println(number + " - " + reversedNumber + " = " + difference);

        System.out.println("Task2");
        double pound = 453.6;
        double numberOfPounds = 2.4;
        double weightInGrams = numberOfPounds * pound;
        int kilos = (int) (weightInGrams) / 1000;
        int grams = (int) (weightInGrams) - kilos * 1000;
        System.out.println(kilos + " kg " + grams + " g");

        System.out.println("Task3");

    }
}

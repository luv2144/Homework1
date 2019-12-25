package com.epam.lesson1;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("**** ****     *    *   *");
        System.out.println("*    *  *    **    ** **");
        System.out.println("**   ****   *  *   * * *");
        System.out.println("*    *     ******  *   *");
        System.out.println("**** *    *      * *   *");

        Scanner sc = new Scanner(System.in);
        System.out.print("Input symbol: ");
        String symbol = sc.next();
        System.out.println(symbol + "  " + symbol + " " + symbol + symbol + symbol + symbol + " " + symbol + "    " + symbol + "      " + symbol + symbol);
        System.out.println(symbol + "  " + symbol + " " + symbol + "    " + symbol + "    " + symbol + "     " + symbol + "  " + symbol);
        System.out.println(symbol + symbol + symbol + symbol + " " + symbol + symbol + symbol + "  " + symbol + "    " + symbol + "    " + symbol + "    " + symbol);
        System.out.println(symbol + "  " + symbol + " " + symbol + "    " + symbol + "  " + symbol + " " + symbol + "  "+ symbol + "  " + symbol + "  " + symbol);
        System.out.println(symbol + "  " + symbol + " " + symbol + symbol + symbol + symbol + " " + symbol + symbol + symbol + symbol + " " + symbol + symbol + symbol + symbol + "   " + symbol + symbol);
    }
}

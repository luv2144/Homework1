package com.epam.lesson4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Task 1");
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.println(findUniqueSymbols(str));
        System.out.println("Task 2");
        System.out.print("Enter the integer number: ");
        int number = sc.nextInt();
        System.out.println(makeBinary(number));
    }

    public static String findUniqueSymbols(String str) {
        final int STRING_LENGTH = str.length();
        int currentIndex = 0;
        String uniqueString = "";
        while (currentIndex < STRING_LENGTH) {
            String strChar = String.valueOf(str.charAt(currentIndex));
            if (str.indexOf(strChar, currentIndex + 1) == -1) {
                uniqueString += strChar;
            }
        currentIndex++;
        }
        System.out.print("Unique symbols of the string: ");
        return uniqueString;
    }

    public static String makeBinary(int number) {
        String binaryCodeReversed = "";
        String binaryCode = "";
        while (number > 0) {
            int bit = number % 2;
            binaryCodeReversed += String.valueOf(bit);
            if (bit == 1) {
                number = (number - 1) / 2;
            } else {
                number = number / 2;
            }
        }
        binaryCodeReversed += "b0";
        int stringLength = binaryCodeReversed.length();
        int lastIndex = stringLength - 1;
        while (lastIndex >= 0) {
            String currentBit = String.valueOf(binaryCodeReversed.charAt(lastIndex));
            binaryCode += currentBit;
            lastIndex--;
        }
        System.out.print("Binary representation of the number: ");
        return binaryCode;
    }
}
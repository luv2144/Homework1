package com.epam.homework10;

import java.util.InputMismatchException;

public class Validator extends Exception{
    public static void checkForNegativeArraySizeExceptionAndInputMismatchException() {
        try {
           Main.program();
        } catch (NegativeArraySizeException e) {
            System.out.println("Размер массива не может быть отрицательным числом.");
        } catch (InputMismatchException i) {
            System.out.println("Вы ввели символ в поле для ввода цифр.");
        } catch (CloneNotSupportedException c) {
            System.out.println("serftgy");
        }
    }

}

package com.epam.homework10;

import java.io.InvalidObjectException;
import java.util.Scanner;

public class Main extends Validator{
    static Scanner sc = new Scanner(System.in);

    public static Books initBooks() {
        System.out.print("Введите размер массива: ");
        int arrLen = sc.nextInt();
        Books library = new Books(arrLen);
        Book firstBook = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", "Charles Scribner's Sons", 1925, 176, 15);
        library.addBook(firstBook);
        Book secondBook = new Book(2, "Jane Eyre", "Charlotte Brontë", "Barnes & Noble Classics", 1847, 638, 25);
        library.addBook(secondBook);
        Book thirdBook = new Book(3, "Alice in Wonderland", "Lewis Carroll", "Macmillan Publishers", 1865, 179, 20);
        library.addBook(thirdBook);
        Book fourthBook = new Book(4, "Shirley", "Charlotte Brontë", "Smith, Elder & Co.", 1849, 572, 35);
        library.addBook(fourthBook);
        Book fifthBook = new Book(5, "War and Peace", "Leo Tolstoy", "The Russian Messenger", 1869, 1225, 55);
        library.addBook(fifthBook);
        return library;
    }

    public static void program() throws CloneNotSupportedException {
        Books library = initBooks();
        System.out.println("Введите название файла: ");
        Serializator serializator = new Serializator();
        serializator.serialization(library);
        try {
            Books libraryD = serializator.deserialization();
            System.out.println("Данные файла:");
            libraryD.showBooks();
            System.out.print("\nВведтие % изменения цены книг: ");
            libraryD.changePrice(sc.nextInt());
            libraryD.showBooks();
            System.out.print("\nВведите имя автора, чтобы осуществить поиск: ");
            Books authorList = libraryD.searchBooksByAuthor();
            authorList.showBooks();
            if (libraryD.getCounterByAuthor() == 0) {
                System.out.println("Книг данного автора не найдено");
            }
            System.out.print("\nВведите год издания: ");
            Books yearList = libraryD.searchBooksByYear(sc.nextInt());
            yearList.showBooks();
            if (libraryD.getCounterByYear() == 0) {
                System.out.println("Книг, изданных после этого года, не найдено");
            }
            serializator.serialization(libraryD);
            Books libraryDD = serializator.deserialization();
            System.out.println("\nНовые данные файла:");
            libraryDD.showBooks();
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        checkForNegativeArraySizeExceptionAndInputMismatchException();
    }
}

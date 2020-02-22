package com.epam.homework8;

import java.util.Scanner;

public class Main extends Validator{
    static Scanner sc = new Scanner(System.in);
    public static void program() {
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
        library.showBooks();
        System.out.print("\nВведтие % изменения цены книг: ");
        library.changePrice(sc.nextInt());
        library.showBooks();
        System.out.print("\nВведите имя автора, чтобы осуществить поиск: ");
        Books authorList = library.searchBooksByAuthor();
        authorList.showBooks();
        if (library.getCounterByAuthor() == 0) {
            System.out.println("Книг данного автора не найдено");
        }
        System.out.print("\nВведите год издания: ");
        Books yearList = library.searchBooksByYear(sc.nextInt());
        yearList.showBooks();
        if (library.getCounterByYear() == 0) {
            System.out.println("Книг, изданных после этого года, не найдено");
        }

        System.out.println("\nУпорядочить книги по автору:");
        library.sortByAuthor();
        library.showBooks();
        System.out.println("\nУпорядочить книги по издательству:");
        library.sortByPublisher();
        library.showBooks();
        System.out.println("\nУпорядочить книги по стоимости в порядке убывания:");
        library.sortByPrice();
        library.showBooks();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        checkForNegativeArraySizeExceptionAndInputMismatchException();
    }
}

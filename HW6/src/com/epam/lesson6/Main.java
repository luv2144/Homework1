package com.epam.lesson6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arrLen = sc.nextInt();
        Books library = new Books(arrLen);
        Book firstBook = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", "Charles Scribner's Sons ", 1925, 176, 15);
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
        System.out.print("Введтие % изменения цены книг: ");
        library.changePrice(sc.nextInt());
        library.showBooks();
        System.out.print("Введите имя автора, чтобы осуществить поиск: ");
        Books authorList = library.searchBooksByAuthor();
        authorList.showBooks();
        System.out.print("Введите год издания: ");
        Books yearList = library.searchBooksByYear(sc.nextInt());
        yearList.showBooks();
    }
}

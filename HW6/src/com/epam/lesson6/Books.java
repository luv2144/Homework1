package com.epam.lesson6;

import java.util.Scanner;

public class Books {
    private Book[] arrBooks;

    public Books (int arrLength) {
        arrBooks = new Book[arrLength];
    }

    public void addBook (Book newBook) {
        for (int i = 0; i < arrBooks.length; i++) {
            if (arrBooks[i] == null) {
                arrBooks[i] = newBook;
                break;
            }
        }
    }

    public void showBooks() {
        for (Book elem: arrBooks ) {
            if (elem != null) {
                elem.view();
            }
        }
    }

    public void changePrice(int percents) {
        for (int i = 0; i < arrBooks.length; i++) {
            if (arrBooks[i] != null) {
                arrBooks[i].setPrice(arrBooks[i].getPrice() + arrBooks[i].getPrice() / 100 * percents);
            }
        }
    }

    public Books searchBooksByAuthor() {
        Books authorList = new Books(arrBooks.length);
        Scanner sc = new Scanner(System.in);
        String author = sc.nextLine();
        int counter = 0;
        for (Book elem: arrBooks) {
            if ( elem != null && elem.getAuthor().equals(author)) {
                authorList.addBook(elem);
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Книг данного автора не найдено");
        }
        return authorList;
    }

    public Books searchBooksByYear(int year) {
        Books yearList = new Books(arrBooks.length);
        int counter = 0;
        for (Book elem : arrBooks) {
            if (elem != null && elem.getYear() > year) {
                yearList.addBook(elem);
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Книг, изданных после этого года не найдено");
        }
        return yearList;
    }

}

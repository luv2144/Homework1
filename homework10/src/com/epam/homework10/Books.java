package com.epam.homework10;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

public class Books implements Cloneable, Serializable {
    private Book[] arrBooks;
    Book book;
    private int counterByAuthor;
    private int counterByYear;

    public int getCounterByAuthor() { return counterByAuthor; }
    public int getCounterByYear() { return counterByYear; }

    public Books (int arrLength) {
        arrBooks = new Book[arrLength];
    }

    public void addBook(Book newBook) {
        for (int i = 0; i < arrBooks.length; i++) {
            if (arrBooks[i] == null) {
                arrBooks[i] = newBook;
                break;
            }
        }
    }

    public void showBooks() {
        for (Book elem: arrBooks) {
            try {
                elem.equals(null);
                System.out.println(elem);
            } catch (NullPointerException e) {
                break;
            }
        }
    }

    public void changePrice(int percents) {
        try {
            for (int i = 0; i < arrBooks.length; i++) {
                arrBooks[i].setPrice(arrBooks[i].getPrice() + arrBooks[i].getPrice() / 100 * percents);
            }
        } catch (NullPointerException e) {}

    }

    public Books searchBooksByAuthor() {
        Books authorList = new Books(arrBooks.length);
        Scanner sc = new Scanner(System.in);
        String author = sc.nextLine();
        try {
            for (Book elem: arrBooks) {
                if (elem.getAuthor().equals(author)) {
                    authorList.addBook(elem);
                    counterByAuthor++;
                }
            }
        } catch (NullPointerException e) {}
        return authorList;
    }

    public Books searchBooksByYear(int year) {
        Books yearList = new Books(arrBooks.length);
        try {
            for (Book elem : arrBooks) {
                if (elem.getYear() > year) {
                    yearList.addBook(elem);
                    counterByYear++;
                }
            }
        } catch (NullPointerException e) {}
        return yearList;
    }

//    @Override
//    protected Books clone() throws CloneNotSupportedException {
//        Books books = (Books) super.clone();
//        books.book = book.clone();
//        return books;
//    }

    @Override
    public Books clone() throws CloneNotSupportedException {
        Books clone = (Books) super.clone();
        clone.arrBooks = Arrays.copyOf(arrBooks, arrBooks.length);
        return clone;
    }

    public void sortByAuthor() {
        try {
            AuthorComparator authorComparator = new AuthorComparator();
            Arrays.sort(arrBooks, authorComparator);
        } catch (NullPointerException e) {}
    }

    public void sortByPublisher() {
        try {
            PublisherComparator publisherComparator = new PublisherComparator();
            Arrays.sort(arrBooks, publisherComparator);
        } catch (NullPointerException e) {}
    }

    public void sortByPrice() {
        try {
            PriceComparator priceComparator = new PriceComparator();
            Arrays.sort(arrBooks, priceComparator);
        } catch (NullPointerException e) {}
    }
}


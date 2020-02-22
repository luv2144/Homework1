package com.epam.homework8;

public class Book implements Cloneable {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int numOfPages;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book(int id, String name, String author, String publisher, int year, int numOfPages, int price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.numOfPages = numOfPages;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + id
                + "; name: " + name
                + "; author: " + author
                + "; publisher: " + publisher
                + "; year: " + year
                + "; number of pages: " + numOfPages
                + "; price: " + price;
    }

    @Override
    protected Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }
}

package com.epam.homework8;

import java.util.Comparator;

public class PriceComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Book book1 = (Book)o1;
        Book book2 = (Book)o2;
        if (book1.getPrice() > book2.getPrice()) return -1;
        if (book1.getPrice() < book2.getPrice()) return 1;
        return 0;
    }
}

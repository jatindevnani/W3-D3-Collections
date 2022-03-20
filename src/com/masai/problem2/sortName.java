package com.masai.problem2;

import java.util.Comparator;

public class sortName implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        String name1 = o1.getProductName();
        String name2 = o2.getProductName();
        return name1.compareTo(name2);
    }
}

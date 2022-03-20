package com.masai.problem2;

import java.util.Comparator;

public class sortPrice implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getProductPrice() < o2.getProductPrice()) {
            return -1;
        } else if (o1.getProductPrice() == o2.getProductPrice()) {
            return 0;
        } else {
            return 1;
        }
    }
}

package com.masai.problem2;

import java.util.Comparator;

public class sortID implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getProductId() < o2.getProductId()) {
            return -1;
        } else if (o1.getProductId() == o2.getProductId()) {
            return 0;
        } else {
            return 1;
        }
    }
}

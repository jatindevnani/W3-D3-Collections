package com.masai.problem2;
import java.util.*;

public class Product {
    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }

    private int productId;
    private String productName;
    private double productPrice;

    public Product(String name, int id, double price) {
        this.productId = id;
        this.productName = name;
        this.productPrice = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId && Double.compare(product.productPrice, productPrice) == 0 && productName.equals(product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, productPrice);
    }
}

package com.masai.problem2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        int count = 1;

        System.out.println("Please enter 4 products: ");

        while(count <= 4) {
            System.out.println("Enter details of Product " + count);

            try {
                System.out.print("Product Name: ");
                String name = scanner.next();

                System.out.println("Product ID: ");
                int id = scanner.nextInt();

                System.out.println("Product Price: ");
                double price = scanner.nextDouble();

                products.add(new Product(name, id, price));
                count++;

            } catch (InputMismatchException ime) {
                System.out.println("Invalid Format of ID or Price. ID/Price must not include alphabets.");
                System.out.println("Please re-enter details of Product " + count );
                continue;
            }
        }

        //Sorting


            try {
                System.out.println("How would you like to sort the products?");
                System.out.println("1 - Sort by Product Price");
                System.out.println("2 - Sort by Product Name");
                System.out.println("3 - Sort by Product ID");

                int query = scanner.nextInt();

                if (query == 1) {
                    Collections.sort(products, new sortPrice());
                } else if (query == 2) {
                    Collections.sort(products, new sortName());
                } else {
                    Collections.sort(products, new sortID());
                }
            } catch (InputMismatchException e) {
                Collections.sort(products, new sortID());
            }

            for(Product p: products) {
                System.out.println(p);
                System.out.println("______________");
            }

    }
}

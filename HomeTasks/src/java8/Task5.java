package java8;

import java8.Task4.ProductClass;

import java.util.function.BiFunction;

public class Task5 {

    public static void main(String[] args) {

        BiFunction<String, Double, ProductClass> createProduct =
                (name, price) -> new ProductClass(name, price, "General", 'A');

        ProductClass product = createProduct.apply("Laptop", 75000.0);

        System.out.println(product);
    }
}
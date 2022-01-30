package com.deo.javalearning.desingPatterns.SOLID;

import java.util.ArrayList;
import java.util.List;
import java.util.function.LongUnaryOperator;
import java.util.stream.Stream;

public class OCP {
    enum Color {
        RED, GREEN ,BLUE
    }


    enum Size {
        SMALL, MEDIUM, LARGE, YUGE
    }
    static class Product {
        public String name;
        public Color color;
        public Size size;

        public Product(String name, Color color, Size size) {
            this.name = name;
            this.color = color;
            this.size = size;
        }
    }
   static class ProductFilter {
        public Stream<Product> filterByColor(List<Product> products, Color color){
           return products.stream().filter(p -> p.color==color);
        }

        public  Stream<Product> filterBySize(List<Product> products,Size size){
            return products.stream().filter(product -> product.size==size);
        }

        public Stream<Product>filterbyColorAndSize(List<Product> products,Color color,Size size){
            return products.stream().filter(product -> product.size==size&&product.color==color);
        }
    }

    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.RED, Size.LARGE);

        List<Product> productList = List.of(apple,tree,house);
        new ProductFilter().filterByColor(productList,Color.GREEN).forEach(p->{System.out.println(p.name);});
        new ProductFilter().filterbyColorAndSize(productList,Color.GREEN,Size.LARGE).forEach(product -> System.out.println(product.name));


    }
}

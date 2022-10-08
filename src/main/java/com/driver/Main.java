package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        p.product(10,20);
        p.product(10,20,30);
        p.product(20.0, 10.0);
    }
    public static class Product{
        int product(int x, int y){
            return x + y;
        }
        int product(int x, int y, int z){
            return x + y + z;
        }
        double product(double x, double y){
            return x + y;
        }

    }
}

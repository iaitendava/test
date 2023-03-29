package org.example;

public class Test {

    public static void main(String[] args) {

        // maximum of 3
        System.out.printf("%.3s%n", "hhhh");
        System.out.printf("%.3s%n", "h");

        // minimum of 3
        System.out.printf("%3s%n", "hhhh");
        System.out.printf("%3s%n", "h");

        // exactly 3
        System.out.printf("%3.3s%n", "hhhh");
        System.out.printf("%3.3s%n", "h");
    }

    public static void testMethod() {
        System.out.println("change message");
    }
}

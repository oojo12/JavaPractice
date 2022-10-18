package com.Package;

public class Calculator {
    public static void main(String[] args) {
        Add adder = new Add();
        System.out.println(adder.add(4.0,5));

        Subtract subtractor = new Subtract();
        System.out.println(subtractor.subtract(adder.add(4,5), adder.add(4,5)));
    }
}

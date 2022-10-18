package com.Package;
import java.util.Scanner;


public class FizzBuzz {
    
    public static void main(String[] args) {

        System.out.print("Input a number: ");

        // using try-with-resources block to autoclose scanner as it implements the AutoClosable interface
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();
            
            if ((number % 5) == 0 && (number % 3) == 0)
                System.out.print("FizzBuzz");
            else if (number % 5 == 0)
                System.out.print("Fizz");
            else if (number % 3 == 0)
                System.out.print("Buzz");
            else
                System.out.print(number);
        }
    }
}

package com.Package;
import java.util.Scanner;


public class Mortgage {

    public static void main(String[] args) {

        final Byte MONTHS_IN_YEAR = 12;
        final Byte PERCENT = 100;

        // using try-with-resources block to autoclose scanner as it implements the AutoClosable interface
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Principal: ");
            int principal = scanner.nextInt();

            System.out.print("Interest Rate: ");
            float monthly_interest_rate = scanner.nextFloat() / (MONTHS_IN_YEAR * PERCENT);

            System.out.print("Term (YRs): ");
            byte term = scanner.nextByte();
            
            double compounded_interest = Math.pow((1 + monthly_interest_rate), MONTHS_IN_YEAR*term);
            System.out.print("Mortgage: $" + (principal * Math.pow(1 + monthly_interest_rate, MONTHS_IN_YEAR*term))
                                                    / (Math.pow(1 + monthly_interest_rate, MONTHS_IN_YEAR*term - 1)));
        }
    }   
}
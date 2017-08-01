package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please input positive integer less than 20 to factorial: ");
            /* Does not account for the case where user inputs numbers with spaces in between, calculates factorial for
                first integer encountered */
            int inputNum = scanner.nextInt();
            int factorialResult = NumberUtil.numFactorial(inputNum);
            System.out.println(factorialResult > 0 ? factorialResult : "Error, please input a positive number less than 20");
        } catch (InputMismatchException ime) {
            // Would normally log the exception in production, this catches exception when user inputs something other than an int
            System.out.println("Error, please input a positive integer to factorial.");
        }
    }
}

package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserire un numero da 1 a 1000: ");
        int numberToFizzBuzz = myScanner.nextInt();

        if (numberToFizzBuzz > 0 && numberToFizzBuzz <= 1000) {
            for (int i = 1; i <= 100; i++) {
                if ((i % 3 == 0) && (i % 5 == 0)) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}

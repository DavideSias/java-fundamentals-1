package org.lessons.java;

import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int kilometers;
        int age;

        System.out.println("Inserire km da percorrere: ");
        kilometers = myScanner.nextInt();
        System.out.println("Inserire età: ");
        age = myScanner.nextInt();

        double totPrice = kilometers * 0.21;
        // System.out.println(totPrice);

        if (age < 18) {
            totPrice = totPrice - totPrice * 0.2;
            System.out.println("Il prezzo del biglietto è di: " + totPrice);
        } else if (age > 65) {
            totPrice = totPrice - totPrice * 0.4;
            System.out.println("Il prezzo del biglietto è di: " + totPrice);
        } else {
            System.out.println("Il prezzo del biglietto è di: " + totPrice);
        }

    }
}

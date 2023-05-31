package org.lessons.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        DecimalFormat decimalPrice = new DecimalFormat("#.##");
        int kilometers;
        int age;
        double pricePerKm = 0.21;
        double underAgeDiscount = 0.2;
        double overAgeDiscount = 0.4;

        System.out.println("Inserire km da percorrere: ");
        kilometers = myScanner.nextInt();
        System.out.println("Inserire età: ");
        age = myScanner.nextInt();

        double totPrice = kilometers * pricePerKm;
        // System.out.println(totPrice);

        if (age < 18) {
            totPrice = totPrice - totPrice * underAgeDiscount;
        } else if (age > 65) {
            totPrice = totPrice - totPrice * overAgeDiscount;
        }

        System.out.println("Il prezzo del biglietto è di: €" + decimalPrice.format(totPrice));
    }
}

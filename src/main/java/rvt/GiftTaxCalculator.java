package rvt;

import java.util.Scanner;

public class GiftTaxCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the gift value: ");

        double giftValue;
        giftValue = scanner.nextDouble();

        double calculatedTax = 0.0;

        if (giftValue < 5000) {
            calculatedTax = 0.0;
            System.out.println("No tax");

        } else if (giftValue <= 25000) {
            double lowerLimit = 5000.0;
            double taxRate = 0.08;
            double taxAtLowerLimit = 100.0;

            calculatedTax = taxAtLowerLimit + (giftValue - lowerLimit) * taxRate;

        } else if (giftValue <= 55000) {
            double lowerLimit = 25000.0;
            double taxRate = 0.10;
            double taxAtLowerLimit = 1700.0;

            calculatedTax = taxAtLowerLimit + (giftValue - lowerLimit) * taxRate;

        } else if (giftValue <= 200000) {
            double lowerLimit = 55000.0;
            double taxRate = 0.12;
            double taxAtLowerLimit = 4700.0;

            calculatedTax = taxAtLowerLimit + (giftValue - lowerLimit) * taxRate;

        } else if (giftValue <= 1000000) {
            double lowerLimit = 200000.0;
            double taxRate = 0.15;
            double taxAtLowerLimit = 22100.0;

            calculatedTax = taxAtLowerLimit + (giftValue - lowerLimit) * taxRate;

        } else {
            double lowerLimit = 1000000.0;
            double taxRate = 0.17;
            double taxAtLowerLimit = 142100.0;

            calculatedTax = taxAtLowerLimit + (giftValue - lowerLimit) * taxRate;
        }

        System.out.println("Calculated gift tax: " + calculatedTax);
    }
}
package rvt;

import java.util.Scanner;

public class DelicacyStore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ievadi preci: ");
        String itemName = scanner.nextLine();

        System.out.print("Ievadi cenu: ");
        double itemPrice = scanner.nextDouble();

        System.out.print("Ekspress piegade (0==ne, 1==ja): ");
        int expressChoice = scanner.nextInt();

        double shippingCost = 0.0;
        double expressSurcharge = 0.0;
        double totalCost = 0.0;

        if (itemPrice < 10.00) {
            shippingCost = 2.00;
        } else {
            shippingCost = 0.00;
        }

        if (expressChoice == 1) {
            expressSurcharge = 3.00;
        }

        shippingCost = shippingCost + expressSurcharge;

        totalCost = itemPrice + shippingCost;

        System.out.println("Rekins:");
        
        System.out.println(itemName + " - " + itemPrice);

        System.out.println("Piegade    " + shippingCost);

        System.out.println("Kopa       " + totalCost);
    }
}
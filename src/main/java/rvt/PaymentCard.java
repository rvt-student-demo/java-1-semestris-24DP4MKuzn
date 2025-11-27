package rvt;

import java.util.Scanner;
import java.util.ArrayList;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        balance = openingBalance;
    }

    public String toString() {
        return ("The card has a balance of " + balance + " euros");
    }

    public void eatAffordably() {
        balance -= 2.60;
    }

    public void eatHeartily() {
        balance -= 4.60;
    }
}
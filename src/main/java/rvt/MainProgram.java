package rvt;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select test (1 - statistics, 2 - card)");
        int choice = scanner.nextInt();
        if (choice == 1) {
            TestStatistics(scanner);
        } else {
            TestCard();
        }
    }

    public static void TestStatistics(Scanner scanner) {
        Statistics allNumbers = new Statistics();
        Statistics evenNumbers = new Statistics();
        Statistics oddNumbers = new Statistics();

        boolean stop = false;
        System.out.println("Enter numbers: ");

        while (!stop) {
            int enteredNumber = scanner.nextInt();
            if (enteredNumber == -1) {
                stop = true;
                break;
            }

            allNumbers.addNumber(enteredNumber);

            if (enteredNumber % 2 == 0) {
                evenNumbers.addNumber(enteredNumber);
            } else {
                oddNumbers.addNumber(enteredNumber);
            }
        }

        System.out.println("Sum: " + allNumbers.sum());
        System.out.println("Sum of even numbers: " + evenNumbers.sum());
        System.out.println("Sum of odd numbers: " + oddNumbers.sum());
    }

    public static void TestCard() {
        PaymentCard paulCard = new PaymentCard(20);
        PaymentCard mattCard = new PaymentCard(30);

        paulCard.eatHeartily();
        mattCard.eatAffordably();

        System.out.println("Paul: " + paulCard);
        System.out.println("Matt: " + mattCard);

        paulCard.addMoney(20);
        mattCard.eatHeartily();

        
        System.out.println("Paul: " + paulCard);
        System.out.println("Matt: " + mattCard);

        paulCard.eatAffordably();
        paulCard.eatAffordably();
        mattCard.addMoney(50);

        System.out.println("Paul: " + paulCard);
        System.out.println("Matt: " + mattCard);
    }
}

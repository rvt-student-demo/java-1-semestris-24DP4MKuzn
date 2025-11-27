package rvt;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TestStatistics(scanner);
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
}

package rvt;


import java.util.Scanner;

public class NumberAnalysis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        int max = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;

        int currentNumber;

        while (true) {
            System.out.print("Ievadi pozitivu skaitli (0 vai negativs skaitlis partrauc ievadi): ");
            currentNumber = scanner.nextInt();

            if (currentNumber <= 0) {
                break;
            }

            sum = sum + currentNumber;
            count = count + 1;

            if (currentNumber > max) {
                max = currentNumber;
            }

            if (currentNumber < min) {
                min = currentNumber;
            }
        }

        scanner.close();

        if (count > 0) {
            double average = (double) sum / count;

            System.out.println("\nIevadito skaitlu skaits: " + count);
            System.out.println("Skaitlu summa: " + sum);
            System.out.printf("Videja vertiba: %.1f%n", average);
            System.out.println("Lielakais skaitlis: " + max);
            System.out.println("Mazakais skaitlis: " + min);

        } else {
            System.out.println("\nNetika ievadits neviens pozitivs skaitlis.");
        }
    }
}
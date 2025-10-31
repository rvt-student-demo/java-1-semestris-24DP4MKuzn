package rvt;

import java.util.Scanner;

public class Chapter19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an excercise to run (1 to 7): ");
        int taskToRun = scanner.nextInt();

        switch (taskToRun) {
            case 1:
                System.out.println("TASK 1: ");
                Task1_RunofIntegers(scanner);
                break;
            case 2:
                System.out.println("TASK 2: ");
                Task2_SumofSequentialIntegers(scanner);
                break;
            case 3:
                System.out.println("TASK 3: ");
                Task3_SumofSequentialSquares(scanner);
                break;
            case 4:
                System.out.println("TASK 4: ");
                Task4_SumofaRangeofSequentialIntegers(scanner);
                break;
            case 5:
                System.out.println("TASK 5: ");
                Task5_RepeatedlyEchoaWord(scanner);
                break;
            case 6:
                System.out.println("TASK 6: ");
                Task6_WordsSeparatedbyDots(scanner);
                break;
            case 7:
                System.out.println("TASK 7: ");
                Task7_OneLetterperLine(scanner);
                break;
            default:
                System.out.println("Excercise not found");
                break;
        }
    }

    public static void Task1_RunofIntegers(Scanner scanner) {
        System.out.println("Enter Start: ");
        int startNmr = scanner.nextInt();
        System.out.println("Enter End: ");
        int endNmr = scanner.nextInt();
        int i = startNmr;

        while (i <= endNmr) {
            System.out.println(i);
            i++;
        }
    }

    public static void Task2_SumofSequentialIntegers(Scanner scanner) {
        System.out.println("Enter N: ");
        int N = scanner.nextInt();
        int loopSum = 0;
        int i = 0;

        while (i <= N) {
            loopSum += i;
            i++;
        }
        System.out.println("Loop Sum = " + loopSum);

        int formulaSum = (N * (N + 1)) / 2;
        System.out.println("Formula Sum = " + formulaSum);
    }

    public static void Task3_SumofSequentialSquares(Scanner scanner) {
        System.out.println("Enter N: ");
        int N = scanner.nextInt();
        int loopSum = 0;
        int i = 1;

        while (i <= N) {
            int squareOfCurrentCount = i * i;
            loopSum += squareOfCurrentCount;
            i++;
        }

        System.out.println("Loop Sum = " + loopSum);

        int formulaSum = (N * (N + 1) * (2 * N + 1)) / 6;
        System.out.println("Formula Sum = " + formulaSum);

        int sumOfCubes = ((N * (N + 1)) / 2) * ((N * (N + 1)) / 2);
        System.out.println("Cube Sum = " + sumOfCubes);
    }

    public static void Task4_SumofaRangeofSequentialIntegers(Scanner scanner) {
        System.out.println("Enter low: ");
        int low = scanner.nextInt();
        System.out.println("Enter high: ");
        int high = scanner.nextInt();
        int sum = 0;
        int i = 0;

        while (i <= high) {
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }

    public static void Task5_RepeatedlyEchoaWord(Scanner scanner) {
        System.out.println("Enter a word: ");
        scanner.nextLine();
        String word = scanner.nextLine();
        int times = word.length();
        int i = 0;
        while (i < times) {
            System.out.println(word);
            i++;
        }
    }

    public static void Task6_WordsSeparatedbyDots(Scanner scanner) {
        System.out.println("Enter first word: ");
        scanner.nextLine();
        String firstWord = scanner.nextLine();
        System.out.println("Enter second word: ");
        String secondWord = scanner.nextLine();

        String completeString = firstWord + secondWord;
        int completeStringCount = completeString.length();
        int timesToPrintDot = 30 - completeStringCount;
        int i = 0;

        System.out.print(firstWord);
        while (i < timesToPrintDot) {
            System.out.print(".");
            i++;

            if (i == 100) {
                System.out.println("Something is wrong with the code");
                break;
            }
        }
        System.out.print(secondWord);
    }

    public static void Task7_OneLetterperLine(Scanner scanner) {
        System.out.println("Enter a word: ");
        scanner.nextLine();
        String word = scanner.nextLine();
        int loopCount = word.length();
        int i = 0;

        while (i < loopCount)
        {
            char characterToOutput = word.charAt(i);
            System.out.println(characterToOutput);
            i++;
        }
    }
}

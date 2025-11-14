package rvt;

import java.util.Scanner;
import java.util.ArrayList;

public class JMArrayList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an excercise to run (1 to 4): ");
        int taskToRun = scanner.nextInt();

        switch (taskToRun) {
            case 1:
                System.out.println("TASK 1: ");
                Task1_OnlyTheseNumbers(scanner);
                break;
            case 2:
                System.out.println("TASK 2: ");
                Task2_ListSize(scanner);
                break;
            case 3:
                System.out.println("TASK 3: ");
                Task3_OnTheList(scanner);
                break;
            case 4:
                System.out.println("TASK 4: ");
                Task4_RemoveLast(scanner);
                break;
            default:
                System.out.println("Excercise not found");
                break;
        }
    }

    public static void Task1_OnlyTheseNumbers(Scanner scanner) {
        boolean stop = false;
        ArrayList<Integer> numbers = new ArrayList<>();

        while (stop == false) {
            System.out.println("Enter a number (-1 to stop)");
            int input = scanner.nextInt();
            if (input == -1) {
                stop = true;
            } else {
                numbers.add(input);
            }
        }

        System.out.println("You entered: " + numbers);

        System.out.println("Enter indice range...");
        System.out.println("Start indice: ");
        int start = scanner.nextInt();
        System.out.println("End indice: ");
        int end = scanner.nextInt();

        System.out.println("Values in indice range: " + start + ", " + end);
        for (int i = start; i <= end; i++) {
            System.out.println(numbers.get(i));
        }
    }

    public static void Task2_ListSize(Scanner scanner) {
        ArrayList<String> names = new ArrayList<>();
        boolean stop = false;
        scanner.nextLine();

        while (stop == false) {
            System.out.println("Enter name (enter 'stop' to stop)");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                stop = true;
            } else {
                names.add(input);
            }
        }

        System.out.println("Number of names: " + names.size());
    }

    public static void Task3_OnTheList(Scanner scanner) {
        ArrayList<String> names = new ArrayList<>();
        boolean stop = false;
        scanner.nextLine();

        while (stop == false) {
            System.out.println("Enter name (enter nothing to stop)");
            String input = scanner.nextLine();
            if (input.equals("")) {
                stop = true;
            } else {
                names.add(input);
            }
        }

        System.out.println("Search for?: ");
        String searchTerm = scanner.nextLine();
        boolean nameFound = false;

        for (int i = 0; i < names.size(); i++) {
            String nameInIteration = names.get(i);
            if (nameInIteration.equals(searchTerm)) {
                System.out.println(searchTerm + " was found!");
                nameFound = true;
                break;
            }
        }

        if (nameFound == false)
        {
            System.out.println(searchTerm + " was not found!");
        }
    }

    public static void Task4_RemoveLast(Scanner scanner) {
        int[] valA = { 13, -22, 82, 17 };
        int[] valB = { 0, 0, 0, 0 };

        valB[0] = 12;
        valB[1] = 47;
        valB[2] = -57;
        valB[3] = 8;

        System.out.println("valA: "
                + valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3]);

        System.out.println("valB: "
                + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3]);

        System.out.println("sum:  "
                + (valA[0] + valB[0]) + " " + (valA[1] + valB[1]) + " "
                + (valA[2] + valB[2]) + " " + (valA[3] + valB[3]));
    }
}

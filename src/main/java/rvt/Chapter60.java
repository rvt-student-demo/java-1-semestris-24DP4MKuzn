package rvt;

import java.util.Scanner;

public class Chapter60 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an excercise to run (1 to 5): ");
        int taskToRun = scanner.nextInt();

        switch (taskToRun) {
            case 1:
                System.out.println("TASK 1: ");
                Task1_ArraySum(scanner);
                break;
            case 2:
                System.out.println("TASK 2: ");
                Task2_TwoArrays(scanner);
                break;
            case 3:
                System.out.println("TASK 3: ");
                Task3_ThreeArrays(scanner);
                break;
            case 4:
                System.out.println("TASK 4: ");
                Task4_SameSum(scanner);
                break;
            case 5:
                System.out.println("TASK 5: ");
                Task5_ReverseOrder(scanner);
                break;
            default:
                System.out.println("Excercise not found");
                break;
        }
    }

    public static void Task1_ArraySum(Scanner scanner) {
        int[] val = {0, 1, 2, 3};
        int sum = val[0] + val[1] + val[2] + val[3];
        System.out.println("Sum of all numbers = " + sum);
    }

    public static void Task2_TwoArrays(Scanner scanner) {
        int[] val = {13, -4, 82, 17};
        int[] twice = {};

        System.out.println("Original Array: "
                + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);

        twice = val;
        for (int i = 0; i < twice.length; i++) {
            twice[i] = val[i] * 2;
        }

        System.out.println("New Array: "
                + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3]);
    }

    public static void Task3_ThreeArrays(Scanner scanner) {
    int[] valA   = { 13, -22,  82,  17}; 
    int[] valB   = {-12,  24, -79, -13};
    int[] sum    = {  0,   0,   0,   0};
    
    for (int i = 0; i < sum.length; i++) {
            sum[i] = valA[i] + valB[i];
        }
 
    System.out.println( "sum: " 
        + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );
    }

    public static void Task4_SameSum(Scanner scanner) {
    int[] valA   = { 13, -22,  82,  17}; 
    int[] valB   = {  0,   0,   0,   0};
 
    valB[0] = 12;
    valB[1] = 47;
    valB[2] = -57;
    valB[3] = 8;

    System.out.println( "valA: " 
        + valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3] );
 
    System.out.println( "valB: " 
        + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3] );

    System.out.println( "sum:  " 
        + (valA[0]+valB[0]) + " " + (valA[1]+valB[1]) + " " 
        + (valA[2]+valB[2]) + " " + (valA[3]+valB[3]) );
    }

    public static void Task5_ReverseOrder(Scanner scanner) {
    int[] val = {0, 1, 2, 3}; 
    int temp = 0;
 
    System.out.println( "Original Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
 
    for (int i = 0; i < val.length - 1; i++) {
        temp = val[i];
        val[i] = val[i + 1];
        val[i + 1] = temp;
    }

    System.out.println( "Reversed Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
    }
}

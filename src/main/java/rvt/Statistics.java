package rvt;
import java.util.Scanner;
import java.util.ArrayList;

public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        count = 0;
    }

    public void addNumber(int number) {
        count++;
        sum += number;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
       return sum;
    }

    public double average() {
        return sum / count;
    }
}

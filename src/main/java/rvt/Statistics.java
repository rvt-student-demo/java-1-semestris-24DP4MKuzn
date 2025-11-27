package rvt;

import java.util.Scanner;
import java.util.ArrayList;

public class Statistics {

    private int count;

    public Statistics() {
        count = 0;
    }

    public void addNumber(int number) {
        count++;
    }

    public int getCount() {
        return count;
    }

}

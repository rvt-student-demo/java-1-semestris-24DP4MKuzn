package rvt;
import java.util.Scanner;

public class OrderChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boltPrice = 5;
        int nutPrice = 3;
        int washerPrice = 1;

        System.out.print("Skruvju skaits: ");
        int boltCount = scanner.nextInt();

        System.out.print("Uzgrieznju skaits: ");
        int nutCount = scanner.nextInt();

        System.out.print("Paplaksnu skaits: ");
        int washerCount = scanner.nextInt();
        
        boolean errorFound = false;

        if (nutCount < boltCount) {
            System.out.println("\nParbaudi pasutijumu: par maz uzgrieznju");
            errorFound = true;
        }

        if (washerCount < (boltCount * 2)) {
            System.out.println("Parbaudi pasutijumu: par maz paplaksnu");
            errorFound = true;
        }
        
        if (!errorFound) {
            System.out.println("\nPasutijums ir kartiba");
        }
        
        int totalCost;
        totalCost = (boltCount * boltPrice) + (nutCount * nutPrice) + (washerCount * washerPrice);

        System.out.println("Kopeja cena: " + totalCost);
    }
}
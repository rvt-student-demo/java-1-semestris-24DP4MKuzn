import java.util.Scanner;

public class OrderChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int BOLT_PRICE = 5;
        final int NUT_PRICE = 3;
        final int WASHER_PRICE = 1;

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
        totalCost = (boltCount * BOLT_PRICE) + (nutCount * NUT_PRICE) + (washerCount * WASHER_PRICE);

        System.out.println("Kopeja cena: " + totalCost);
    }
}
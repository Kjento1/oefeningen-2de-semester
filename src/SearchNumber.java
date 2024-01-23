import java.util.Scanner;

public class SearchNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Voer de lengte van de array in: ");
        int length = scanner.nextInt();

        int[] numbersArray = new int[length];

        System.out.println("Voer de getallen in de array in:");
        for (int i = 0; i < length; i++) {
            System.out.print("Getal " + (i + 1) + ": ");
            numbersArray[i] = scanner.nextInt();
        }

        boolean continueSearching = true;
        while (continueSearching) {


            System.out.print("Voer het getal in dat je wilt zoeken: ");
            int searchedNumber = scanner.nextInt();

            boolean found = false;
            for (int i = 0; i < length; i++) {
                if (numbersArray[i] == searchedNumber) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println(searchedNumber + " komt voor in de array.");
            } else {
                System.out.println(searchedNumber + " komt niet voor in de array.");
            }
            System.out.println("Wil je blijven zoeken? (true/false): ");
            continueSearching = scanner.nextBoolean();;
        }
        scanner.close();
    }
}
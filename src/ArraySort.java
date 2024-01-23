import java.util.Scanner;
public class ArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        System.out.println("Voer 10 getallen in van 0 - 100:");


        for (int i = 0; i < 10; i++) {
            System.out.print("Getal " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();


        }
        int lowestNumber = 100;
        int indexOfLowerNumber = 0;
        int temp;
        for (int j = 0; j < numbers.length-1; j++) {
            lowestNumber = 100;
            indexOfLowerNumber = 0;
            for (int i = j; i < numbers.length; i++) {
                if (numbers[i] < lowestNumber) {
                    lowestNumber = numbers[i];
                    indexOfLowerNumber = i;
                }
            }
            temp = numbers[j];
            numbers[j] = lowestNumber;
            numbers[indexOfLowerNumber] = temp;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
    }
}
import java.util.Scanner;
public class MeasurementsAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[72];


        for (int i = 0; i < 72; i++) {
            System.out.print("Geef getal " + i + " " + "in: ");
            numbers[i] = scanner.nextInt();

        }
        int avarage;
        int sum = 0;
        for (int i = 0; i < 72; i++) {
            sum = sum + numbers[i];
        }
        avarage = sum / numbers.length;
        System.out.println("Het gemiddelde is: " + avarage);
    }
}
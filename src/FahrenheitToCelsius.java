import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Voer je temperatuur in fahrenheit in: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = ((fahrenheit - 32) / 1.8);
        System.out.println(celsius);
    }
}

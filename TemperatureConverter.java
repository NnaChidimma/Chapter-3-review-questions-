import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 'C' to convert to Celsius, or 'F' to convert to Fahrenheit: ");
        char choice = scanner.next().charAt(0);

        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        if (choice == 'C' || choice == 'c') {
            double celsius = (temperature - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is: " + celsius);
        } else if (choice == 'F' || choice == 'f') {
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
        } else {
            System.out.println("Invalid choice!");
        }
    }
}

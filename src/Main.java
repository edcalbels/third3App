import java.util.Scanner;

public class third3App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Convert days to weeks and days.");
            System.out.println("2. Convert temperature from Celsius to Fahrenheit and Kelvin.");
            System.out.println("3. Exit.");
            System.out.print("Enter your choice (1, 2, or 3): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    convertDaysToWeeksAndDays(scanner);
                    break;
                case 2:
                    convertCelsiusToFahrenheitAndKelvin(scanner);
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    break;
            }
        }
    }

    private static void convertDaysToWeeksAndDays(Scanner scanner) {
        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();
        if (days <= 0) {
            System.out.println("The number of days must be positive. Exiting this option.");
            return;
        }

        int weeks = days / 7;
        int remainingDays = days % 7;
        System.out.println(days + " days is " + weeks + " weeks and " + remainingDays + " days.");
    }

    private static void convertCelsiusToFahrenheitAndKelvin(Scanner scanner) {
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        if (celsius == -1) {
            System.out.println("Exiting this option.");
            return;
        }

        double fahrenheit = 1.8 * celsius + 32.0;
        double kelvin = celsius + 273.16;
        System.out.printf("Celsius: %.2f, Fahrenheit: %.2f, Kelvin: %.2f%n", celsius, fahrenheit, kelvin);
    }
}

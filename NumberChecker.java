import java.util.Scanner;

    public class NumberChecker {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println("Your number " + number + " is even.");
            } else {
                if (isPrime(number)) {
                    System.out.println("Your number " + number + " is odd, and it is a prime number.");
                } else {
                    System.out.println("Your number " + number + " is odd, and it is a composite.");
                }
            }
        }

        // Method to check if a number is prime
        public static boolean isPrime(int num) {
            if (num <= 1) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        }
    }



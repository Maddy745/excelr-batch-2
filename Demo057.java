import java.util.Scanner;

public class Demo057 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            int lastDigit = number % 10;

     
            int firstDigit = number;
            while (firstDigit >= 10) {
                firstDigit /= 10;
            }

            int sum = firstDigit + lastDigit; 

            System.out.println("Sum of the first and last digits: " + sum);
        }
    }
}

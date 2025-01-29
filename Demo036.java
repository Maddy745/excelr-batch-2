import java.util.Scanner;

public class Demo036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        int biggestNumber = findBiggestNumber(number1, number2, number3);
        System.out.println("The biggest number among " + number1 + ", " + number2 + ", and " + number3 + " is " + biggestNumber + ".");

        scanner.close();
    }

    public static int findBiggestNumber(int number1, int number2, int number3) {
        int max = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        return max;
    }
}
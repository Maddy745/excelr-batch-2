import java.util.Scanner;
public class Demo035{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");

        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int greatest = findBiggerNumber(num1, num2);
        System.out.println("The bigger number between " + num1 + " and " + num2 + " is " + greatest + ".");

        scanner.close();
    }
        public static int findBiggerNumber(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }
    }

    
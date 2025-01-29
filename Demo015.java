import java.util.Scanner;

public class Demo015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number (b): ");
        int b = scanner.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);
        int[] swappedValues = swap(a, b);
        a = swappedValues[0];
        b = swappedValues[1];
        System.out.println("After swapping: a = " + a + ", b = " + b);

        scanner.close();
    }

    public static int[] swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};
    }
}
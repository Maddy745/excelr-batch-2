public class Demo048 {
    public static void main(String[] args) {
        int number = 12345;
        int sum = calculateSumOfDigits(number);
        System.out.println("Sum of digits in " + number + " is: " + sum);
    }

    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10; 
            number /= 10;       
        }
        return sum;
    }
}
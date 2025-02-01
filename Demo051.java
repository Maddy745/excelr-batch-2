public class Demo051 {
    public static void main(String[] args) {
        int number = 12321;
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10; 
            reversed = reversed * 10 + digit; 
            number /= 10; 
        }

        return originalNumber == reversed;
    }
}

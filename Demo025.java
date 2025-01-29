public class Demo025 {
    public static String reverse(String input) {
        if (input == null) {
            return null;
        }
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverse(original);
        
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
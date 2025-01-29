public class Demo043 {
    public static void main(String[] args) {
        char upperCase = 'A'; 
        char lowerCase = convertToLowerCase(upperCase);
        System.out.println("Uppercase: " + upperCase);
        System.out.println("Lowercase: " + lowerCase);
    }

    public static char convertToLowerCase(char upperCase) {
        if (upperCase >= 'A' && upperCase <= 'Z') {
            return (char) (upperCase + 'a' - 'A');
        } else {
            return upperCase; 
        }
    }
}
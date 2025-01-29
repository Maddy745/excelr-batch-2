public class Demo042 {
    public static void main(String[] args) {
        char lowerCase = 'a'; 
        char upperCase = convertToUpperCase(lowerCase);
        System.out.println("Lowercase: " + lowerCase);
        System.out.println("Uppercase: " + upperCase);
    }

    public static char convertToUpperCase(char lowerCase) {
        if (lowerCase >= 'a' && lowerCase <= 'z') {
            return (char) (lowerCase - 'a' + 'A');
        } else {
            return lowerCase; 
        }
    }
}
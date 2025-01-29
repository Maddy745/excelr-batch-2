public class LTCode007 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) {
        LTCode007 solution = new LTCode007();
        
        int[] digits1 = {1, 2, 3};
        int[] result1 = solution.plusOne(digits1);
        printArray(result1); // Output: [1, 2, 4]

        int[] digits2 = {4, 3, 2, 1};
        int[] result2 = solution.plusOne(digits2);
        printArray(result2); // Output: [4, 3, 2, 2]

        int[] digits3 = {9};
        int[] result3 = solution.plusOne(digits3);
        printArray(result3); // Output: [1, 0]
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
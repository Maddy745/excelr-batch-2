public class Demo077 {
    public static void main(String[] args) {
        int[] originalArr = {1, 2, 3, 4, 5};
        int[] copiedArr = new int[originalArr.length];

        for (int i = 0; i < originalArr.length; i++) {
            copiedArr[i] = originalArr[i];
        }

        System.out.println("Copied array elements: ");
        for (int element : copiedArr) {
            System.out.print(element + " ");
        }
    }
}


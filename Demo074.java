class sortArray {
    void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {  // Fixed: j < arr.length
                int temp = 0;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}

public class Demo074 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1};
        sortArray sorter = new sortArray();
        sorter.sort(arr);
    }
}

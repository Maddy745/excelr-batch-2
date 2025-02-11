
import java.util.HashSet;
import java.util.Set;

public class Demo073 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 3, 2, 6, 7, 8, 6, 9};
        
        Set<Integer> duplicates = new HashSet<>();
        
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    duplicates.add(array[i]);
                    break;
                }
            }
        }
        
        System.out.println("Duplicate elements in the array: " + duplicates);
    }
}

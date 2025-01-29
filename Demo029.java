import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo029{
    public static void main(String[] args) {
        // Create an array of friend names
        String[] friendsArray = new String[10];
        
    
        friendsArray[0] = "Alice";
        friendsArray[1] = "Bob";
        friendsArray[2] = "Cathy";
        friendsArray[3] = "David";
        friendsArray[4] = "Ella";
        friendsArray[5] = "Frank";
        friendsArray[6] = "Grace";
        friendsArray[7] = "Hannah";
        friendsArray[8] = "Ian";
        friendsArray[9] = "Jack";

        List<String> friendsList = new ArrayList<>();
        Collections.addAll(friendsList, friendsArray);
        
     
        System.out.println("List of friends:");
        for (String friend : friendsList) {
            System.out.println(friend);
        }

        System.out.println("\nSorted list of friends:");
        Collections.sort(friendsList);
        for (String friend : friendsList) {
            System.out.println(friend);
        }
    }
}
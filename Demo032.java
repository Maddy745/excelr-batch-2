import java.util.*;

class HashSetStringDemo {
    void hashSetMethod() {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Chennai");
        hashSet.add("Kolkata");
        hashSet.add("Agra");
        hashSet.add("Delhi");
        hashSet.add("Hyderabad");
        hashSet.remove("Vizag");
        
            System.out.println(hashSet);
        }
    }


public class Demo032 {
    public static void main(String[] args) {
        HashSetStringDemo obj = new HashSetStringDemo();
        obj.hashSetMethod();
    }
}
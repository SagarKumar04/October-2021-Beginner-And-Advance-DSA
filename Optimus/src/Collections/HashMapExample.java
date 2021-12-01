package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> rollNumberMap = new HashMap<Integer, String>();

        rollNumberMap.put(1, "Ranjeet");
        rollNumberMap.put(2, "Akshay");
        rollNumberMap.put(3, "Gourav");
        rollNumberMap.put(4, "Ranjeet");
        rollNumberMap.put(4, "Sagar");

        System.out.println(rollNumberMap);

        String name = rollNumberMap.get(3);
        System.out.println(name);

        boolean isPresent = rollNumberMap.containsKey(1);
        System.out.println(isPresent);

        isPresent = rollNumberMap.containsKey(100);
        System.out.println(isPresent);
    }
}

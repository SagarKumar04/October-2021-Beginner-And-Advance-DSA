package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(0);
        arrayList.add(1);
        System.out.println("Contents: " + arrayList);

        Integer value = 0;
        arrayList.remove(value);
        System.out.println("Contents: " + arrayList);

        arrayList.remove(value);
        System.out.println("Contents: " + arrayList);
    }
}

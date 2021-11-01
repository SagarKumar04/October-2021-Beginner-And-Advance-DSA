package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {
        Integer arr[] = {1, 2, 3, 4, 5};
        List<Integer> arrayList = new ArrayList<Integer>();

        System.out.println("Contents of arrayList: " + arrayList);
        System.out.println("Converting array to arrayList...");

        arrayList = Arrays.asList(arr);
        System.out.println("Contents of arrayList: " + arrayList);
    }
}
package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {
        List<Float> arrayList = new ArrayList<Float>();
        for(int i = 0; i < 5; i++) {
            float element = (float)Math.random() * 10;
            arrayList.add(element);
        }

        System.out.println("Contents of arrayList: " + arrayList);

        int size = arrayList.size();
        Float array[] = new Float[size];
        array = arrayList.toArray(array);

        System.out.println("Elements of the array: ");
        for(Float element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

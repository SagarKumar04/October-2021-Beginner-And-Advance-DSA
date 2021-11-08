package RevisionSessionNov8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {
    public static void main(String[] args) {
        List<ArrayList<Integer>> mainArrayList = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);

        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        arrayList2.add(7);
        arrayList2.add(4);
        arrayList2.add(10);
        arrayList2.add(17);

        ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
        arrayList3.add(100);
        arrayList3.add(199);
        arrayList3.add(110);
        arrayList3.add(121);
        arrayList3.add(174);

        mainArrayList.add(arrayList1);
        mainArrayList.add(arrayList2);
        mainArrayList.add(arrayList3);

        System.out.println("arrayList1: " + arrayList1);
        System.out.println("arrayList2: " + arrayList2);
        System.out.println("arrayList3: " + arrayList3);
        System.out.println("mainArrayList: " + mainArrayList);

        System.out.println("All the elements: ");
        int sum = 0;
        for(ArrayList<Integer> list : mainArrayList) {
            System.out.println("List: " + list);
            for(Integer element : list) {
                sum = sum + element;
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("Sum: " + sum);
    }
}

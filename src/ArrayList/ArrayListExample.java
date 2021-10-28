package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        //List<Object> arrayListName = new ArrayList<Object>();
        List<Integer> arrayList = new ArrayList<Integer>();

        //Finds size of the ArrayList
        int size = arrayList.size();
        System.out.println("Size of arrayList: " + size);

        //Adding elements to the ArrayList
        arrayList.add(3);
        arrayList.add(11);

        for (int i = 0; i < 5; i++) {
            int element = i * 5;
            arrayList.add(element);
        }

        arrayList.add(1);

        //Printing the entire ArrayList
        System.out.println("Contents of arrayList: " + arrayList);

        size = arrayList.size();
        System.out.println("Size of arrayList: " + size);

        //Accessing the elements of ArrayList with get() method
        System.out.println("Each element of arrayList (using for loop): ");
        for (int i = 0; i < size; i++) {
            float element = arrayList.get(i);
            System.out.print(element + " ");
        }
        System.out.println();

        //advance for loop
        System.out.println("Each element of arrayList (using advance for loop): ");
        for (Integer element : arrayList) {
            System.out.print(element + " ");
        }
        System.out.println();

        //removing using index
        arrayList.remove(2);
        System.out.println("Contents of arrayList: " + arrayList);

        //removing using value
        Integer value = 1;
        arrayList.remove(value);
        System.out.println("Contents of arrayList: " + arrayList);

        //creating a new ArrayList containing the same elements as arrayList
        List<Integer> arrayListToBeRemoved = new ArrayList<Integer>(arrayList);

        //removing all the elements of arrayList
        arrayList.removeAll(arrayListToBeRemoved);
        System.out.println("Contents of arrayList: " + arrayList);

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println("Contents of arrayList: " + arrayList);

        //adding element to the ArrayList using index
        arrayList.add(1, 10);
        System.out.println("Contents of arrayList: " + arrayList);
    }
}
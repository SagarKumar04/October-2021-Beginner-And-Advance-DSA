package RevisionSessionNov8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample1 {
    public static void main(String[] args) {
        /*
        Syntax:
        List<Object-Type> array-list-name = new ArrayList<Object-Type>();
         */
        List<Integer> arrayList = new ArrayList<Integer>();
        System.out.println("Size of ArrayList: " + arrayList.size());
        System.out.println("Contents of ArrayList: " + arrayList);

        //adds 17 at the end of the arrayList
        arrayList.add(17);

        //adds 93 at the end of the arrayList
        arrayList.add(93);

        //adds 103 at the end of the arrayList
        arrayList.add(103);

        //adds 10 to the arrayList at index 1
        arrayList.add(1, 10);

        //adds 20 to the arrayList at index 5
        arrayList.add(4, 20);

        //removes 103 from the arrayList
        Integer elementToBeRemoved = 103;
        arrayList.remove(elementToBeRemoved);

        //remove element at index 1
        arrayList.remove(1);

        //adds 93 to the arrayList
        arrayList.add(93);

        //removes 93 from the arrayList
        elementToBeRemoved = 93;
        arrayList.remove(elementToBeRemoved);

        //add 5 random elements in the arrayList
        for(int i = 0; i < 5; i++) {
            int random = (int)(Math.random() * 100);
            arrayList.add(i, random);
        }

        System.out.println("Size of ArrayList: " + arrayList.size());
        System.out.println("Contents of ArrayList: " + arrayList);

        //'for' loop
        System.out.println("Elements of the arrayList are (using 'for' loop: ");
        int sum = 0;
        for(int i = 0; i < arrayList.size(); i++) {
            int element = arrayList.get(i);
            sum = sum + element;
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("Sum: " + sum);

        //for-each loop
        sum = 0;
        System.out.println("Elements of the arrayList are (using 'for-each' loop: ");
        for(Integer element : arrayList) {
            sum = sum + element;
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("Sum: " + sum);

        //converting ArrayList to Array
        Integer array[] = new Integer[arrayList.size()];
        array = arrayList.toArray(array);
        System.out.println("Elements of the array: ");
        for(Integer element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

        //converting Array to ArrayList
        List<Integer> convertedList = new ArrayList<Integer>();
        convertedList = Arrays.asList(array);
        System.out.println("convertedList: " + convertedList);
    }
}

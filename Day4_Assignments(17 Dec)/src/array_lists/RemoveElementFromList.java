package array_lists;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementFromList {


    public static void main(String[] args) {

//        int[] myArray = { 11, 2, 3, 8, 12, 28, 45, 66, 22 };
        List<Integer> myList = new ArrayList<>();
        myList.add(11);
        myList.add(2);
        myList.add(3);
        myList.add(8);
        myList.add(12);
        myList.add(28);
        myList.add(45);
        myList.add(66);
        myList.add(22);
        int indexToRemove = 4;
        System.out.println("Array before removing element: ");
        System.out.println(myList);

        myList.remove(indexToRemove);

        System.out.println();
        System.out.println("Array after removing element: ");
        System.out.println(myList);

    }

}

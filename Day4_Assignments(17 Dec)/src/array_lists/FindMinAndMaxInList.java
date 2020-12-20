package array_lists;

import java.util.ArrayList;
import java.util.List;

public class FindMinAndMaxInList {

    public static void main(String[] args) {

//        int[] myArray = { 11, 78, 43, 23, 8888, 66, 2, 77, 124, -555, 775 };

        List<Integer> myList = new ArrayList<>();
        myList.add(11);
        myList.add(78);
        myList.add(43);
        myList.add(23);
        myList.add(8888);
        myList.add(66);
        myList.add(2);
        myList.add(77);
        myList.add(124);
        myList.add(-555);
        myList.add(775);
        int max = myList.get(0);
        int min = myList.get(0);

        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) > max) {
                max = myList.get(i);
            }
            if (myList.get(i) < min) {
                min = myList.get(i);
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}

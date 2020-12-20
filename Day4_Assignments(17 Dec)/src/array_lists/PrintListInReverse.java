package array_lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintListInReverse {

    public static void main(String[] args) {
//        List<Integer> myList = Arrays.asList(10, 566, 78, 24, 23, 54, 545, 666, 22, 11, 4);
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(566);
        myList.add(78);
        myList.add(24);
        myList.add(23);
        myList.add(54);
        myList.add(545);
        myList.add(666);
        myList.add(22);
        myList.add(11);
        myList.add(4);

        System.out.println("The array elements in reverse order are: ");

        for (int i = myList.size() - 1; i >= 0; i--) {
            System.out.print(myList.get(i) + " ");
        }
    }

}
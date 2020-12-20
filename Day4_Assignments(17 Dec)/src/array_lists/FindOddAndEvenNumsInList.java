package array_lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindOddAndEvenNumsInList {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(13, 16, 33, 22, 26, 55, 46, 31, 8, 444);

        List<Integer> evenNumbers = new ArrayList<>(myList.size());


        for (int i = 0; i < myList.size(); i++) {

            if (myList.get(i) % 2 == 0) {
                evenNumbers.add(myList.get(i));

            }
        }


        System.out.println("Even numbers array : ");
        System.out.println(evenNumbers);

        /*----------------------------------------------------------------------------------------------*/
        List<Integer> oddNumbers = new ArrayList<>(myList.size());
//        int oddNumbersIndex = 0;

        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) % 2 != 0) {
                oddNumbers.add(myList.get(i));

            }
        }
        System.out.println();
        System.out.println("Odd numbers array : ");
        System.out.println(oddNumbers);


    }

}

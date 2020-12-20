package array_lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinalPalindromesInAList {

    public static void main(String[] args) {

//
//        List<Integer> myList = Arrays.asList(121, 45, 252, 33, 56, 565, 32, 666);
        List<Integer> myList = new ArrayList<>();
        myList.add(121);
        myList.add(45);
        myList.add(252);
        myList.add(33);
        myList.add(56);
        myList.add(565);
        myList.add(32);
        myList.add(666);


        for (int i = 0; i < myList.size(); i++) {
            String element = String.valueOf(myList.get(i));
            if (isPalindrome(element) == true) {
                System.out.println(myList.get(i));

            }
        }
    }

    public static boolean isPalindrome(String b) {

        if (new StringBuffer(b).reverse().toString().equals(b)) {
            return true;
        } else {
            return false;
        }
    }

}


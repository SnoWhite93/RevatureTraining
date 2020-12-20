package lists_play_around;

import java.util.*;

public class TryListsMethods {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(123);
        myList.add(344);
        myList.add(12);
        myList.add(12);
        myList.add(12);
        myList.add(3234);
        myList.add(776);
        myList.add(12);
        myList.add(12);
//        myList.add(null);

        System.out.println("mylist = " + myList);

        List allList = new ArrayList();
        allList.add("What");
        allList.add(43434);
        allList.add(5433.44);
        allList.add(3423424243L);
        allList.add(false);

        System.out.println("allList = " + allList);

        myList.add(3, 446);
        System.out.println("myList after i added 446 = " + myList);
        myList.set(5, 11);
        System.out.println("myList after i set 11 = " + myList );// replaces value at index 5 with 11

        System.out.println("my list size = " + myList.size());
        System.out.println("value at index 4 = " + myList.get(4));

        myList.remove(4);
        System.out.println("myList after i remove element from index 4 = " + myList);

        Boolean x = false;
        allList.remove(x);
        System.out.println("allList after i remove false = " + allList);

        Integer i = 12;
        myList.remove(i);
        System.out.println("myList after i remove i = " + myList);
        while (myList.remove(i)) {}
        System.out.println("my list after i remove all occurance of i = " + myList);

        System.out.println("myList.contains(344) : " + myList.contains(344));
        System.out.println("myList.contains(555) : " + myList.contains(555));

        //traversing through list

        System.out.println("\nTraversing using loop: ");
        for(int a =0; a < myList.size(); a++) {
            System.out.println(myList.get(a));
        }

        System.out.println("Using for each loop : ");
        for(Integer a : myList) {
            System.out.println(a + " ");
        }


        Collections.reverse(myList);
        System.out.println("myList after reverse = " + myList);
        Collections.shuffle(myList);
        System.out.println("myList after shuffle = " + myList);
        Collections.sort(myList); // works only if there is no null in list
        System.out.println("myList after sort = " + myList);
        Collections.replaceAll(myList,344, 11);
        System.out.println("myList after replace = " + myList);
        Collections.sort(myList);
        System.out.println("myList after sort = " + myList);

        // Binary search
        System.out.println("binary search for 11 : " + Collections.binarySearch(myList, 11));
        System.out.println("binary search 44 " + Collections.binarySearch(myList, 44));

        List<Integer> myList2 = new ArrayList<>();
        myList2.add(33);
        myList2.add(125);
        myList2.add(65);
        myList2.add(900);

        System.out.println("myList2 is = " + myList2);
        myList2.addAll(myList);
        System.out.println("myList2 after adding myList = " + myList2);
//        myList2.retainAll(myList);
//        System.out.println("myList2 after retained myList = " + myList2);
//        myList2.removeAll(myList);
//        System.out.println("myList2 after removing myList = " + myList2);

        System.out.println("Iterating through myList2 using Iterator ");

        Iterator<Integer> iterator = myList2.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }





    }


}

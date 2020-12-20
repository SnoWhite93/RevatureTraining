package lists_play_around;

import java.util.*;

public class QueueLinkedList {

	public static void main(String[] args) {
		
		Queue<Object> queueLi1=new LinkedList<>();
		queueLi1.add("hello");
		queueLi1.add(2222);
		queueLi1.add(true);
		queueLi1.add(1212222);
		queueLi1.add(2222.22333);
		queueLi1.add(222222222222222222L);

		System.out.println("queueLi1 = "+queueLi1);
		
		
		Queue<Integer> queueLi2=new LinkedList<>();
		queueLi2.add(22);
		queueLi2.add(22);
		queueLi2.add(122);
		queueLi2.add(null);
		queueLi2.add(null);
		queueLi2.add(220);
		queueLi2.add(221);
		queueLi2.add(22);
		queueLi2.add(null);
		queueLi2.add(42);
		queueLi2.add(22);
		queueLi2.add(null);
		System.out.println("queueLi2 = "+queueLi2);
		
//		queueLi2.add(0, 333); cannot add element at specific index

//		queueLi2.set(0, 444); cannot replace element at specific index

		System.out.println("queueLi2.size() = "+ queueLi2.size());
//		System.out.println("li2.get(3) : "+queueLi2.get(3)); cannot get element by index
		System.out.println("queueLi2.peak() : "+queueLi2.peek()); // we can only fetch the first element

		queueLi2.remove(); //removes first element
		System.out.println("queueLi2 after queueLi2.remove() = "+queueLi2);
		queueLi2.remove(122); //looks for the element not index
		System.out.println("queueLi2 after queueLi2.remove(122) = "+queueLi2);

		Integer i=22;
		queueLi2.remove(i); //here it removes first occurance of the value i;
		System.out.println("queueLi2 after queueLi2.remove(i) = "+queueLi2);
		while(queueLi2.remove(i)) {} //it will remove all occurance of i
		System.out.println("queueLi2 after while(queueLi2.remove(i)){} = "+queueLi2);

		System.out.println("queueLi2.contains(100) : "+queueLi2.contains(100));
		System.out.println("queueLi2.contains(42) : "+queueLi2.contains(42));

//		System.out.println("\nTraversing using for loop");
//		for (int j = 0; j < queueLi2.size(); j++) {
//			System.out.print(queueLi2.poll(j)+" "); /// cannot take index
//		}

		System.out.println("\n\nTraversing using for-each loop");
		for (Integer j : queueLi2) {
			System.out.print(j+" ");
		}
		System.out.println();

//		do not apply to Queue

//		Collections.reverse(Queue<Integer> queueLi2);
//		System.out.println("\nli2  after Collections.reverse(li2); "+queueLi2);
//		Collections.shuffle(queueLi2);
//		System.out.println("li2  after Collections.shuffle(li2); "+queueLi2);
//		Collections.replaceAll(queueLi2, null, -1);
//		System.out.println("li2  after Collections.replaceAll(li2, null, -1); "+queueLi2);
//		Collections.sort(queueLi2); //ascending but it shouldnt have null values
//		System.out.println("li2  after Collections.sort(li2); "+queueLi2);
//		Collections.sort(queueLi2, Collections.reverseOrder()); //descending order
//		System.out.println("li2  after Collections.sort(li2, Collections.reverseOrder()); "+queueLi2);
//		//for binarySearch Collection should and must be sorted in ascending order
//		Collections.sort(queueLi2);
//		System.out.println("li2  after Collections.sort(li2); for doing binarySearch "+queueLi2);
//		System.out.println("Collections.binarySearch(li2, 100) : "+Collections.binarySearch(queueLi2, 100));
//		System.out.println("Collections.binarySearch(li2, 42) : "+Collections.binarySearch(queueLi2, 42));




		List<Integer> queueLi3=new ArrayList<>(queueLi2);
		System.out.println("queueLi3 = "+queueLi3);
		queueLi3.addAll(queueLi2);
		System.out.println("queueLi3 = "+queueLi3);
		queueLi3.add(100);
		queueLi3.add(300);
		queueLi3.add(600);
		queueLi3.add(99);
		System.out.println("queueLi3 = "+queueLi3);
		System.out.println("queueli2 = "+queueLi2);
//		queueLi3.retainAll(queueLi2);
//		System.out.println("queueLi3 after retainAll = "+queueLi3);
		queueLi3.removeAll(queueLi2);
		System.out.println("queueLi3 after removeAll = "+queueLi3);


		System.out.println("\nIterating queueLi3 using Iterator");
		Iterator<Integer> it=queueLi3.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
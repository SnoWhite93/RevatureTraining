package threads_demo2;

import java.util.ArrayList;
import java.util.List;

public class MainWithThreads {
	public static void main(String[] args) throws Exception {

		TotalCount totalCount = new TotalCount();
		int howMany = 10;
		List<Thread> threads = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			Thread thread = new Thread(new CountingRunnable(howMany, totalCount));
			thread.start();
			threads.add(thread);
		}

		for (Thread thread : threads) {
			thread.join();
		}
		System.out.println("Final result: " + totalCount.getCounter());
	}
}

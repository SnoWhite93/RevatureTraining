package threads_demo2;

public class MainNoThreads {
	public static void main(String[] args) {

		TotalCount totalCount = new TotalCount();
		int howMany = 10;

		for (int j = 0; j < 20; j++) {
			String name = Thread.currentThread().getName();
			for (int i = 0; i < howMany; i++) {
				int before = totalCount.getCounter();
				totalCount.setCounter(before + 1);
				int after = totalCount.getCounter();
				System.out.println(name + ": [" + i + "/" + howMany + "] Before: " + before + " After: " + after);
			}
		}
		
		System.out.println("Final result: " + totalCount.getCounter());
	}
}

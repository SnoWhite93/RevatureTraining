package threads_demo2;

public class CountingRunnable implements Runnable {

	private int howMany;
	private TotalCount totalCount;

	public CountingRunnable(int howMany, TotalCount totalCount) {
		this.howMany = howMany;
		this.totalCount = totalCount;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < howMany; i++) {
			int before = totalCount.getCounter();
			totalCount.setCounter(before + 1);
			int after = totalCount.getCounter();
			System.out.println(name + ": [" + i + "/" + howMany + "] Before: " + before + " After: " + after);
		}

	}

}

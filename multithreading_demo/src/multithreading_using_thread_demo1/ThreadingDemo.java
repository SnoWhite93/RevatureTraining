package multithreading_using_thread_demo1;

public class ThreadingDemo extends Thread {
   
	public void run() 
	{
		try {
			System.out.println("The thread " + Thread.currentThread().getId() + " is running");
		} catch (Exception e) {
			System.out.println("Exception caught");
		}
	}
}

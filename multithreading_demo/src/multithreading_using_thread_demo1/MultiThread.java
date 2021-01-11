package multithreading_using_thread_demo1;

public class MultiThread {
    
	public static void main(String[] args) {
		
		int x = 22; 
		 for(int i = 0; i < x; i++) {
			ThreadingDemo myThread = new ThreadingDemo();
//			myThread.run();
			myThread.start();
			 
		 }
	}
}

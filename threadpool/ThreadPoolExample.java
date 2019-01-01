import java.util.concurrent.*;

class ThreadPoolEx implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Started");
		try {

			Thread.sleep(2000);
		} catch (Exception e) {

		}
		System.out.println(Thread.currentThread().getName() + " Ended");
	}
}

public class ThreadPoolExample {

	public static void main(String[] arg) {
			// change service type check observe output
		ExecutorService executorService = Executors.newScheduledThreadPool(5);
//		ExecutorService executorService = Executors.newSingleThreadExecutor();
//		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		for (int i = 0; i < 10; i++) {
 			// using ThreadPool
 			executorService.execute(new ThreadPoolEx());
 			// normal thread execution
// 			Thread t = new Thread(new ThreadPoolEx());
//			t.start();
 		}
 		executorService.shutdown();
 		while (!executorService.isTerminated()) {
 		}
 		System.out.println("All Thread Successfully Execute");
 	}
}

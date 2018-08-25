//package com.thread.threadpool;
//
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//public class MainClass {
//
//	public static void main(String[] arg) {
//			// change service type check observe output
////		ExecutorService executorService = Executors.newScheduledThreadPool(5);
////		ExecutorService executorService = Executors.newSingleThreadExecutor();
//		ExecutorService executorService = Executors.newFixedThreadPool(5);
//		
//		
//		for (int i = 0; i < 10; i++) {
//
//			// check the difference
//
//			// using ThreadPool
//			executorService.execute(new ThreadPoolEx());
//
////			// normal thread execution
////			Thread t = new Thread(new ThreadPoolEx());
////			t.start();
//		}
//		executorService.shutdown();
//		while (!executorService.isTerminated()) {
//		}
//		System.out.println("All Thread Successfully Execute");
//	}
//}

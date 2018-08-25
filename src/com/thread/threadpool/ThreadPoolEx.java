package com.thread.threadpool;

public class ThreadPoolEx implements Runnable {

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

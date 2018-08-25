package com.thread.deadlock;

public class Thread2 implements Runnable {

	Massage massage1, massage2;

	public Thread2(Massage massage1, Massage massage2) {
		this.massage1 = massage1;
		this.massage2 = massage2;
	}

	@Override
	public void run() {

		synchronized (massage2) {
			try {
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName() + " : Lock on object 2");
			} catch (Exception e) {
			}
			System.out.println(Thread.currentThread().getName() + " : Waiting for object 1");
			synchronized (massage1) {
				try {
					System.out.println(Thread.currentThread().getName() + " : Wating for Lock Object 1 & Object 2");
				} catch (Exception e) {
				}
			}
		}
	}
}

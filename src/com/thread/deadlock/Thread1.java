package com.thread.deadlock;

public class Thread1 implements Runnable {

	Massage massage1, massage2;

	public Thread1(Massage massage1, Massage massage2) {
		this.massage1 = massage1;
		this.massage2 = massage2;
	}

	@Override
	public void run() {

		synchronized (massage1) {
			try {
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName() + " : Lock on object 1");
			} catch (Exception e) {
			}
			System.out.println(Thread.currentThread().getName() + " : Waiting for object 2");
			synchronized (massage2) {
				try {
					System.out.println(Thread.currentThread().getName() + " : Wating for Lock Object 1 & Object 2");
				} catch (Exception e) {
				}
			}
		}
	}
}

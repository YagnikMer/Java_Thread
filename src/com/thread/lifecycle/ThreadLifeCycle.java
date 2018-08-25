package com.thread.lifecycle;

public class ThreadLifeCycle extends Thread {

	String name;

	public ThreadLifeCycle() {
		System.out.println("NEW");
	}

	public ThreadLifeCycle(String name) {
		System.out.println(name + " : NEW");
		this.name = name;
	}

	public void run() {
		System.out.println("RUNNABLE");
		for (int i = 1; i <= 10; i++) {

			try {
				if (null != name)
					System.out.println(name + " RUNNING : " + i);
				else
					System.out.println("RUNNING : " + i);
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("DEAD");
	}

	public void start() {
		Thread t;
		if (name != null)
			t = new Thread(this, name);
		else
			t = new Thread(this);
		System.out.println("START");

		t.start();
	}
}

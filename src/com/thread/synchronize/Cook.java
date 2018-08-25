package com.thread.synchronize;

public class Cook implements Runnable {

	private Order order;
	public Cook(Order order)
	{
		this.order = order;
	}
	public void run() {
		
		
			System.out.println(Thread.currentThread().getName() +" order Receiverd");
			
			try
			{
				Thread.sleep(10000);
				synchronized (order) {
					System.out.println(Thread.currentThread().getName()+" Preaparing Order");
					order.notifyAll();	
				}
			}
			catch(Exception e)
			{
			}	
			System.out.println(Thread.currentThread().getName()+" Order Ready");
	
	};
}

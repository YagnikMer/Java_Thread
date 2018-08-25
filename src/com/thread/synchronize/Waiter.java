package com.thread.synchronize;

public class Waiter implements Runnable {

	private Order order;
	public Waiter(Order order)
	{
		this.order = order;
	}
	public void run() {
		
		synchronized (order) {
			System.out.println(Thread.currentThread().getName() + " Place order Successfully");
			try
			{
					System.out.println(Thread.currentThread().getName() +" Waiting of order ready..!!");
					order.wait();
			}
			catch(Exception e)
			{
				
			}	
			System.out.println(Thread.currentThread().getName() +" Order Served");
		}		
	};
}

package com.thread.customer_producer;

public class Customer implements Runnable {
	
	StockManager stock;
	

	public Customer(StockManager stock) {
		this.stock = stock;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			String product = stock.getProduct();
			try {
				
				Thread.sleep(10000);
			} catch (Exception e) {
			}
			System.out.println("Customer : "+product);
		}
	}
}

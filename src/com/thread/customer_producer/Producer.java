package com.thread.customer_producer;

public class Producer implements Runnable {

	StockManager stock;
	String[] fruits = {
			"apple",
			"banana",
			"grape",
			"jack fruit",
			"water belon",
			"guave",
			"custed apple",
			"dragen fruit",
			"sapota",
			"butter fruit"
			};

	public Producer(StockManager stock) {
		this.stock = stock;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Producer : "+fruits[i]);
			stock.setProduct(fruits[i]);
			try {
				Thread.sleep(3000);
			} catch (Exception e) {}
		}
	}
}

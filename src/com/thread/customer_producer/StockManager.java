package com.thread.customer_producer;

public class StockManager {
	private String product;
	private boolean isAvaiable;

	public synchronized String getProduct() {
		while (isAvaiable == false) {
			try {
				wait();
			} catch (Exception e) {

			}		
		}
		isAvaiable = false;
		notifyAll();
		return product;
	}

	public synchronized void setProduct(String product) {
		while (isAvaiable == true) {
			try {
				wait();
			} catch (Exception e) {

			}
			
		}
		isAvaiable = true;
		this.product = product;
		notifyAll();
	}
//	
//	private int contents;
//	   private boolean available = false;
//	   
//	   public synchronized int get() {
//	      while (available == false) {
//	         try {
//	            wait();
//	         } catch (InterruptedException e) {}
//	      }
//	      available = false;
//	      notifyAll();
//	      return contents;
//	   }
//	   public synchronized void put(int value) {
//	      while (available == true) {
//	         try {
//	            wait();
//	         } catch (InterruptedException e) { } 
//	      }
//	      contents = value;
//	      available = true;
//	      notifyAll();
//	   }
}

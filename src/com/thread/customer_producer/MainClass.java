//package com.thread.customer_producer;
//
//public class MainClass {
//
//	public static void main(String[] args) {
//		System.out.println("Customer and Product Synchronize");
//		StockManager manager = new StockManager();
//		Customer customer = new Customer(manager);
//		Producer producer = new Producer(manager);
//
//		new Thread(customer).start();
//		new Thread(producer).start();	
//	}
//
//}

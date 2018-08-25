//package com.thread.synchronize;
//
//public class MainClass {
//
//	public static void main(String[] args)
//{
//	Order order = new Order();
//	order.foodItem = "Gulab Jamun";
//	
//	Waiter w1 = new Waiter(order);
//	Thread t1 = new Thread(w1,"Waiter - 1 ");
//	t1.start();
//	
//	Waiter w2 = new Waiter(order);
//	Thread t2 = new Thread(w2,"Waiter - 2 ");
//	t2.start();
//	
//	Cook c1 = new Cook(order);
//	Thread t3 = new Thread(c1,"Cook - 1 ");
//	t3.start();
//	}
//}

//package com.thread.callable;
//
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.Future;
//
//public class MainClass {
//
//	public static void main(String[] args) {
//		ExecutorService executorService = Executors.newSingleThreadExecutor();
//		try
//		{
//			System.out.println("10+20 Execute ");
//			CallableSum ThreadSum1=new CallableSum(10, 20);
//			Future sum1 = executorService.submit(ThreadSum1);
//			
//			System.out.println("30+40 Execute ");
//			CallableSum ThreadSum2=new CallableSum(30, 40);
//			Future sum2 = executorService.submit(ThreadSum2);
//			
//			System.out.println("70+80 Execute ");
//			CallableSum ThreadSum3=new CallableSum(70, 80);
//			Future sum3 = executorService.submit(ThreadSum3);
//			
//			System.out.println("Sum of 10+20 : "+ sum1.get());
//			System.out.println("Sum of 30+40 : "+ sum2.get());
//			System.out.println("Sum of 70+80 : "+ sum3.get());
//		}
//		catch(Exception e)
//		{}
//	}
//}

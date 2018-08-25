package com.thread.lifecycle;

public class MainClass {

	public static void main(String[] args)
	{
		
		// Runnable Life cycle Example
		RunnableLifeCycle  runEx = new RunnableLifeCycle();
		runEx.start();
		
//		// Thread Life Cycle Example
//		ThreadLifeCycle lifeCycle = new ThreadLifeCycle("Hello");
//		lifeCycle.start();		
	}
}

package com.thread.callable;

import java.util.concurrent.Callable;

public class CallableSum implements Callable<Integer>{

	int val1,val2;
	public CallableSum(int val1,int val2)
	{
		this.val1= val1;
		this.val2= val2;
	}
	
	@Override
	public Integer call() throws Exception {
		Thread.sleep(5000);
		return val1+val2;
	}
}

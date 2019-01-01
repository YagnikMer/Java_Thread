import java.util.concurrent.*;

public class CallableSum implements Callable<Integer>{

	int val1,val2;
	public CallableSum(int val1,int val2)
	{
		this.val1= val1;
		this.val2= val2;
	}
	
	@Override
	public Integer call() throws Exception {
		Thread.sleep(2000);
		return val1+val2;
	}

 	public static void main(String[] args) {
  		ExecutorService executorService = Executors.newSingleThreadExecutor();
 		try
 		{
 			System.out.println("10+20 Execute ");
 			CallableSum ThreadSum1=new CallableSum(10, 20);
 			Future sum1 = executorService.submit(ThreadSum1);
            System.out.println("Sum of 10+20 : "+ sum1.get());
 			
 			System.out.println("30+40 Execute ");
 			CallableSum ThreadSum2=new CallableSum(30, 40);
 			Future sum2 = executorService.submit(ThreadSum2);
 			System.out.println("Sum of 30+40 : "+ sum2.get());

 			System.out.println("70+80 Execute ");
			CallableSum ThreadSum3=new CallableSum(70, 80);
			Future sum3 = executorService.submit(ThreadSum3);			
			System.out.println("Sum of 70+80 : "+ sum3.get());
		}
		catch(Exception e)
		{}
    }
}


//10+20 Execute 
//Sum of 10+20 : 30
//30+40 Execute 
//Sum of 30+40 : 70
//70+80 Execute 
//Sum of 70+80 : 150


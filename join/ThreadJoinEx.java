class ThreadEx implements Runnable 
{
	@Override
	public void run() {
		for (int i=0;i<10;i++)
		{   
            try
            {
            Thread.sleep(1000);
            }
            catch(Exception e){}
			System.out.println(Thread.currentThread().getName() +" : " + i);
		}
	}
}

public class ThreadJoinEx
{
    public static void main(String[] args)
    {
     		// With Join Method
			System.out.println("MAIN START");
			ThreadEx thread1 = new ThreadEx();
			Thread t1 = new Thread(thread1);
			Thread t2 = new Thread(thread1);
			try
            {
 			t1.start();
 			t1.join(1000);
  			t2.start();
  			t2.join(1000);
            System.out.println("MAIN END");
            }
            catch(Exception e){}
    }
}

//MAIN START
//Thread-0 : 0
//MAIN END
//Thread-1 : 0
//Thread-0 : 1
//Thread-1 : 1
//Thread-0 : 2
//Thread-1 : 2
//Thread-0 : 3
//Thread-1 : 3
//Thread-0 : 4
//Thread-1 : 4
//Thread-0 : 5
//Thread-1 : 5
//Thread-0 : 6
//Thread-1 : 6
//Thread-0 : 7
//Thread-1 : 7
//Thread-0 : 8
//Thread-1 : 8
//Thread-0 : 9
//Thread-1 : 9


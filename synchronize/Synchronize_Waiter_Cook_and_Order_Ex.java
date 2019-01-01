class Order 
{
	public volatile String foodItem;
}

class Waiter implements Runnable 
{
	private Order order;
	public Waiter(Order order)
	{
		this.order = order;
	}
	public void run() {
		
		synchronized (order) {
			System.out.println(Thread.currentThread().getName() + " Place order Successfully");
			try
			{
				System.out.println(Thread.currentThread().getName() +" Waiting of order ready..!!");
				order.wait();
			}
			catch(Exception e)
			{
				
			}	
			System.out.println(Thread.currentThread().getName() +" Order Served");
		}		
	};
}

class Cook implements Runnable
{
	private Order order;
	public Cook(Order order)
	{
		this.order = order;
	}
	public void run() {
			System.out.println(Thread.currentThread().getName() +" order Receiverd");
			try
			{
				Thread.sleep(10000);
				synchronized (order) {
					System.out.println(Thread.currentThread().getName()+" Preaparing Order");
					order.notifyAll();	
				}
			}
			catch(Exception e)
			{
			}	
			System.out.println(Thread.currentThread().getName()+" Order Ready");	
	};
}

public class Synchronize_Waiter_Cook_and_Order_Ex
{
    public static void main(String[] args)
    {
     	Order order = new Order();
     	order.foodItem = "Gulab Jamun";
     	
     	Waiter w1 = new Waiter(order);
     	Thread t1 = new Thread(w1,"Waiter - 1 ");
     	t1.start();
     	
     	Waiter w2 = new Waiter(order);
     	Thread t2 = new Thread(w2,"Waiter - 2 ");
     	t2.start();
     	
     	Cook c1 = new Cook(order);
     	Thread t3 = new Thread(c1,"Cook - 1 ");
     	t3.start();
    }
}

//Cook - 1  order Receiverd
//Waiter - 1  Place order Successfully
//Waiter - 1  Waiting of order ready..!!
//Waiter - 2  Place order Successfully
//Waiter - 2  Waiting of order ready..!!
//Cook - 1  Preaparing Order
//Cook - 1  Order Ready
//Waiter - 1  Order Served
//Waiter - 2  Order Serve

class StockManager {
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
}

class Producer implements Runnable {

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
				Thread.sleep(2000);
			} catch (Exception e) {}
		}
	}
}

class Customer implements Runnable {	
	StockManager stock;
	public Customer(StockManager stock) {
		this.stock = stock;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			String product = stock.getProduct();
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
			}
			System.out.println("Customer : "+product);
		}
	}
}

public class Customer_Producer_Thread_Ex
{
    public static void main(String[] args)
    {
 		System.out.println("Customer and Product Synchronize");
 		StockManager manager = new StockManager();
 		Customer customer = new Customer(manager);
 		Producer producer = new Producer(manager);
 
 		new Thread(customer).start();
 		new Thread(producer).start();	
    }
}


//Customer and Product Synchronize
//Producer : apple
//Producer : banana
//Customer : apple
//Producer : grape
//Producer : jack fruit
//Customer : banana
//Producer : water belon
//Customer : grape
//Producer : guave
//Customer : jack fruit
//Producer : custed apple
//Customer : water belon
//Producer : dragen fruit
//Customer : guave
//Producer : sapota
//Customer : custed apple
//Producer : butter fruit
//Customer : dragen fruit
//Customer : sapota
//Customer : butter fruit



class RunnableCycle implements Runnable {

	public RunnableCycle() {
		System.out.println("NEW");
	}

	public void start() {
		System.out.println("START");
		Thread thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		System.out.println("RUNNABLE");
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println("RUNNING : " + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("ERROR : " + e.getMessage());
		}
		System.out.println("DEAD");
	}
}

public class RunnableLifeCycle
{
    public static void main(String[] args)
    {
		// Runnable Life cycle Example
		RunnableCycle  runEx = new RunnableCycle();
		runEx.start();
    }
}


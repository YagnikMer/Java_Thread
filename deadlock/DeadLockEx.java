class Massage {
	public String msg = "msg";
}

class Thread1 implements Runnable {

	Massage massage1, massage2;

	public Thread1(Massage massage1, Massage massage2) {
		this.massage1 = massage1;
		this.massage2 = massage2;
	}

	@Override
	public void run() {

		synchronized (massage1) {
			try {
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName() + " : Lock on object 1");
			} catch (Exception e) {
			}
			System.out.println(Thread.currentThread().getName() + " : Waiting for object 2");
			synchronized (massage2) {
				try {
					System.out.println(Thread.currentThread().getName() + " : Wating for Lock Object 1 & Object 2");
				} catch (Exception e) {
				}
			}
		}
	}
}

class Thread2 implements Runnable {

	Massage massage1, massage2;

	public Thread2(Massage massage1, Massage massage2) {
		this.massage1 = massage1;
		this.massage2 = massage2;
	}

	@Override
	public void run() {

		synchronized (massage2) {
			try {
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName() + " : Lock on object 2");
			} catch (Exception e) {
			}
			System.out.println(Thread.currentThread().getName() + " : Waiting for object 1");
			synchronized (massage1) {
				try {
					System.out.println(Thread.currentThread().getName() + " : Wating for Lock Object 1 & Object 2");
				} catch (Exception e) {
				}
			}
		}
	}
}

public class DeadLockEx
{
    public static void main(String[] args)
    {
		Massage massage1 = new Massage();
		Massage massage2 = new Massage();		
		new Thread (new Thread1(massage1, massage2)).start();
		new Thread (new Thread2(massage1, massage2)).start();
    }
}

//Thread-0 : Lock on object 1
//Thread-1 : Lock on object 2
//Thread-0 : Waiting for object 2
//Thread-1 : Waiting for object 1


package multithreaddingtopic.byextendingthread;

public class MyThread1 extends Thread
{
	@Override
	public void run() 
	{
		// Thread---job 
//		System.out.println("Hello, I am Thread : " + Thread.currentThread().getName());
		
		for (int i = 1; i <=3; i++) 
		{
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getId() + "----" + Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("In Main");
		
		MyThread1 myThread1 = new MyThread1();
		MyThread1 myThread2 = new MyThread1();
		MyThread1 myThread3 = new MyThread1();
		MyThread1 myThread4 = new MyThread1();
		MyThread1 myThread5 = new MyThread1();
		
		myThread1.setName("C Language");
		myThread2.setName("C++ Language");
		myThread3.setName("CoreJava Language");
		myThread4.setName("Python Language");
		myThread5.setName("Jsp-Servlet Language");
		
		myThread1.setPriority(Thread.MAX_PRIORITY);
		myThread2.setPriority(Thread.MAX_PRIORITY);
		myThread3.setPriority(Thread.MAX_PRIORITY);
		myThread4.setPriority(Thread.NORM_PRIORITY);
		myThread5.setPriority(Thread.MIN_PRIORITY);
		
		
		myThread1.start();// job ---execute
//		try 
//		{
////			myThread1.join();
//			myThread1.join(2000);
//		} catch (InterruptedException e) 
//		{
//			e.printStackTrace();
//		}
		
		myThread2.start();// job ---execute
		myThread3.start();// job ---execute
		myThread4.start();// job ---execute
		myThread5.start();// job ---execute
	}
}

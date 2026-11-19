package multithreaddingtopic.byrunnableinterface;

public class MyThread1 implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println("MyThread--run()---"+Thread.currentThread().getName());
	}

	public static void main(String[] args) 
	{
		MyThread1 t1 = new MyThread1();
		MyThread1 t2 = new MyThread1();
		MyThread1 t3 = new MyThread1();
		
		Thread thread1  = new Thread(t1);
		Thread thread2  = new Thread(t2);
		Thread thread3  = new Thread(t3);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

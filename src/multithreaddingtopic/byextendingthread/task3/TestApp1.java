package multithreaddingtopic.byextendingthread.task3;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Table resource = new Table();
		
		MyThread1 thread1 = new MyThread1(resource, 5);
		MyThread2 thread2 = new MyThread2(resource, 10);
		MyThread3 thread3 = new MyThread3(resource, 15);
		
		thread1.start();
	    thread2.start();
		thread3.start();
	}
}

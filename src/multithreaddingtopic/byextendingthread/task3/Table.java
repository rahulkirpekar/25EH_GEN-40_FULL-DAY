package multithreaddingtopic.byextendingthread.task3;

public class Table 
{
	// resource---Threadsafe
	public synchronized void printTable(int no) 
	{
		for (int i = 1; i <=10; i++) 
		{
			System.out.println(Thread.currentThread().getName()+"---"+no+" * " + i + " = "+ (no*i));
			
			try 
			{
				Thread.sleep(500);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}

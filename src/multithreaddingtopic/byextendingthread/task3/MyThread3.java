package multithreaddingtopic.byextendingthread.task3;

public class MyThread3 extends Thread
{
	Table t = null;
	int no;
	public MyThread3(Table t,int no) 
	{
		this.t = t;
		this.no = no;
		
	}
	@Override
	public void run()
	{
		t.printTable(no);
	}	
}

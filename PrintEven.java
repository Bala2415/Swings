package threads;

public class PrintEven extends Thread{
	public void run()
	{
		for(int i=10; i<=40; i+=2)
		{
			System.out.println(i);
			try
			{
			Thread.sleep(200);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}

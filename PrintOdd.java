package threads;

public class PrintOdd implements Runnable{
	public void run()
	{
		for(int i=101; i<=130; i+=2)
			System.out.println(i);
	}
}

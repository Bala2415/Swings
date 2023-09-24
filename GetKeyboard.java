package threads;

import intro.Keyboard;

public class GetKeyboard extends Thread{
	Keyboard k;
	GetKeyboard(Keyboard k)
	{
		
		this.k = k;
	}
	public void run()
	{
		synchronized(k)
		{
			try
			{
				System.out.println("Waiting for reading...");
			k.wait();
			System.out.println("Notification received...");
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			k.get();
		}
	}
}

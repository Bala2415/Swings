package threads;

import java.util.Scanner;

public class Train extends Thread{
	static int birth=5;
	int t;
	
	synchronized public void run()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Tickets Wanted..for  " + Thread.currentThread().getName()+" ; " );
		t = s.nextInt();
		if(t<=birth)
		{
			birth -= t;
			System.out.println("Tickets Reserved..for..." + Thread.currentThread().getName());
			
		}
		else
		{
			System.out.println("Not Available..for..." + Thread.currentThread().getName());
		}
	}
	
}

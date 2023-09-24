package threads;

import java.util.Scanner;
import java.util.Vector;

public class RemoveVector implements Runnable{
	Vector<String> v;
	public RemoveVector(Vector<String> v) {
		// TODO Auto-generated constructor stub
		this.v = v;
	}
	public void run()
	{
		Scanner s = new Scanner(System.in);
		synchronized(v)
		{
		System.out.println("Enter the name to be removed: ");
		if(v.remove(s.nextLine()))
			System.out.println("Name Removed Successfully...");
		else
			System.out.println("No Such Name..");
		}
	}

}

package threads;
import java.util.Scanner;
import java.util.Vector;
public class AddVector extends Thread{
	java.util.Vector<String> v;
	public AddVector(java.util.Vector<String> v) {
		// TODO Auto-generated constructor stub
		this.v = v;
	}
	public void run()
	{
		Scanner s = new Scanner(System.in);
		synchronized(v)
		{
		System.out.println("Enter the name: ");
		v.add(s.nextLine());
		}
	}
}

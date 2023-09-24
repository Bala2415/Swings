package threads;
import intro.Keyboard;
public class SetKeyboard extends Thread{
	Keyboard k;
	public SetKeyboard(Keyboard k) {
		// TODO Auto-generated constructor stub
		this.k = k;
	}
	public void run()
	{
		synchronized(k)
		{
		k.set();
		System.out.println("Redy to read...");
		k.notify();
		
		}
	}
}

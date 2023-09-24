package relations;

public class Out {
	int x=20;
	void get()
	{
		System.out.println("x = " + x);
	//	System.out.println("y = " + y);
	}
	private class In
	{
		int y=200, x=1000;
		void get()
		{
			System.out.println("\ny = " + y);
			System.out.println("\nx = " + x + "\nOuter x = " + Out.this.x);
		}
	}
	void accessIn()
	{
		In r1 = new In();
		r1.get();
	}
}

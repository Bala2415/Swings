package relations;

public class NestedOut {
	int x=20;
	void get()
	{
		System.out.println("\nx = " + x);
	}
	class In
	{
		int y=200;
		void get()
		{
			System.out.println("\ny = " + y);
		}
	}
}

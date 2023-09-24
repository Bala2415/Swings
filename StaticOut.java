package relations;

public class StaticOut {
	int x=20;
	static int z=1000;
	void get()
	{
		System.out.println("\nx = " + x);
	}
	static class In
	{
		int y=200;
		void get()
		{
			System.out.println("\ny = " + y + "\nz = "  +z);
		}
	}
}

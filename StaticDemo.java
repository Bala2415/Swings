package constructors;

public class StaticDemo {
	int x, y;
	StaticDemo()
	{
		s1++;
	}
	static int s1;
	/**
	 * @param args
	 */
	static void trial()
	{
		//System.out.println(x);
		System.out.println("This is a static method");
	}
	static void access(StaticDemo obj)
	{
		System.out.println(obj.x + "  " + obj.y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo.trial();
		StaticDemo.access(new StaticDemo());
		StaticDemo o1 = new StaticDemo();
		StaticDemo o2 = new StaticDemo();
		System.out.println("Total Objects: " + StaticDemo.s1);
		Frames.main(new String[3]);
	}

}

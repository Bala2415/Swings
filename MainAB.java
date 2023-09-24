package inheritance;
import constructors.AAA;

class A {
	protected int x=10;
	void show()
	{
		System.out.println("I am A");
	}
}

class B extends A
{
	void display()
	{
		System.out.println("I am B");
		show();
		System.out.println(x);
	}
}
class C extends AA
{
	
}

class D extends AAA
{
	greet()
}
public class MainAB
{
	public static void main(String[] args)
	{
		B obj = new B();
		obj.display();
		obj.show();
		C o2 = new C();
		o2.message();
		D o3 = new D();
		o3
	}
			
}


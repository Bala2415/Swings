package relations;

public class Rectangle {
	float l, b, a;
	Rectangle(Line o1, Line o2)
	{
		l = o1.s;
		b = o2.s;
		a = l*b;
	}
	void get()
	{
		System.out.println("Area of the rectangle with length " + l +" and breadth " + b + " : " + a);
	}
}

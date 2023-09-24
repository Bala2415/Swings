package constructors;

public class Frames {
float l, b, a, p; // m[][], m = new int[r][c]
public Frames()
{
	System.out.println("Frame created...");
	l=10;
	b=20;
}
public Frames(float l, float b)
{
	this.l = l;
	this.b = b;
}
public Frames(Frames obj)
{
	l = obj.l;
	b= obj.b;
}

public void get()
{
	System.out.println("Sides of the frame: " + l + " & " + b);
	a = l*b;
	p = 2*(l+b);
	System.out.println("\nArea: " + a + "\nPerimeter: " + p);
	
}

public static void main(String[] args)
{
	Frames f1 = new Frames();
	f1.get();
	Frames f2 = new Frames(15, 30);
	f2.get();
	Frames f3 = new Frames(f2);
	f3.get();
	/*Frames f4 = Frames.getFrames();
	f4.get();*/
}
}

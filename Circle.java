package interfaces;

import java.util.Scanner;

public class Circle implements TwoShapes{
	float s1, a, c;
	
	public void set()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("\nEnter the radius: ");
		s1 = s.nextFloat();
	}
	public float getArea() {
		// TODO Auto-generated method stub
		a = pi * s1*s1;
		return a;
	}

	@Override
	public float getCircumferene() {
		// TODO Auto-generated method stub
		c = 2*pi*s1;
		return c;
	}

}

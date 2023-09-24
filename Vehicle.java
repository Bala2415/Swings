package abstrcts;

import java.util.Scanner;

public abstract class Vehicle {
	String nm;
	abstract void tell();
	void set()
	{
		System.out.println("Name of the vihicle: ");
		Scanner s = new Scanner(System.in);
		nm = s.nextLine();
	}
	
	
	
}

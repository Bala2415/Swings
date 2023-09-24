package relations;

import java.util.Scanner;

public class Line {
	float s;
	void set()
	{
			System.out.println("Length of the line: ");
			Scanner s1 = new Scanner(System.in);
			s = s1.nextFloat();
	}
	void get()
	{
		System.out.println("Length: " + s);
	}
}

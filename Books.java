package exceptions;

import java.util.InputMismatchException;

public class Books {
	String nm;
	int pr;
	void set()
	{
		java.util.Scanner s = new java.util.Scanner(System.in);
		java.util.Scanner ss = new java.util.Scanner(System.in);
		try
		{
		System.out.println("Name Of the Book; ");
		nm = s.nextLine();
		System.out.println("Price; ");
		pr = ss.nextInt();
		}
		catch(InputMismatchException e)
		{
			throw e;
		}
	}
	void get()
	{
			System.out.println(nm + " " + pr);
	}
}

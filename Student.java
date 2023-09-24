package exceptions;

import java.util.InputMismatchException;

public class Student {
	String nm;
	int tot;
	void set() throws InvalidMarkException
	{
		System.out.println("Enter Student Name and total: ");
		java.util.Scanner s = new java.util.Scanner(System.in);
		java.util.Scanner ss = new java.util.Scanner(System.in);
		try
		{
		nm = s.nextLine();
		tot = ss.nextInt();
		if(tot<0 || tot>500)
		{
			tot=0;
			throw new InvalidMarkException("Total Out Of Range");
		}
		}
		catch(InvalidMarkException e)
		{
			throw e;
		}
		catch(InputMismatchException e)
		{
			throw e;
		}
	}
	void get()
	{
		System.out.println(nm + "  " + tot);
	}
	public static void main(String[] args)
	{
		Student s1 = new Student();
		try
		{
		s1.set();
		}
		catch(InvalidMarkException e)
		{
			System.out.println(e);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter numbers only");
		}
		s1.get();
	}
}

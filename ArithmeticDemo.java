package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner s;
		boolean flag =true;
		do
		{
		try
		{
			s = new Scanner(System.in);
		System.out.println("Etner 2 nos.: ");
		a = s.nextInt();
		b = s.nextInt();
		System.out.println(a/b);
		flag = false;
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid Input");
		}
		catch(ArithmeticException e)
		{
			//System.out.println(e);
			//e.printStackTrace();
			System.out.println("Divisor should not be zero");
		}
		}
		while(flag);
		System.out.println("End");
	}

}

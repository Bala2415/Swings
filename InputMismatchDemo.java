package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		
		Scanner s = new Scanner(System.in);
		try
		{
		System.out.println("Enter a whole no. : ");
		a = s.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter whole numbers only...");
		}
		System.out.println("Thank You!");
	}

}

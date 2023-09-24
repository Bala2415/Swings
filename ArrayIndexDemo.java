package exceptions;

import java.util.Scanner;

public class ArrayIndexDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n[] = new int[5];
		System.out.println("Enter 5 nods.:");
		for(int i=0; i<5; i++)
		{
			n[i] = s.nextInt();
			
		}
		try
		{
		System.out.println("Enter the position: ");
		int p= s.nextInt();
		System.out.println("Value at  " + p + " is " + n[p-1]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("No Such Position");
		}
		
	}

}

package exceptions;

import java.util.Scanner;

public class StringIndexDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner s = new Scanner(System.in);
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the name: ");
		str = s.nextLine();
		try
		{
		System.out.println("Enter the position: ");
		int p = ss.nextInt();
		System.out.println(str.charAt(p-1));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("No Such Position");
		}
	}

}

package exceptions;

import java.io.BufferedReader;
import java.io.IOException;

public class NumberFormatDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int x;
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		try
		{
		System.out.println("Enter a no.; ");
		x = Integer.parseInt(br.readLine());
		System.out.println("x = "  +x);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Enter whle nos. only...");
		}
		System.out.println("Bye!");
	}

}

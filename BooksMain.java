package exceptions;

import java.util.InputMismatchException;

public class BooksMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books ref = new Books();
		try
		{
		ref.set();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid Price");
		}
		ref.get();
	}

}

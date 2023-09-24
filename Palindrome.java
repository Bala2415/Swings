package strings;

import java.util.Scanner;

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str;
			Scanner s = new Scanner(System.in);
			System.out.println("Etner a word: ");
			str = s.nextLine();
			StringBuffer sb1 = new StringBuffer(str);
			sb1.reverse();
			if(sb1.toString().equalsIgnoreCase(str))
				System.out.println("Palindrome");
			else
				System.out.println("Non Palindrome");
	}

}

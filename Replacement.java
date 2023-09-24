package strings;

import java.util.Scanner;

public class Replacement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1, str2;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the word: ");
		StringBuffer sb1 = new StringBuffer(s.nextLine()); //GokulaKannan
		System.out.println("Enter the word to be replaced: ");
		str1 = s.nextLine();//Kan
		System.out.println("New Word: ");
		str2 = s.nextLine();
		sb1.replace(sb1.indexOf(str1), sb1.indexOf(str1)+str1.length(), str2);
		System.out.println("After Replacement " + sb1);
	}

}

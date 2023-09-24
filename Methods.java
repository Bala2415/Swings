// palindrome
// contains a particular word or character
// get a word and remove that word from sb
// get a word and replace the word ==> gopala vittala das, vittala , hari==>Gopala hari das
package StringBufferDemo;

import java.util.Scanner;

public class Methods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer("Uma maheshwar");
		StringBuffer sb2 = new StringBuffer();
		String str ;
		Scanner s = new Scanner(System.in);
		Scanner ss = new Scanner(System.in);
		/*
		str = s.nextLine();
		sb2.append(str);
		System.out.println(sb2);
		*/
		/*
		System.out.println("Emnter a word to insert: ");
		str = s.nextLine();
		
		System.out.println("Enter the position: ");
		int p= ss.nextInt();
		sb2.insert(p, str);
		System.out.println(sb2);
		System.out.println("Enter the positions to be removed: ");
		p = ss.nextInt();
		int p2 = ss.nextInt();
		sb2.delete(p, p2);
		System.out.println(sb2);
		sb2.reverse();
		System.out.println(sb2);
		*/
		/*
		System.out.println(sb1 + "  " + sb2);
		if(sb1.toString().equalsIgnoreCase(sb2.toString()))
			System.out.println("Same");
		else
			System.out.println("Not Same");
		if(sb1.toString().compareToIgnoreCase(sb2.toString()) == 0)
			System.out.println("Same");
		else
			System.out.println("Not Same");
		System.out.println("Index Of : " + sb1.indexOf("esh"));
		System.out.println("Last Index Of : " + sb1.lastIndexOf("e"));
		*/
		int p1 = ss.nextInt();
		int p2 = ss.nextInt();
		sb1.replace(p1, p2, "hema");
		System.out.println(sb1);
	}

}

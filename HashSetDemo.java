package collections;

import java.util.Scanner;

public class HashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.HashSet<String> hs = new java.util.HashSet<String>();
		String str;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 5 words:");
		for(int i=0; i<5; i++)
		{
			str = s.nextLine();
			hs.add(str);
		}
		System.out.println(hs);
		for(String x: hs)
			System.out.println(x);
		System.out.println("Enter the word to be removed: ");
		hs.remove(s.nextLine());
		System.out.println(hs);
		System.out.println(hs.contains("a"));
		hs.size();
		hs.clear();
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
	}

}

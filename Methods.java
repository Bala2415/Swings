package strings;

import java.util.Scanner;

public class Methods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-geni";erated method stub
		/*
		String s1 = "Mani"//1234
		System.out.println(s1);
		String s2="Rajesh";//2345
		System.out.println(s2);
		s1 = s2;	//2345
		System.out.println(s1);
		*/
		String s1 = new String();
		//String s2= new String("Ram");
		Scanner s = new Scanner(System.in); 
		s1 = s.nextLine();
		/*
		String s3 = s1 + "Kumar";
		System.out.println(s3);
		System.out.println("Uppercase: " + s1.toUpperCase());
		//System.out.println(s1);
		System.out.println("Lowercase: " + s1.toLowerCase());
		System.out.println(" Character At 3: "  + s1.charAt(3));
		System.out.println("Index Of: " + s1.toUpperCase().indexOf("e".toUpperCase()));
		System.out.println("Last Index Of: " + s1.lastIndexOf("e"));
		System.out.println("Starts with ram: " + s1.startsWith("Ram"));
		System.out.println("Ends With gupta: " + s1.endsWith("gupta"));
		*/
		/*
		System.out.println("substring: " + s1.substring(3));
		System.out.println("Substring: " + s1.substring(3, 8));
		char ch[] = s1.toCharArray();
		for(char x: ch)
			System.out.println(x);
		*/
		String p[] = s1.split(",");
		for(String x: p)
			System.out.println(x);
	}

}

package arrays;

import java.util.Scanner;

public class One {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		/*
		int n[]=new int[5];
		
		System.out.println("Enter 5 nos.; ");
		for(int i=0; i<5; i++)
			n[i] = s.nextInt();
		for(int i=0; i<5; i++)
			System.out.println(n[i]);
		*/
		
		int n[];
		System.out.println("Size of the list: ");
		/*
		int x = s.nextInt();
		n = new int[x];
		System.out.println("Enter " + x + " values: ");
		*/
		n = new int[s.nextInt()];
		for(int i=0; i<n.length; i++)
			n[i] = s.nextInt();
		for(int i=0; i<n.length; i++)
			System.out.println(n[i]);
	}

}

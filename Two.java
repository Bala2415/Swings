package arrays;

import java.util.Scanner;

public class Two {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n[][] = new int[3][2];
		int n[][];
		Scanner s = new Scanner(System.in);
		/*
		for(int i=0;i<3; i++)
		{
			System.out.println("Row " + (i+1) + " : ");
			for(int j=0; j<2;j++)
				n[i][j] = s.nextInt();
		}
		for(int i=0; i<3; i++)
		{
			System.out.println();
			for(int j=0; j<2; j++)
				System.out.print(n[i][j] + " ");
		}
		*/
		/*
		System.out.println("Rows: ");
		int r = s.nextInt();
		System.out.println("Columns: ");
		int c = s.nextInt();
		n = new int[r][c];
		for(int i=0; i<r; i++)
		{
			System.out.println("Row " + (i+1) + " : ");
			for(int j=0; j<c; j++)
				n[i][j] = s.nextInt();
		}
		for(int i=0; i<r; i++)
		{
			System.out.println();
			for(int j=0; j<c; j++)
				System.out.print(n[i][j] + " ");
		}
		*/
		/*
		System.out.println("Enter no.. of rows & columns: ");
		n = new int[s.nextInt()][s.nextInt()];
		for(int i=0; i<n.length; i++)
		{
			System.out.println("Row " + (i+1) + " : ");
			for(int j=0; j<n[i].length; j++)
				n[i][j] = s.nextInt();
		}
		for(int i=0; i<n.length; i++)
		{
			System.out.println();
			for(int j=0; j<n[i].length; j++)
				System.out.print(n[i][j] + " ");
		}
		*/
		System.out.println("Rows: ");
		n = new int[s.nextInt()][];
		for(int i=0; i<n.length; i++)
		{
			System.out.println("Columns in Row " + (i+1) + " : ");
			n[i] = new int[s.nextInt()];
		}
		for(int i=0; i<n.length; i++)
		{
			System.out.println("Enter " + n[i].length + " elements for Row " + (i+1) + " : ");
			for(int j=0; j<n[i].length; j++)
				n[i][j] = s.nextInt();
		}
		for(int i=0; i<n.length; i++)
		{
			System.out.println();
			for(int j=0; j<n[i].length; j++)
				System.out.print(n[i][j] + " ");
		}
				
	}

}

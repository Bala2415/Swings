package arrays;

import java.util.Scanner;

public class ThreeDynamic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[][][];
		Scanner s = new Scanner(System.in);
		System.out.println("No. Of Matrix: ");
		int m = s.nextInt();
		System.out.println("No. Of Rows: ");
		int r = s.nextInt();
		System.out.println("No. Of Columns: ");
		int c = s.nextInt();
		n = new int[m][r][c];
		for(int i=0; i<m; i++)
		{
			System.out.println("Enter 6 elements to Matrix " + (i+1) + " : ");
			for(int j=0; j<r; j++)
				for(int k=0; k<c; k++)
					n[i][j][k] = s.nextInt();
					
		}
		for(int i=0; i<m; i++)
		{
			System.out.println();
			for(int j=0; j<r; j++)
			{
				System.out.println();
				for(int k=0; k<c; k++)
					System.out.print(n[i][j][k] + "  ");
			}
		}
		
	}

}

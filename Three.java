package arrays;

import java.util.Scanner;

public class Three {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[][][];
		int n[][][] = new int[2][3][2];
		Scanner s = new Scanner(System.in);
		for(int i=0; i<2; i++)
		{
			System.out.println("Enter 6 elements to Matrix " + (i+1) + " : ");
			for(int j=0; j<3; j++)
				for(int k=0; k<2; k++)
					n[i][j][k] = s.nextInt();
					
		}
		for(int i=0; i<2; i++)
		{
			System.out.println();
			for(int j=0; j<3; j++)
			{
				System.out.println();
				for(int k=0; k<2; k++)
					System.out.print(n[i][j][k] + "  ");
			}
		}
		
		
	}

}

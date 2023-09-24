package intro;

import java.util.Scanner;

public class Matrix {
	int m[][] = new int[2][3];
	void set()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter elements to M(2*3):\n");
		for(int i=0; i<2; i++)
			for(int j=0; j<3; j++)
				m[i][j] = s.nextInt();
	}
	void set(int m[][])
	{
		for(int i=0; i<2; i++)
			for(int j=0; j<3; j++)
				this.m[i][j] = m[i][j];
	
	}
	void get()
	{
		for(int i=0; i<2; i++)
		{
			System.out.println();
			for(int j=0; j<3; j++)
				System.out.print(m[i][j] + "  ");
		}
	}
	int[][] getTranspose()
	{
		//int t[][] = new int[3][2];
		int t[][] = new int[m[0].length][m.length];
		for(int i=0; i<t.length; i++)
			for(int j=0; j<t[i].length; j++)
				t[i][j]= m[j][i];
		return t;
	}
	
}

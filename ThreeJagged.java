package arrays;

import java.util.Scanner;

public class ThreeJagged {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m[][][];
		Scanner s = new Scanner(System.in);
		System.out.println("No. Of Matrix: ");
		m = new int[s.nextInt()][][];
		for(int i=0; i<m.length; i++)
		{
			System.out.println("Matrix " + (i+1));
			System.out.println("Rows: ");
			m[i] = new int[s.nextInt()][];
			for(int j=0; j<m[i].length; j++)
			{
				System.out.println("Columns is Row " + (j+1));
				m[i][j] = new int[s.nextInt()];
			}
		}
		System.out.println("Memory Allocated Successfully");
		
		for(int i=0; i<m.length; i++)
		{
			System.out.println("Matrix " + (i+1));
			for(int j=0; j<m[i].length; j++)
			{
				System.out.println("Enter " + m[i][j].length + " for Row " + (j+1));
				for(int k=0; k<m[i][j].length; k++)
					m[i][j][k] = s.nextInt();
			}
		}
		for(int i=0; i<m.length; i++)
		{
			System.out.println("\nMatrix " + (i+1));
			for(int j=0; j<m[i].length; j++)
			{
				System.out.println();
				for(int k=0; k<m[i][j].length; k++)
					System.out.print(m[i][j][k] +"  " );
			}
		}
	}

}

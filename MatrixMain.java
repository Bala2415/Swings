package intro;

import java.util.Scanner;

public class MatrixMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix m1 = new Matrix();
		Scanner s = new Scanner(System.in);
		/*
		m1.set();
		m1.get();
		int t[][]=m1.getTranspose();
		System.out.println("\nTranspose Matrix");
		for(int i=0; i<t.length; i++)
		{
			System.out.println();
			for(int j=0; j<t[i].length; j++)
				System.out.print(t[i][j] + "  ");
		}
		*/
		int m[][] = new int[2][3];
		System.out.println("Enter elements to m(2*3):");
		for(int i=0; i<2; i++)
			for(int j=0; j<3; j++)
				m[i][j] = s.nextInt();
		m1.set(m);
		m1.get();
		
	}

}

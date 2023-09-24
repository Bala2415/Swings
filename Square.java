package calculations;

import java.util.Scanner;

public class Square {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the side of square");
		a=s.nextFloat();
		b=a*a;
		System.out.println("Area="+b);

	}

}

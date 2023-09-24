package Loop;

import java.util.Scanner;

public class FibonacciSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner (System.in);
int i, n=1, b, a;
/*
a=s.nextInt();
b=s.nextInt();
System.out.println("Find the Base and Power");
System.out.println(a+ "  " + b);
for (i=1;i<=b; i++)
n=n*a;
System.out.println(n+ " ");
*/
System.out.println("Enter the base & power:");
a = s.nextInt();
b= s.nextInt();
n=1;
for(i=1; i<=b; i++)
	n=n*a;
System.out.println(a + " power " + b + " : " + n);

	}

}

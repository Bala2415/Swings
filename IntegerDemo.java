package wrapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/*
 * equals
 * compareto
 * parseInt, 
 * valueOf()
 * toString()
 * 
 * Math
 * sin(rad)
 * cos
 * tan(rad)
 * log()
 * log10()
 * pow(a,b)
 * min(a, b)
 * max(a, b)
 * random()
 * toRadians(deg)
 * toDegrees(rad)
 * ceil(dec)
 * floor(2.3)==>2
 */
public class IntegerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		/*
		Integer n1 = 10;
		Integer n2 = new Integer(100);
		Integer n3 = new Integer("1000");
		Integer n4;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a No.: ");
		n4 = Integer.parseInt(br.readLine());
		System.out.println(n4);
		if(n2.equals(n4))
				System.out.println("Equal");
		else
			System.out.println("Not Equal");
		System.out.println("Octal Form: " + Integer.toOctalString(n4));
		System.out.println("HexaDecimal Form; " + Integer.toHexString(n4));
		System.out.println("Binary Form: " + Integer.toBinaryString(n4));
		Integer n5 = Integer.valueOf("10000");
		System.out.println(n5);
		*/
		int deg=90;
		System.out.println("sin 90 " + Math.sin(Math.toRadians(deg)));
	}

}


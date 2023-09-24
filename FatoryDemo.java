package intro;

import java.text.NumberFormat;
import java.util.Scanner;
import constructors.Frames;
import calculations.Square;
public class FatoryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		float c, a, b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 nos.: ");
		a = s.nextFloat();
		b=s.nextFloat();
		c = a/b;
		System.out.println(c);
		NumberFormat obj = NumberFormat.getNumberInstance();	// factory method
		obj.setMaximumFractionDigits(2);
		obj.setMinimumFractionDigits(1);
		obj.setMinimumIntegerDigits(5);
		System.out.println("Formatted Answer: " + obj.format(c));
		*/
		Frames obj = new Frames();
		obj.get();
		
	}

}

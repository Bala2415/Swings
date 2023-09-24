package calculations;
import java.util.Scanner;
public class Rectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float l, b, a;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length and breadth: ");
		l = s.nextFloat();
		b=s.nextFloat();
		a = l*b;
		System.out.println("Area: " + a);
	}

}

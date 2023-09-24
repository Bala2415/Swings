package intro;

import java.util.Scanner;

public class Studentmain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		String nm;
		int m[] = new int[5];
		Scanner s = new Scanner(System.in);
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter name and 5 marks: ");
		nm = s.nextLine();
		for(int i=0; i<5; i++)
			m[i] = ss.nextInt();
		s1.set(nm, m);
		s1.get();
		System.out.println("Percentage is " + s1.getPercentage());
	}

}

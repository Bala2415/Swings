package strings;

import java.util.Scanner;

public class ListNames {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[] = new String[5];
		String str;
		Scanner s = new Scanner(System.in);
		System.out.println("Etner 5 names: ");
		for(int i=0; i<5; i++)
			name[i] = s.nextLine();
		System.out.println("Etner the starting word: ");
		str = s.nextLine();
		for(int i=0; i<5; i++)
			if(name[i].startsWith(str))
				System.out.println(name[i]);
	}

}

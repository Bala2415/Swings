package intro;

import java.util.Scanner;

public class List {
	private String nm[];
	void set()
	{
		Scanner s = new Scanner(System.in);
		Scanner ss = new Scanner(System.in);
		System.out.println("How many members: ");
		nm = new String[ss.nextInt()];
		System.out.println("Enter " + nm.length + " names: ");
		for(int i=0; i<nm.length; i++)
			nm[i] = s.nextLine();
	}
	String[] getNames(String str)
	{
		String newList[] = new String[nm.length];
			int j=0;
			for(int i=0; i<nm.length; i++)
			{
				if(nm[i].endsWith(str))
				{
					newList[j] = nm[i];
					j++;
				}
			}
			return newList;
	}
	
	void get()
	{
		System.out.println("List:");
		for(int i=0; i<nm.length; i++)
			System.out.println(nm[i]);
	}
}

package intro;

import java.util.Scanner;

public class Listsmain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String x;
	Scanner s = new Scanner(System.in);
	Scanner ss = new Scanner(System.in);
	List l1 = new List();
	l1.set();
	l1.get();
	System.out.println("Find the Names: ");
	x = s.nextLine();
	String y[] = l1.getNames(x);
	for(int i=0; i<y.length; i++)
	{
		if(y[i]==null)
			break;
		System.out.println(y[i]);
	}
		
	
	
	
	
	
 
 
	}




	

}

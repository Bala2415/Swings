package collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		Scanner s = new Scanner(System.in);
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the id and name of 5 employees: ");
		for(int i=0; i<5; i++)
		{
			hm.put(ss.nextInt(), s.nextLine());
		}
		System.out.println(hm);
		System.out.println("Enter the id: ");
		System.out.println(hm.get(ss.nextInt()));
		System.out.println("Enter the key to be removed: ");
		hm.remove(ss.nextInt());
		System.out.println(hm);
		Set<Integer> ks = hm.keySet();
		for(Integer x: ks)
			System.out.println(x);
		Collection<String> col = hm.values();
		System.out.println(col);
		
	}

}

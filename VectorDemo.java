package collections;

import java.util.Scanner;
import java.util.Vector;

public class VectorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>();
		Scanner s = new Scanner(System.in);
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter 5 words: ");
		for(int i=0; i<5; i++)
			v.add(s.nextLine());
		System.out.println(v);
		System.out.println("Enter position and word: ");
		v.add(ss.nextInt()-1, s.nextLine());
		System.out.println(v);
		System.out.println("Enter the word to be removed: ");
		v.remove(s.nextLine());
		System.out.println(v);
		System.out.println("Enter the position of the word to be removed: ");
		v.remove(ss.nextInt()-1);
		System.out.println(v);
		System.out.println("Enter the position of the word to be replaced &  new word: ");
		v.set(ss.nextInt()-1, s.nextLine());
		System.out.println(v);
		Object str[] = v.toArray();
		for(Object x:str)
			System.out.println(x);
	}

}

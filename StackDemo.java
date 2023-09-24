package collections;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 5 nos.: ");
		for(int i=0; i<5; i++)
			st.push(s.nextInt());
		System.out.println(st);
		for(Integer x: st)
			System.out.println(x);
		st.pop();
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println("Enter a no. to search:");
		System.out.println(st.search(s.nextInt()));
		
	}

}

package threads;

import java.util.Vector;

public class MainVector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v1 = new Vector<String>();
		v1.add("Kavin");
		v1.add("Mahesh");
		AddVector av = new AddVector(v1);
		RemoveVector rv = new RemoveVector(v1);
		Thread t1 = new Thread(av);
		Thread t2 = new Thread(rv);
		t1.start();
		t2.start();
		
	}
}

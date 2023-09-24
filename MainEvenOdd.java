package threads;

public class MainEvenOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintEven o1 = new PrintEven();
		PrintOdd o2 = new PrintOdd();
		Thread t1 = new Thread(o1);
		Thread t2 = new Thread(o2);
		t1.start();
		t2.start();
		try
		{
		t1.join();
		t2.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("End");
	}

}

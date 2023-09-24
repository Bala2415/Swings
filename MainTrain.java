package threads;

public class MainTrain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Train t1 = new Train();
		Thread th1 = new Thread(t1);
		th1.setName("A");
		Thread th2 = new Thread(t1);
		th2.setName("B");
		th1.start();
		th2.start();
		
	}

}

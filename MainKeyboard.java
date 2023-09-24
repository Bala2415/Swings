package threads;

import intro.Keyboard;

public class MainKeyboard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Keyboard k = new Keyboard();
		SetKeyboard sk = new SetKeyboard(k);
		GetKeyboard gk = new GetKeyboard(k);
		Thread t1 = new Thread(sk);
		Thread t2 = new Thread(gk);
		t2.setPriority(10);
		t1.start();
		t2.start();
	}

}

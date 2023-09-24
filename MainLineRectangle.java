package relations;

public class MainLineRectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line l1 = new Line();
		l1.set();
		Line l2 = new Line();
		l2.set();
		Rectangle r1 = new Rectangle(l1, l2);
		r1.get();
		

	}

}

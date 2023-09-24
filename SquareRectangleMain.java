package intro;

public class SquareRectangleMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Square s1 = new Square();
		
		s1.set();
		s1.get();
		Rectangle r1 = new Rectangle();
		r1.set();
		r1.get();
		*/
		
		Rectangle r1 = new Rectangle();
		r1.set();
		r1.get();
		Square s1 = new Square();
		s1.set(r1);
		s1.get();
		Square s2 = s1.getBig();
		s2.get();
	}

}

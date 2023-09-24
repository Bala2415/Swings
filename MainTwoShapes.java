package interfaces;

public class MainTwoShapes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoShapes ref;
		ref = new Circle();
		ref.set();
		System.out.println("Area: " + ref.getArea());
		System.out.println("Circumference: " + ref.getCircumferene());
		
		ref = new Rectangle();
		ref.set();
		System.out.println("Area: " + ref.getArea());
		System.out.println("Perimeter: " + ref.getCircumferene());
	}

}

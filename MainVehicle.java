package abstrcts;

public class MainVehicle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Bike b1 = new Bike();
		b1.set();
		Boat b2 = new Boat();
		b2.set();
		b1.tell();
		b2.tell();
		*/
		Vehicle v1;
		v1 = new Bike();
		v1.set();
		v1.tell();
		v1 = new Boat();
		v1.set();
		v1.tell();
		
	}

}

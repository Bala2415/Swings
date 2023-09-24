package relations;

public class MainNestedOut {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedOut r1 = new NestedOut();
		r1.get();
		NestedOut.In r2 = r1.new In();
		r2.get();
	}

}

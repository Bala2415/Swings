package intro;

public class Keyboard {
	private String company, model;
	private int pr;
	public void set()
	{
		java.util.Scanner s = new java.util.Scanner(System.in);
		java.util.Scanner ss = new java.util.Scanner(System.in);
		System.out.println("Company: ");
		company = s.nextLine();
		System.out.println("Model: ");
		model = s.nextLine();
		System.out.println("Price: ");
		pr = ss.nextInt();
	}
	public void get()
	{
		System.out.println(company + "   " + model + "   " + pr);
	}
	
}

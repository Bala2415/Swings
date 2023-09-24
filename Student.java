package intro;

public class Student {
	private String nm;
	private int m[] = new int[5];
	private float p;
	void set(String nm, int m[])
	{
		this.nm = nm;
		for(int i=0; i<5; i++)
			this.m[i] = m[i];
		calPercentage();
	}
	void calPercentage()
	{
		int tot=0;
		for(int i=0; i<5; i++)
			tot += m[i];
		p = tot/500.0f*100;
	}
	void get()
	{
		System.out.println(nm);
		for(int i=0; i<5;i++)
			System.out.println(m[i] + "  ");
	}
	float getPercentage()// int[]
	{
		return p;
	}
	
}

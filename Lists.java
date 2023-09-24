import java.util.Scanner;


public class Lists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n[][]=new int[3][2];

Scanner s=new Scanner (System.in);
for(int i=0; i<3; i++)
{
	System.out.println("Row" + (i+1)+ ":");
	for(int j=0; j<2; j++)
		n[i][j]=s.nextInt();
}
for (int i=0; i<3; i++)
	
{
	System.out.println();
	for(int j=0; j<2; j++)
		System.out.print (n[i][j]+ " ");

}


}

}

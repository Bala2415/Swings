import java.util.Scanner;


public class Twoarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner s=new Scanner (System.in);

int n,i;
System.out.println("Enter a no: ");
n=s.nextInt();
for (i=2; i<=n-1; i++)
	if (n % i ==0)
		break;
if (i<=n-1)
	System.out.println(n+"  Non Prime Number");
else
	System.out.println(n+"  Prime Number");
	}
}

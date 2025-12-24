import java.util.*;

public class Starter218Problem01
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int a = sc.nextInt();
	    int m = sc.nextInt();
	    int b = sc.nextInt();
	    
	    int buy = n*a;
	    int sell = m*b;
	    
	    System.out.println(sell-buy);

	}
}

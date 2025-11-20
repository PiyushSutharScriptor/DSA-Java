import java.util.*;

public class CodeChef1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int r = sc.nextInt();
		
		int res = (n-k)*r;
		System.out.println(res);

		sc.close();

	}
}

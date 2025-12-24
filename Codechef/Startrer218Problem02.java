import java.util.*;

public class Startrer218Problem02
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t!=0){
		    
		    int n = sc.nextInt();
		       
		    int ans = 0;
		    for(int i=0 ; i<n ; i++){
		        int x = sc.nextInt();
		        
		        ans += x*(i+1);
		    }
		    
		    System.out.println(ans);
		    t--;
		}

	}
}


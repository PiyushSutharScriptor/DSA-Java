import java.util.*;

public class Starter218Problem03
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t!=0){
		    
		    int n = sc.nextInt();
		    String str = sc.next();
		    int chef = 0;
		    int achef = 0;
		    int ans = 0;
		    
		    for(int i=0 ; i<n ; i++){
		        char x = str.charAt(i);
		        if(x=='0') achef++;
		        else chef++;
		        
		        if(chef>achef) ans++;
		    }
		    
		    System.out.println(ans);
		    
		    t--;
		}

	}
}

import java.util.*;

public class PrintPascalTriangleRowOptimized
{
	public static void main(String[] args) {
	    
	    int row = 6;
	    
	    int ans = 1; 
	    System.out.print(ans + " ");
	    
	    for(int i=1 ; i<row ; i++){
	        ans = ans * (row-i);
	        ans = ans/i;
	        System.out.print(ans+" ");
	    }
	    
	}
}
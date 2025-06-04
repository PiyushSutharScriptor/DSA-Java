import java.util.*;

public class PrintingWholePascalTriangleOptimized
{
	public static void main(String[] args) {
	    
	    int row = 6;
	    
	    int ans = 1; 
	    
	    
	    for(int j=1 ; j<=row ; j++){
	        ans = 1;
	       System.out.print(ans + " ");

    	    for(int i=1 ; i<j ; i++){
    	        ans = ans * (j-i);
    	        ans = ans/i;
    	        
    	        System.out.print(ans+" ");
    	    }
    	    System.out.println();
	    }
	}
}
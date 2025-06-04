import java.util.*;

public class FindElementInPascalTriangleByRowCol
{
    public static int factorial(int n){
        int result = 1;
        for(int i=1;i<=n;i++){
            result*=i;
        }
        return result;
    }
    
    
	public static void main(String[] args) {
	    
	    int row = 5;
	    int col = 3;
	    
	    /*
	        ncr = n!/(r!*(n-r)!)
	    */
	    
	    int n = row-1;
	    int r = col-1;
	    int d = n-r;
	    
	    int sol = factorial(n)/(factorial(r) * factorial(d));
	    
	    System.out.println("The element : " + sol);
	    
	}
}
import java.util.*;

public class FindElementByPascalTriangleBetter
{
    public static int functionNcr(int n , int r){
        int result = 1;
        for(int i=0;i<r;i++){
            result = result*(n-i);
            result = result/(i+1);
        }
        return result;
    }
    
    
	public static void main(String[] args) {
	    
	    int row = 5;
	    int col = 3;
	    
	    
	    int n = row-1;
	    int r = col-1;
	    
	    int sol = functionNcr(n,r);
	    
	    System.out.println("The element : " + sol);
	    
	}
}
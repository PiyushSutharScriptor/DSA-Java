import java.util.*;

public class PrintPascalTriangleRowBrute
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
	    
	    int row = 6;
	    int col = 3;
	    
	    int n = row-1;
	    
	    for(int i=0 ; i<row ; i++){
	        int sol = functionNcr(n,i);
	        System.out.print(sol + " ");
	    }
	    
	}
}
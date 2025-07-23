
public class CheckIfIthBitIsSetOptimizedRightShift
{
	public static void main(String[] args) {
	    int n = 13;
	    int i = 2;
	    
	    boolean res = false;
	    
	    int newNum = n>>i;
	    if((newNum&1)==1) res=true;

        // short form : 
        // if((n>>i)&1) res = true;

	    System.out.println(res);
	    
	   // Dry Run  : 
	   
	   /*
	   1. right shift the n by i.
	   2. apply & on newNum and 1. 
	   3. if the result is 1 then it is a valid set
	   4. if the result is 0 or greater than 1 , then it is
            not a valid set;
	   */
	}
}
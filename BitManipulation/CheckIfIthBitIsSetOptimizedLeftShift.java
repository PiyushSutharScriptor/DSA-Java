
public class CheckIfIthBitIsSetOptimizedLeftShift
{
	public static void main(String[] args) {
	    int n = 13;
	    int i = 2;
	    
	    boolean res = false;
	    
	    if((n&(1<<i))>0) res=true;
	    
	    System.out.println(res);
	    
	   // Dry Run  : 
	   
	   /*
	   1. Left shift the n by i.ṇ
	   2. apply & on newNum and n. 
	   3. if all the binary numbers results in 0
	        then it will return 0 and the ith bit is not set.
	   4. if it return >0 then it contains some number and it 
	        is a valid set.
	   */
	}
}
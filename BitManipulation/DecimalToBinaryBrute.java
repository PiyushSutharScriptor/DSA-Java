
public class DecimalToBinaryBrute
{
	public static void main(String[] args) {
	    
	    int n = 13;
        StringBuilder s = new StringBuilder("");
        
	    while(n!=0){
	        if(n%2==0) s.append('0');
	        else s.append('1');
	        n=n/2;
	    }
	    
	    System.out.println(s.reverse());

	}
}

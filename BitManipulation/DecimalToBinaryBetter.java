public class DecimalToBinaryBetter
{
	public static void main(String[] args) {
	    
	    int n = 13;
	    StringBuilder s = new StringBuilder("");
	    
	    while(n!=0){
	        int ans = n%2;
	        char ch = (char)(ans+'0');
	        s.append(ch);
	        n=n/2;
	    }
	    
	    System.out.println(s.reverse());

	}
}

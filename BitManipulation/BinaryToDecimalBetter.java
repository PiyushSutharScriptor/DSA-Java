
public class BinaryToDecimalBetter
{
	public static void main(String[] args) {
	    
	    String s = "1101";
	    
	    int res = 0;

	    for(int i=s.length()-1 ; i>=0 ; i--){
	        int digit = s.charAt(i)-'0';
	        res += ((Math.pow(2,s.length()-1-i)) * digit);
	    }
	    
	    System.out.println(res);

	}
}

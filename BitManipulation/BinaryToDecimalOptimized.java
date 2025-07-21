package BitManipulation;

public class BinaryToDecimalOptimized
{
	public static void main(String[] args) {
	    
	    String s = "1101";
	    
	    int res = 0;
	    int pow = 1;
        
	    for(int i=s.length()-1 ; i>=0 ; i--){
	        char digit = s.charAt(i);
	   
	        if(digit=='1') res+=pow;
	        
	        pow*=2;
	    }
	    
	    System.out.println(res);

	}
}

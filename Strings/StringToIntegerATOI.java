
public class StringToIntegerATOI
{
	public static void main(String[] args) {
	    String s = "   -23423";
	    int n = s.length();
	    int i=0;
	    int total = 0;
	    int sign = 1;
	    
	    while(i<n && s.charAt(i) == ' ') i++;

	    if(i<n && s.charAt(i)=='-'){
	        sign=-1;
	        i++;
	    }
	    else if(i<n && s.charAt(i)=='+'){
	        sign=1;
	        i++;
	    }
	    
	    while(i<n && Character.isDigit(s.charAt(i))){
	        int digit = s.charAt(i) - '0';
	        if(total>(Integer.MAX_VALUE)/10){
	            total = (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
	            break;
	        }
	        total = total*10+digit;
	        i++;
	    }
	    
	    System.out.println(total*sign);
	    
	}
}
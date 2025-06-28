import java.util.*;

public class ReverseStringBrute
{
	public static void main(String[] args) {
	    String str = "abcd";
	    
	    StringBuilder s = new StringBuilder();
	    
	    for(int i=str.length()-1 ; i>=0 ; i--){
	        char ch = str.charAt(i);
	        s.append(ch);
	    }
	    
	    System.out.println(s.toString());
	    
	}
}
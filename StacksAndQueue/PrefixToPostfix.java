import java.util.*;

public class PrefixToPostfix
{
	public static void main(String[] args) {
	    String s = "/-AB*+DEF";
	    
	    Stack<String> st = new Stack<>();
	    
	    for(int i=s.length()-1 ; i>=0 ; i--){
	        char ch = s.charAt(i);
	        
	        if((ch>='a' && ch<='z') ||
	           (ch>='A' && ch<='Z') ||
	           (ch>='0' && ch<='9') 
	            ){
	            st.push(Character.toString(ch));
	        }
	        else{
	            String a = st.pop();
	            String b = st.pop();
	            
				// MAIN LINE
	            String c = b+a+ch;
	            st.push(c);
	        }
	    }
	    
	    System.out.println(st.peek());
	}
}
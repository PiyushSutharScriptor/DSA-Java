import java.util.*;

public class PrefixToInfix
{
	public static void main(String[] args) {
	    String s = "*+PQ-MN";
	    
	    Stack<String> st = new Stack<>();
	    
	    for(int i=s.length()-1 ; i>=0; i--){
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
                
                String c = "("+a+ch+b+")";
                st.push(c);
            }
	    }
	    
	    System.out.println(st.peek());
	    
	}
}
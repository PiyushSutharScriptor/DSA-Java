import java.util.*;
public class PostfixToInfix
{
	public static void main(String[] args) {
	    String s = "AB-DE+F*/";
	    
	    Stack<String> st = new Stack<>();
	    
	    for(int i=0 ; i<s.length() ; i++){
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
	            String c = "("+b+ch+a+")";
	            st.push(c);
	        }
	    }
	    
	    for(String str : st){
	        System.out.println(str);
	    }

	}
}
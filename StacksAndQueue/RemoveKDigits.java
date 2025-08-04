import java.util.*;

public class RemoveKDigits{
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
	    
	    String s = "00143221900";
	    int k = 3;

        int count=0;

	    for(int i=0 ; i<s.length() ; i++){
            char n = s.charAt(i);
            
            while(!st.isEmpty() && st.peek()>n && count<k){
                st.pop();
                count++;
            }
            st.push(n);
	    }

        StringBuilder result = new StringBuilder();

        boolean lzero = true;
        for (char c : st) {
            if(lzero && c=='0') continue;
            lzero = false;
            result.append(c);
        }

        if(result.length()==0) System.out.println("0");
        System.out.println(result.toString());

    }
}
import java.util.*;

public class MinAddToMakeValidParanthesis{
    public static void main(String[] args) {
        String s  = "()))";
        int n = s.length();

        Stack<Character> st = new Stack<>();

        int count = 0;
        for(int i=0 ; i<n ; i++){
            char ch = s.charAt(i);
            if(ch=='('){
                st.add(ch);
            }
            else{
                if(!st.isEmpty()) st.pop();
                else count++;
            }
        }

        count+=st.size();

        System.out.println(count);
    }
}
import java.util.*;

public class BalancedParanthesisUsingStack {
    public static boolean checkBalance(String s){
        Stack<Character> st = new Stack<>();

        for(int i=0 ; i<s.length() ; i++){
          char c = s.charAt(i);
          
            if(c=='(' || c=='[' || c=='{'){
                st.push(c);
            } 
            else{
                if(st.isEmpty()) return false;

                char d = st.pop();
                
                if((d=='(' && c!=')') || (d=='[' && c!=']') || (d=='{' && c!='}')) return false;
                
            }
            
        }
        
        if(st.isEmpty()) return true;
        else return false;
    }
    public static void main(String[] args) {
        String s = "()[{}()";
        System.out.println(checkBalance(s));
    }
}

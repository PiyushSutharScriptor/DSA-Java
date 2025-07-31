import java.util.*;

public class InfixToPostFix {
    public static int priority(char ch){
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3; 
            default:
                return -1; 
        }
    }
    public static void main(String[] args) {
        String s = "a+b*(c^d-e)";

        Stack<Character> st = new Stack<>();
    
        String res = "";
        
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            
            if(
                (ch>='A' && ch<='Z') || 
                (ch>='a' && ch<='z') || 
                (ch>='0' && ch<='9')    
              ){
                  res+=ch;
            }
            else if(ch=='(') {
                st.push(ch);
            }
            else if(ch==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    res+=st.pop();
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && priority(ch)<priority(st.peek())){
                    res+=st.pop();
                }
                st.push(ch);
            }
        }
        
        while(!st.isEmpty()){
            res+=st.pop();
        }
        
        System.out.println(res);

    }
}

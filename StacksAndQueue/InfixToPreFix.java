import java.util.*;

public class InfixToPreFix {
    public static int priority(char ch){
        switch(ch){
            case '+' : 
            case '-' : 
                return 1;
                
            case '*' : 
            case '/' : 
                return 2;
                
            case '^' : 
                return 3;
            
            default : 
                return -1;
        }
    }
    
    public static void main(String[] args) {
        String s = "(A+B)*C-D+F";
        
        Stack<Character> st = new Stack<>();
        
        StringBuilder str = new StringBuilder(s);
        
        str.reverse();
        StringBuilder res = new StringBuilder();
        
        
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            
            if(
                (ch>='a' && ch<='z') || 
                (ch>='A' && ch<='Z') ||
                (ch>='0' && ch<='9')
            ){
                res.append(ch);
            }
            else if(ch==')'){
                st.push(ch);
            }
            else if(ch=='('){

                // note : this step is reversed, we can replace the brackets 
                // of '('with')' and ')'with'(' and keep this else if block 
                // same as the InfixToPostFix logic

                while(!st.isEmpty() && st.peek()!=')'){
                    res.append(st.pop());
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && priority(ch)<priority(st.peek())){
                    res.append(st.pop());
                }
                st.push(ch);
            }
        }
        
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        
        res.reverse();
        System.out.println(res);
    }
}

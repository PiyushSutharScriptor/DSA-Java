import java.util.*;

public class RemoveParanthesisLeetcode
{
    public static String stringFunction(String str){
        StringBuilder ans = new StringBuilder();
        
        int count = 0;
        
        for(char ch : str.toCharArray()){
            if(ch == '('){
                if(count>0){
                    ans.append(ch);
                }
                count++;
            }
            else{
                count--;
                if(count>0){
                    ans.append(ch);    
                }
            }
        }
        
        return ans.toString();
    }
    
	public static void main(String[] args) {
	    String str = "(()()())(())";
	    System.out.println(stringFunction(str));
	}
}
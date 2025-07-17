import java.util.*;
public class PalindromeSubSetsBetter
{
    public static void generateCombination(int idx, String s, List<List<String>> res,List<String> output){
        //case
        if(s==null || s.length()==0) return;
        
        //case
        if(idx==s.length()){
            res.add(new ArrayList<>(output));
            return;
        }
        
        for(int i=idx ; i<s.length() ; i++){
            if(isPalindrome(s,idx,i)){
                output.add(s.substring(idx,i+1));
                generateCombination(i+1,s,res,output);
                output.remove(output.size()-1);
            }
        }
        
    
    }
    
    public static boolean isPalindrome(String s , int start, int end){
        Boolean res = true;
        
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        
        return res;
    }
    
	public static void main(String[] args) {
	    String s = "aabb";
	    List<List<String>> res = new ArrayList<>();
	    generateCombination(0,s,res,new ArrayList<>());
	    
	    System.out.println(res);

	}
}
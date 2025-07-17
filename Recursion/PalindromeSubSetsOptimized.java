import java.util.*;
public class PalindromeSubSetsOptimized
{
    public static void generateCombination(int idx, String s, List<List<String>> res,List<String> output, boolean[][] dp){
        //case
        if(s==null || s.length()==0) return;
        
        //case
        if(idx==s.length()){
            res.add(new ArrayList<>(output));
            return;
        }
        
        for(int i=idx ; i<s.length() ; i++){
            if(s.charAt(idx)==s.charAt(i) && (i-idx<=2 || dp[idx+1][i-1]) ){
                dp[idx][i] = true;
                output.add(s.substring(idx,i+1));
                generateCombination(i+1,s,res,output,dp);
                output.remove(output.size()-1);
            }
        }
        
    
    }
    
    // public static boolean isPalindrome(String s , int start, int end){
    //     Boolean res = true;
        
    //     while(start<=end){
    //         if(s.charAt(start)!=s.charAt(end)){
    //             return false;
    //         }
    //         start++;
    //         end--;
    //     }
        
    //     return res;
    // }
    
	public static void main(String[] args) {
	    String s = "aabb";
	    List<List<String>> res = new ArrayList<>();
	    
	    boolean [][]dp = new boolean[s.length()][s.length()];
	    
	    generateCombination(0,s,res,new ArrayList<>(),dp);
	    
	    System.out.println(res);

	}
}
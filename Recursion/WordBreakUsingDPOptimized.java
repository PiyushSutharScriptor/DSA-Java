import java.util.*;
public class WordBreakUsingDPOptimized
{
	public static void main(String[] args) {

	    List<String> wordDict = new ArrayList<>();
	    wordDict.add("leet");
	    wordDict.add("code");
	    
	    String s = "leetcode";
	    
	    Set<String> word = new HashSet<>(wordDict);
	    
	    boolean []b = new boolean[s.length()+1];
	    
	    b[0] = true;
	    
	    for(int i=1 ; i<=s.length() ; i++){
	        for(int j=0 ; j<i ; j++){
                // here the i will be one greater then j to form the substring
	            if(b[j] && word.contains(s.substring(j,i))){
	                b[i]=true;
	                break;
	            }
	        }
	    }
	    
	    System.out.println(b[s.length()]);
	    
	}
}
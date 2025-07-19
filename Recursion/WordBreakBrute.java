import java.util.*;
public class WordBreakBrute
{
	public static void main(String[] args) {
	    String s = "leetcode";
	    List<String> wordDict = new ArrayList<>();
	    
	    wordDict.add("leet");
	    wordDict.add("code");
	    
	    int n = wordDict.size();
	    
	    int lCount = 0;
	    
	    StringBuilder str = new StringBuilder();
	    
        for(int i=0 ; i<s.length() ; i++){
            
            str.append(s.charAt(i));
            if(wordDict.contains(str.toString())){
                lCount++;
                str.setLength(0);
            }
        }
	    
	    if(lCount==n) System.out.println("found");
	    else System.out.println("not found");
	    
	    
	}
}
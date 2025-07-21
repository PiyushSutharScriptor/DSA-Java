import java.util.*;
public class ExpressionsAndOperatorsOptimized
{
    public static void findCombination(int idx, String path, long res, long prevNum, List<String> ans, String s , int target){
        if(idx==s.length()){
            if(res==target){
                ans.add(path);
                return;
            }
        }
        
        for(int i=idx ; i<s.length() ; i++){
            if(i>idx && s.charAt(i)=='0') break;
            
            long curr = Long.parseLong(s.substring(idx,i+1));
            
            if(idx==0){
                findCombination(i+1,path+curr,curr,curr,ans,s,target);
            }
            else{
                findCombination(i+1, path+"+"+curr, res+curr, curr, ans, s, target);
                findCombination(i+1, path+"-"+curr, res-curr, -curr ,ans, s, target);
                findCombination(i+1,path+"*"+curr, res-prevNum+(prevNum*curr), prevNum*curr,ans,s,target);
            }
        }
    }
	public static void main(String[] args) {
		String s = "123";
		int target = 6;
		
		List<String> ans = new ArrayList<>();
		
		findCombination(0,"",0,0,ans,s,target);
		
		System.out.println(ans);
	}
}
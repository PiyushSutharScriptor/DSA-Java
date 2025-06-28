import java.util.*;
public class IsomorphicStringOrNot
{
    public static boolean isomorphicString(String s1, String s2){
        int m = s1.length();
        int n = s2.length();
        
        if(m!=n) return false;
        
        Map<Character , Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        
        for(int i=0 ; i<m ; i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            
            if(map.containsKey(ch1)){
                if(map.get(ch1)!=ch2) return false; 
            }
            else{
                if(set.contains(ch2)) return false;
                map.put(ch1,ch2);
                set.add(ch2);
            }
        }
        
        return true;
        
    }
    
	public static void main(String[] args) {
	    System.out.println(isomorphicString("ge" , "br"));
	}
}
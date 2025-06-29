import java.util.*;
public class RomanToInteger
{
	public static void main(String[] args) {
	    
	    String s = "LVIII";
	    int total = 0;
	    int n = s.length();
	    
	    Map<Character , Integer> map = new HashMap<>();
	    map.put('I',1);
	    map.put('V',5);
	    map.put('X',10);
	    map.put('L',50);
	    map.put('C',100);
	    map.put('D',500);
	    map.put('M',1000);
	    
	    for(int i=0 ; i<n ; i++){
	        int current = map.get(s.charAt(i));
	        
	        if(i+1<n && current<map.get(s.charAt(i+1))){
	            total -= current;
	        }
	        else{
	            total += current;
	        }
	    }
	    
	    System.out.println(total);
	}
}
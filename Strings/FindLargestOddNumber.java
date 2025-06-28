import java.util.*;
public class FindLargestOddNumber
{
    public static String largestOdd(String n){
        for(int i=n.length()-1 ; i>=0 ; i--){
            char ch = n.charAt(i);
            if((ch-'0')%2==1){
                return n.substring(0,i+1);
            }
        }
        return "";
    }
    
	public static void main(String[] args) {
	    String n = "456786";
	    String ans = largestOdd(n);
	    System.out.println(ans);
	}
}
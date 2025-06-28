import java.util.*;
public class RotateStringToFormString
{
    public static boolean rotateString(String s ,String goal){
        if(s.length() != goal.length()) return false;
        
        String dou = s+s;
        
        return dou.contains(goal);
    }
	public static void main(String[] args) {
	    System.out.println(rotateString("abcde" , "cdeab"));
	    System.out.println(rotateString("abcde" , "abced"));
	}
}
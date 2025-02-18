import java.util.Scanner;

class Solution {
    
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for(int i=0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                str.append(Character.toLowerCase(c));
            }
        }
        
        int left = 0;
        int right = str.length()-1 ;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}

public class PalindromeOfSentenceLeetcode{
    public static void main(String[]args){
        
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter string : ");
    String s = sc.nextLine();
    
    Solution s1 = new Solution();
    boolean res = s1.isPalindrome(s);
    System.out.println(res);
    
    }
}
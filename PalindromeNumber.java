import java.util.Scanner;
class Solution {
    public boolean isPalindrome(int x) {
        int reverseNumber=0;
        int originalNumber=x;
        int digit=0;
        while(x!=0 && x>0){
            digit = x%10;
            reverseNumber = reverseNumber*10+digit;
            x = x/10;
        }
        if(reverseNumber==originalNumber){
            return true;
        }
        else{
            return false;
        }
    }
}
public class PalindromeNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x = ");
        int x = input.nextInt();

        Solution s1 = new Solution();
        System.out.println(s1.isPalindrome(x));
    }
}
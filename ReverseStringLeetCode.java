import java.util.Scanner;
class Solution {
    public void reverseString(char[] s) {
        int start=0;
        int end=s.length-1;
        while(start<end){
            char ch = s[start];
            s[start] = s[end];
            s[end] = ch;
            start++;
            end--;
        }
        for(char ch : s){
            System.out.print(ch);
        }
    }
}
public class ReverseStringLeetCode{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String : ");
        String c = input.nextLine();
        char [] s = c.toCharArray();
        Solution r1 = new Solution();
        r1.reverseString(s);
        input.close();
    }
}
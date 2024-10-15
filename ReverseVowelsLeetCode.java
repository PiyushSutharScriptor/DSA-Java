import java.util.Scanner;
class Solution {
    public String reverseVowels(String s) {
        char [] c = s.toCharArray();
        int i=0;
        int j=c.length-1;

        while (i<j){
            while(i<j && !isVowel(c[i])){
                i++;
            }

            while(i<j && !isVowel(c[j])){
                j--;
            }

            char ch = c[i];
            c[i] = c[j];
            c[j] = ch;
            i++;
            j--; 
        }
        return new String(c);
    }
    private boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
public class ReverseVowelsLeetCode{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = input.nextLine();
        Solution s1 = new Solution();
        System.out.print(s1.reverseVowels(s));
        input.close();
    }
}

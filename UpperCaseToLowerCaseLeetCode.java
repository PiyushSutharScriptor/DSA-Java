import java.util.Scanner;
class Solution {
    public String toLowerCase(String s) {
        char [] c = s.toCharArray();
        for(int i=0 ; i<c.length ; i++){
            char ch = c[i];
            if(ch>='A' && ch<='Z'){
                char res = (char)(ch-'A'+'a');
                c[i] = res;
            }
        }

        return new String(c);

    }
}
public class UpperCaseToLowerCaseLeetCode{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = input.nextLine();
        Solution s1 = new Solution();
        System.out.println(s1.toLowerCase(s));
        input.close();
    }
}
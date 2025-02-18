import java.util.Scanner;
public class PalindromeOfString {
    public static boolean checkpalindrome(String str , int i , int n){
        if(i>=n/2){
            return true;
        }
        if(str.charAt(i)!=str.charAt(n-i-1)){
            return false;
        }
        return checkpalindrome(str, i+1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();

        int n = str.length();
        System.out.println(checkpalindrome(str,0,n));

        sc.close();
    }
}

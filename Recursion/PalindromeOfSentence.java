import java.util.Scanner;

public class PalindromeOfSentence {

    public static String cleanString(String str){
        StringBuilder cleanedStr = new StringBuilder();
        for(int i=0 ; i<str.length() ; i++){
            char c = str.charAt(i);
            if(Character.isLetterOrDigit(c)){
                cleanedStr.append(Character.toLowerCase(c));
            }
        }
        return cleanedStr.toString();
    }

    public static boolean palindrome(int i , int n , String str){
        if(i >= n/2){
            return true;
        }
        if(str.charAt(i)!=str.charAt(n-i-1)){
            return false;
        }

        return palindrome(i+1, n, str);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();

        String cleanStr = cleanString(str);

        int n = cleanStr.length();

        System.out.println(palindrome(0, n, cleanStr));

        sc.close();
    }
}

public class PalindromeString2 {
    public static void main(String[] args) {
        
        String str = "madan";

        StringBuilder ans = new StringBuilder(str);
        ans.reverse();

        if(str.equals(ans.toString())){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

    }
}

public class PalindromeString {
    public static void main(String[] args) {
        String str = "madan";
        String ans = "";

        for(int i=str.length()-1 ; i>=0 ; i--){
            ans+=str.charAt(i);
        }

        if(str.equals(ans)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}

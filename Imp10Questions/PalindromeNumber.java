public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 1521;

        int ex = num;
        int ans = 0;

        while(num!=0){
            int digit = num%10;
            ans = ans*10+digit;
            num/=10;
        }

        if(ans==ex){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}

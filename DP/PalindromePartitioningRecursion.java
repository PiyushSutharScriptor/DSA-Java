public class PalindromePartitioningRecursion {

    public static int findWays(int i, int n, String str){
        if(i==n) return 0;

        String temp = "";
        int mini = Integer.MAX_VALUE;

        for(int j=i ; j<n ; j++){
            temp += str.charAt(j);
            
            if(isPalindrome(temp)){
                int cost = 1 + findWays(j+1, n, str);
                mini = Math.min(mini, cost);
            }

        }

        return mini;
    }

    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "ab"; 
        int n = str.length();

        int res = findWays(0,n,str);
        System.out.println(res-1);
    }
}

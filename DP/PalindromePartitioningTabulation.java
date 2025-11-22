public class PalindromePartitioningTabulation {

    public static int findWays(String str){

        int n = str.length();

        int[] dp = new int[n+1];

        for(int i=n-1 ; i>=0 ; i--){
            
            int mini = Integer.MAX_VALUE;
            String temp = "";

            for(int j=i ; j<n ; j++){
                temp += str.charAt(j);
                
                if(isPalindrome(temp)){
                    int cost = 1 + dp[j+1];
                    mini = Math.min(mini, cost);
                }

            }   

            dp[i] = mini;   
        }

        return dp[0]-1;
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
        String str = "aab"; 

        int res = findWays(str);
        System.out.println(res);
    }
}

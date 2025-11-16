import java.util.*;

public class LongestStringChainOpti {

    public static boolean compare(String s1, String s2){
        if(s1.length()!=s2.length()+1) return false;

        int first = 0;
        int second = 0;

        while(first<s1.length()){
            if(second < s2.length() && s1.charAt(first)==s2.charAt(second)) {
                first++;
                second++;
            }
            else{
                first++;
            }
        }

        return second == s2.length();
    }

    public static void main(String[] args) {
        String[] arr = {"dog", "dogs", "dots", "dot", "d", "do"};
        int n = arr.length;

        Arrays.sort(arr, Comparator.comparingInt(String::length));
        int[] dp = new int[n];
        Arrays.fill(dp,1);

        for(int i=1 ; i<n ; i++){
            for(int j=0 ; j<i ; j++){
                if(compare(arr[i],arr[j]) && dp[j]+1>dp[i]){
                    dp[i] = dp[j]+1;
                }
            }
        }

        int maxi = 0;
        for(int el : dp){
            maxi = Math.max(maxi,el);
        }

        System.out.println(maxi);
    }
}

// "dog", "dogs", "dots", "dot", "d", "do"
import java.util.*;

public class MinimumCoins{
    public static void main(String[] args) {
        int coins[] = {1,2,5,10,20,50,100,500,1000};
        int v = 87;

        int n = coins.length;

        Arrays.sort(coins);

        int i=0 ; 
        int j=n-1;

        while(i<j){
            int temp = coins[i];
            coins[i] = coins[j];
            coins[j] = temp;
            i++;
            j--;
        }

        int count = 0;
        for(int k=0 ; k<n ; k++){
            while(v>=coins[k] && v>0){
                v-=coins[k];
                count++;
            }
        }

        System.out.println(count);

    }
}
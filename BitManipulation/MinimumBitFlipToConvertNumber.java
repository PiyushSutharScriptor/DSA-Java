public class MinimumBitFlipToConvertNumber{
    public static void main(String[] args) {
        int n = 10;
        int goal = 7;

        int ans = n^goal;

        int count=0;
        while(ans>0){
            ans = ans&(ans-1);
            count++;
        }

        System.out.println(count);
    }
}
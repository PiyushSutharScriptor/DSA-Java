public class CountNoOfSetBitOpti2 {
    public static void main(String[] args) {
        int n = 13;

        int count = 0;
        while(n>0){
            if((n&1)==1) count++;

            // or : count+=(n&1) 
            n=n>>1;
        }

        System.out.println(count);
    }
}

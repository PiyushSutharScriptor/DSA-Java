public class CountNoOfSetBitBetter {
    public static void main(String[] args) {
        int n = 12;

        int count = 0;
        while(n>0){
            if(n%2==1) count++;
            n/=2;
        }

        System.out.println(count);
    }
}

public class SingleNumber2UsingXorBit {
    public static void main(String[] args) {
        int[] arr = {5,5,5,6,6,6,4,4,4,99};
 
        int ans = 0;
        for(int i=0 ; i<=31 ; i++){
            int count = 0;

            for(int idx=0 ; idx<arr.length ; idx++){
                if((arr[idx] & (1<<i))!=0) count++;
            }

            if((count%3)==1) ans+=Math.pow(2,i);
        }

        System.out.println(ans);
    }   
}

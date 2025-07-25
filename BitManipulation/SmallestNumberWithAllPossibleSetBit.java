public class SmallestNumberWithAllPossibleSetBit {
    public static void main(String[] args) {
        int n = 10;

        int num = 1;

        while(num-1<n){
            num = num<<1;
        }

        System.out.println(num-1);
    }
}

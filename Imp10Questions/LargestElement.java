public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {1,12,3,14,5};

        int ans = Integer.MIN_VALUE;

        for(int el : arr){
            if(ans<el){
                ans = el;
            }
        }

        System.out.println(ans);
    }
}

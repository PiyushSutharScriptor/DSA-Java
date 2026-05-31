public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {12,12,5,3,2};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int el : arr){
            if(el>first){
                second = first;    
                first = el;
            }
            else if(second<el && el!=first){
                second = el;
            }

        }

        System.out.println("First : " + first);
        System.out.println("Second : " + second);
    }
}

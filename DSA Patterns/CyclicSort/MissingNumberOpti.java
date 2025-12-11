
public class MissingNumberOpti {
    public static void main(String[] args) {
        int[] arr = {1,2,0,4};

        int xor1 = 0;
        int xor2 = 0;

        for(int i=0 ; i<arr.length ; i++){
            xor1 = xor1^arr[i];
            xor2 = xor2^(i+1);
        }

        System.out.println(xor1^xor2);

    }    
}

public class ToggleIthBitOptimized {
    public static void main(String[] args) {
        
        int n = 13;
        int i = 1;

        int res = n^(1<<i);

        System.out.println(res);

        /*
            Example  : 
            
            n=13 , i=1 

            1<<i = 0010
            13 = 1101 

            13 ^ 1<<i

            1 1 0 1
            0 0 1 0 
            --------
            1 1 1 1
            --------

            so 1111 = 15
        */
    }
}

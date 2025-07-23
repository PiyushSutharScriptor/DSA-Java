public class ClearIthBitOptimized {
    public static void main(String[] args) {
        int n = 13;
        int i = 2;

        // option : 1 
        int res = n&(~(1<<i));

        // option : 2 
        /*
            int newNum = ~(1<<i) 
            int res = n&newNum
        */
        
        System.out.println(res);
        
        // Steps :
        /*
            1. 1<<i
            2. ~(i<<i)
            3. apply & on n and ~(i<<i) = i.e., n&(~(1<<i))
        */
    }
}

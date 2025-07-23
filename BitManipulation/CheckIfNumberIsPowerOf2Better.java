public class CheckIfNumberIsPowerOf2Better {
    public static void main(String[] args) {
        int n = 12;

        boolean res = false;

        while(n%2==0){
            n/=2;
        }

        if(n==1) res = true;

        System.out.println(res);


        // Note : 
        /*
            the same logic is applied for 
                -> Power of 3
                -> Power of 4
            it is better approach 
            
            for optimized version you can go for 
            bit manipulation
        */
    }
}

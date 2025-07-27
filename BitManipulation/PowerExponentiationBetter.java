public class PowerExponentiationBetter {
    public static double powerExpo(int x , int n){

        int ans = 1;

        while(n!=0){
            //odd power
            if(n%2!=0){
                n-=1;
                ans*=x;
            }
            x*=x;
            n/=2;
        }

        return ans;
    }
    public static void main(String[] args) {
        int x = 9;
        int n = -3;

        System.out.println(powerExpo(x, n));
    }
}

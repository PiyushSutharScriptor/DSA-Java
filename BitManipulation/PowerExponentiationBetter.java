public class PowerExponentiationBetter {
    public static double powerExpo(int x , int n){
        boolean isNegative = false;

        if(n<0){
            n*=-1;
            isNegative = true;
        }

        double ans = 1.0;

        while(n!=0){
            //odd power
            if(n%2!=0){
                n-=1;
                ans*=x;
            }
            x*=x;
            n/=2;
        }

        if(isNegative){
            return 1.0/ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        int x = 9;
        int n = 3; //the code is modified and runs for -ve n also

        System.out.println(powerExpo(x, n));
    }
}

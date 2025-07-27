public class PowerExponentiationBrute {
    public static int powerExpo(int x , int n){
        int ans = 1;
        while(n!=0){
            ans*=x;
            n--;
        }

        return ans;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        System.out.println(powerExpo(x, n));
    }
}

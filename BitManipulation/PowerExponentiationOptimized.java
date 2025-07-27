public class PowerExponentiationOptimized {
    public static double powerExpo(int x , int n){
        
        return Math.pow(x,n);
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        System.out.println(powerExpo(x, n));
    }
}

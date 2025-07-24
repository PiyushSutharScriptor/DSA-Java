
public class LcmAndHcfOptimized
{
    public static int gcd(int a, int b){
        while(b!=0){
            int temp = a%b;
            a = b;
            b = temp;
        }   
        return a;
    }
    
    public static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }
    
	public static void main(String[] args) {
	   int a = 5;
	   int b = 3;
	   
	   System.out.println(gcd(a,b));
	   System.out.println(lcm(a,b));
	}
}
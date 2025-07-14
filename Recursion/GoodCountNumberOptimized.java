public class GoodCountNumberOptimized {
	static final int mod = 1_000_000_007;
	
	public static int countGood(int n){
	    long even = (n+1)/2;
	    long odd = n/2;
	    
	    long evenP = modPower(5,even);
	    long oddP = modPower(4,odd);
	    
	    return (int)((evenP*oddP)%mod);
	}
	
	public static long modPower(long base, long exp){
	    long res = 1;
	    
	    base %= mod;
	    while(exp>0){
	        if(exp%2==1){
	            res = (res*base) % mod;
	        }
	        base = (base*base)%mod;
	        exp/=2;
	    }
	    
	    return res;
	}
	
	public static void main(String[] args) {
	   int n = 4;
	   int res = countGood(n);
	   
	   System.out.println(res);
	}
}
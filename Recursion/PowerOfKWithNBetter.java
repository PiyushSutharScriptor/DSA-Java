public class PowerOfKWithNBetter {
    public static int powerOfK(int k, int n){
        if(n==0) return 1;
        return k*powerOfK(k, n-1);
    }
	public static void main(String[] args) {
		int n = powerOfK(3,3);
		System.out.println(n);
	}
}


public class PowerOfKWithNBrute
{
    public static int powerOfK(int k, int n){
        int res = 1;
        for(int i=0 ; i<n ; i++){
            res = res*k;
        }
        return res;
    }
	public static void main(String[] args) {
		int n = powerOfK(3,3);
		System.out.println(n);
	}
}
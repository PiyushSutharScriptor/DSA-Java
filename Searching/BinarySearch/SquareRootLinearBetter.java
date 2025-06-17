
public class SquareRootLinearBetter
{
	public static void main(String[] args) {
	    int n = 25;
	    int ans = 1;
	    for(int i=0 ; i<n ; i++){
	        if(i*i<=n){
	            ans = i;
	        }
	        else{
	            break;
	        }
	    }
	    
	    System.out.println(ans);
	}
}   
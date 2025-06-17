
public class SquareRootLinearBetter
{
	public static void main(String[] args) {
	    int n = 25;
	    int ans = 1;
	    for(int i=0 ; i<n ; i++){

			//when the ans crosses greater than i*i then return 
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
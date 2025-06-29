
public class SumOfBeautyOfAllSubStrings
{
	public static void main(String[] args) {
	    String s = "aabcb";
	    int n = s.length();
	    
	    int ans = 0;
	    
	    for(int i=0 ; i<n ; i++){
	        int arr[] = new int[26];
	        for(int j=i ; j<n ; j++){
	            arr[s.charAt(j) - 'a']++;
	            
	            int max = 0;
	            int min = Integer.MAX_VALUE;
	            
	            for(int f : arr){
	                if(f>0){
	                    max = Math.max(max,f);
	                    min = Math.min(min,f);
	                }
	            }
	            
	            ans += max-min;
	            
	        }
	    }
	    
	    System.out.println(ans);
	}
}
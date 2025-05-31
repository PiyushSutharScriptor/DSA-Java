
public class BestPriceToBuyAndSellStocks{
	public static void main(String[] args) {
	    int arr[] = {7,1,5,3,6,4};
	    int n = arr.length;
	    
	    int buy = Integer.MAX_VALUE;
	    
	    int maxProfit = 0;
	        

	        for(int i=0 ; i<n ; i++){
	            
    	        if(arr[i]<buy){
    	            buy = arr[i];
    	        }
    	        
    	        else{
    	            int profit = arr[i] - buy;
    	            if(profit>maxProfit){
    	                maxProfit = profit;
    	            }
    	        }
	        }
	    
	    
	    System.out.println("The profit : " + maxProfit);
	   
	    
	}
}